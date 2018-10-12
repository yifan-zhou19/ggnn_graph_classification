package SkipList;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * A sorted list with pointers skipping values to accelerate research.
 * @author Thomas MEDARD, Remi SEGRETAIN
 * @param <E> A generic {@link Comparable} type.
 */
public class SkipList<E extends Comparable<E>> extends AbstractSet<E>{
	
	/**
	 * The head of the {@link SkipList}.
	 */
	private Node<E> head;
	/**
	 * The maximum level for {@link Node} inside.
	 */
	private int levelMax;
	/**
	 * The size of the {@link SkipList}.
	 */
	private int size;
	
	/**
	 * This is used in insertion because modifying values in array doesn't work
	 */
	@SuppressWarnings("unchecked")
	private Node<E>[] nodesToModify = (Node<E>[]) new Node[levelMax];
	
	/**
	 * The current capacity of the {@link SkipList}. Will be increased automatically.
	 */
	private int capacity;
	
	/**
	 * Calculate the log in base 2.
	 * @param n The value to apply log2 on. Must be > 0.
	 * @return The result of log2(n).
	 */
	private static int log2(int n){
	    if(n <= 0) throw new IllegalArgumentException();
	    return 31 - Integer.numberOfLeadingZeros(n);
	}
	
	/**
	 * The constructor
	 */
	public SkipList () {
		this.size = 0;
		this.capacity = 1;
		this.levelMax = 1;
	}
	
	/**
	 * Ensure that the head has the max level.
	 * @param tail The tail of the {@link SkipList}.
	 */
	@SuppressWarnings("unchecked")
	private void ensureHeadMaxLevel(final Node<E> tail) {
		// Save previous nodes
		Node<E>[] lastHeadNodes = head.getNodes();
		head.setNodes((Node<E>[])new Node[levelMax]);
		
		// Take all saved nodes and put them back
		int i;
		for (i = 0; i < lastHeadNodes.length; ++i) {
			head.getNodes()[i] = lastHeadNodes[i];
		}
		// Then point all new pointers to the tail
		for (; i< head.getNodes().length; ++i) {
			head.getNodes()[i] = tail;
		}
	}
	
	/**
	 * If we exceed the current capacity then this is called.
	 */
	@SuppressWarnings("unchecked")
	private void increaseCapacity() {
		
		// If head hasn't been initialized (first insertion) then no more to do
		if (head == null) {
			this.capacity = size * 2;
			this.levelMax = log2(this.capacity);
			return;
		}
		
		// Find the tail
		Node<E> currentNode = head;
		while (currentNode.getNodes()[0] != null) {
			currentNode = (Node<E>)currentNode.getNodes()[levelMax - 1];
		}
		
		this.capacity = size * 2;
		this.levelMax = log2(this.capacity);
		
		// Ensure that levelMax is > 0
		if (levelMax < 1 ) {
			levelMax = 1;
		}
		
		// Make the tail having the new levelMax
		currentNode.setNodes((Node<E>[])new Node[levelMax]);
		
		// Ensure that the head has max level
		this.ensureHeadMaxLevel(currentNode);
	}
	
	/**
	 * Search a value inside the {@link SkipList}.
	 * @param keyToFind The value to look for.
	 * @return The value if found or null if it doesn't exist.
	 */
	@SuppressWarnings("unchecked")
	public E search (final E keyToFind) {		
		int currentLevel = levelMax - 1;
		Node<E> currentNode = this.head;
		nodesToModify = (Node<E>[])new Node[levelMax];
		
		while (true) {
			if (currentNode.getKey() == keyToFind) 
				return currentNode.getKey();
			
			// Check if we reach full end of list (bottom level and next is null)
			if (currentLevel < 0 || currentNode.getNodes()[0] == null) {
				return null;
			}
			
			// If the current key is inferior or equal the researched key
			if (currentNode.getNodes()[currentLevel].getKey().compareTo(keyToFind) <= 0) {
				currentNode = currentNode.getNodes()[currentLevel];
			}
			else {
				--currentLevel;
			}	
		}
	}
	
	/**
	 * Find for all level, the last pointers leading to an existing value inferior to {@code keyToFind}.
	 * If we find the last element (as the keyToFind) then path[0] = null, nodesToModify[0] = previousNode.
	 * @param key The key to find the path for.
	 * @return The path of this key.
	 * If we find the last element (as the keyToFind) the path[0] = null and nodesToModify[0] = previousNode.
	 */
	private Node<E>[] searchPathDelete(final E key) {
		int currentLevel = levelMax - 1;
		@SuppressWarnings("unchecked")
		Node<E>[] path = (Node<E>[])new Node[levelMax];
		Node<E> currentNode = this.head;
		while (currentLevel >= 0) {
			
			if (currentNode.getNodes()[currentLevel].getKey() == key) {
				
				// Check if research is about to finish and we search for the tail
				if (currentNode.getNodes()[currentLevel].getNodes()[currentLevel] == null && currentLevel == 0) {
					// If we find the last element then path[0] = null
					path[0] = null;
					nodesToModify[currentLevel] = currentNode;
					
					return path;
				}
				
				path[currentLevel] = currentNode.getNodes()[currentLevel];
				nodesToModify[currentLevel] = currentNode;
				--currentLevel;		
			}
			else if (currentNode.getNodes()[currentLevel].getKey().compareTo(key) > 0){
				--currentLevel;		
			}
			else {
				currentNode = currentNode.getNodes()[currentLevel];
			}
		}
		
		return path;
	}
	
	/**
	 * Delete the head {@link Node} and replace it with the next one.
	 * @return true
	 */
	@SuppressWarnings("unchecked")
	private boolean deleteHead() {
		Node<E> newHead = head.getNodes()[0];
		Node<E>[] nextNodes = newHead.getNodes();
		
		newHead.setNodes((Node<E>[])new Node[levelMax]);
		
		int i;
		// First we get all heads pointers needed by the new head (all that are above)
		for (i = levelMax - 1; head.getNodes()[i] != newHead; --i) {
			newHead.getNodes()[i] = head.getNodes()[i];
		}
		// Then we put the leftovers that it already had.
		for (; i >= 0; --i) {
			newHead.getNodes()[i] = nextNodes[i];
		}
		
		head = newHead;
		
		--size;
		return true;
	}
	
	/**
	 * Delete the tail of the {@link SkipList}. nodesToModify[0] must be the element before the tail and
	 * nodesToModify must point to all Node that should be modified.
	 * @return true
	 */
	@SuppressWarnings("unchecked")
	private boolean deleteTail() {
		// If we delete the tail then we know the nodesToModify[0] will contain the previous element.
		nodesToModify[0].setNodes((Node<E>[])new Node[levelMax]);
		
		for (int i = 1; i < levelMax; ++i) {
			
			nodesToModify[i].getNodes()[i] = nodesToModify[0];
		}
		
		--size;
		return true;
	}
	
	/**
	 * Make sure that after a suppression, {@link SkipList#levelMax} is not too high.
	 * So this will also reduce too high nodes.
	 */
	private void updateMaxLevelOnSupression() {
		
		// Recalculate LevelMax
		int newLevelMax = log2(this.size);
		
		// If the level hasn't change then there nothing else to do.
		if (newLevelMax == this.levelMax) {
			return;
		}
		
		this.levelMax = newLevelMax;
		
		// Loop through all nodes and reduce size of there nodes if needed
		Node<E> currentNode = head;
		
		while (currentNode.getNodes()[0] != null) {
			
			if (currentNode.getNodes().length > this.levelMax) {
				@SuppressWarnings("unchecked")
				Node<E> newNodes[] = (Node<E> []) new Node[this.levelMax];
				
				for (int i = 0; i < newNodes.length; ++i) {
					newNodes[i] = currentNode.getNodes()[i];
				}
				
				currentNode.setNodes(newNodes);
			}
			
			currentNode = currentNode.getNodes()[0];
		}
	}
	
	/**
	 * Delete a key from the {@link SkipList}.
	 * @param key The key to delete
	 * @return true if removal completed of false if key doesn't exist.
	 */
	public boolean delete(final E key) {
		// If key doesn't exist in the SkipList
		if (this.search(key) == null) {
			return false;
		}
		
		// If there is only the head
		if (head.getNodes()[0] == null) {
			head = null;
			--size;
			return true;
		}
		
		// If we delete the head
		if (key == head.getKey()) {
			return this.deleteHead();
		}
		
		Node<E>[] path = searchPathDelete(key);
		
		// If path[0] == null then we know that we delete the tail
		if (path[0] == null) {
			return this.deleteTail();
		}
		
		// Standard Node suppression
		for (int i = 0; i < path.length; ++i) {
			if (path[i] == null) {
				break;
			}
			
			nodesToModify[i].getNodes()[i] = path[i].getNodes()[i];
		}
		
		updateMaxLevelOnSupression();
		
		--size;
		return true;
	}
	
	/**
	 * Find for all level, the last pointers leading to an non existing (where it should be placed)
	 *  value inferior to {@code keyToFind}.
	 * If we find the last element (as the keyToFind) the path[0] = null and nodesToModify[0] = tailNode.
	 * @param node The node wich will be inserted.
	 * @return An array with all pointers leading to the value.
	 * If we find the last element (as the keyToFind) the path[0] = null and nodesToModify[0] = tailNode.
	 */
	private Node<E>[] searchPathAdd(final Node<E> node) {
		int currentLevel = node.getNodes().length - 1;
		@SuppressWarnings("unchecked")
		Node<E>[] path = (Node<E>[])new Node[node.getNodes().length];
		Node<E> currentNode = this.head;
		
		while (currentLevel >= 0) {
			
			// If we find the last element then return the last element
			// instead of null pointers
			if (currentNode.getNodes()[currentLevel] == null) {
				path[0] = null;
				nodesToModify[0] = currentNode;
				
				return path;
			}
			
			else if (currentNode.getNodes()[currentLevel].getKey().compareTo(node.getKey()) > 0){
				path[currentLevel] = currentNode.getNodes()[currentLevel];
				nodesToModify[currentLevel] = currentNode;
				--currentLevel;
			}
			else {
				currentNode = currentNode.getNodes()[currentLevel];
			}
		}
		
		return path;
	}
	
	/**
	 * Ensure that {@link SkipList#size} + 1 > {@link SkipList#capacity}.
	 */
	private void ensureCapacity() {
		if (this.size + 1 > this.capacity) {
			this.increaseCapacity();
		}
	}
	
	/**
	 * Make the first insertion.
	 * @param key The key to insert.
	 * @return true.
	 */
	private boolean firstInsertion(final E key) {
		Node<E> node = new Node<E>(key, levelMax);
		
		@SuppressWarnings("unchecked")
		Node<E>[] headsNodes = (Node<E>[])new Node[levelMax];
		
		node.setNodes(headsNodes);
		head = node;
		
		++size;
		
		return true;
	}
	
	/**
	 * Insert before the head. (Change head value and create a new node with last head value).
	 * @param key The key to insert.
	 * @return true.
	 */
	private boolean insertNewHead(final E key) {
		E headKey = head.getKey();
		head.setKey(key);
		
		return this.add(headKey);
	}
	
	/**
	 * Insert a new Tail.
	 * @param key The key to insert.
	 * @param newNode The newly created {@link Node}.
	 * @return true.
	 */
	private boolean insertNewTail(final E key, final Node<E> newNode) {
		
		// If secondInsertion, we need to prevent a ping-pong effect with insertNewHead.
		if (nodesToModify[0] == head) {
			
			@SuppressWarnings("unchecked")
			Node<E>[] tailesNodes = (Node<E>[])new Node[levelMax];
			// We now that if we insert after the last element, then
			// nodesToModify[0] will contains this last element (instead of null pointer)
			for (int i = 0; i < levelMax; ++i) {
				nodesToModify[0].getNodes()[i] = newNode;
			}
			
			newNode.setNodes(tailesNodes);
			
			++size;
			return true;
		}
		
		E tailKey = nodesToModify[0].getKey();
		nodesToModify[0].setKey(key);
		
		if (tailKey.equals(key)) {
			return false;
		}
		
		return this.add(tailKey);
	}
	
	/**
	 * Add a value to the {@link SkipList}.
	 * @param key The value to add.
	 * @return true id added, false otherwise (key already exists).
	 */
	public boolean add(final E key) {
		
		this.ensureCapacity();
		
		// If first insertion
		if (head == null) {
			return firstInsertion(key);
		}	
		// If key is already inside the list
		if(search(key) != null) {
			return false;
		}	
		// If we insert before head
		if(key.compareTo(head.getKey()) < 0) {
			return this.insertNewHead(key);
		}
		
		Node<E> node = new Node<E>(key, levelMax);
		
		Node<E>[] path = this.searchPathAdd(node);
		
		// If we insert after last element
		if(path[0] == null) {
			return this.insertNewTail(key, node);
		}
		
		for (int i = 0; i < node.getNodes().length; ++i) {
			node.getNodes()[i] = path[i];
			//System.out.println(path[i] == nodesToModify.getNodes()[i]);
			// This doesn't work
			// path[i] = node;
			// But this yes, although previous test was true
			// That why we have nodesToModify.
			nodesToModify[i].getNodes()[i] = node;
		}
		
		++size;
		return true;
	}
	
	/**
	 * Get matrix of String representing the {@link SkipList} with the {@link Node}s levels.
	 * @return The matrix of String.
	 */
	private String[][] getDisplay() {
		Node<E> currentNode = head;
		
		// All pointers + the value
		String[][] matrix = new String[levelMax][size];
		int j, k;
		for (int i = 0; i < levelMax; ++i) {
			
			for(j = 0; currentNode.getNodes()[0] != null; ++j) {

				
				if (currentNode.getNodes().length < levelMax - i) {
					matrix[i][j] = "";
					
					for (k = 0; k < currentNode.toString().length(); ++k) {
						matrix[i][j] += " ";
					}
					
					currentNode = currentNode.getNodes()[0];
					continue;
				}
				
				matrix[i][j] = currentNode.getNodes()[levelMax - 1 - i].toString();	
				currentNode = currentNode.getNodes()[0];
			}
			
			currentNode = head;
		}
		
		return matrix;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// Display infos about the list itself
		String str = "SkipList [levelMax=" + levelMax + ", size=" + size;
		
		if (head == null) {
			return str + "]";
		}
		
		str += "]" + System.lineSeparator() + System.lineSeparator();
		Node<E> currentNode = head;
			
		String[][] matrix = getDisplay();
		
		// If there is no value, then don't display anything else
		if (matrix[0][0] == null) {
			return str;
		}
		
		// Display all Node's pointers
		int j, k;
		for (int i = 0; i < matrix.length; ++i) {
			for (j = 0; j < matrix[i].length - 1; ++j) {
				
				str += (matrix[i][j]);
				
				for (k = 0; k < matrix[i][j].toString().length(); ++k) {
					
					str += " ";
				}
				
			}
			if (i + 1 < matrix.length) {
				str += System.lineSeparator();
			}
		}
		
		str += System.lineSeparator();
		
		// Separation between pointers and actual value
		for (currentNode = head; currentNode.getNodes()[0] != null; currentNode = currentNode.getNodes()[0]) {
			for (k = 0; k < currentNode.toString().length(); ++k) {
				str += "--";
			}	
		}
		
		str += System.lineSeparator();
		
		// Display actual value
		for (currentNode = head; currentNode.getNodes()[0] != null; currentNode = currentNode.getNodes()[0]) {
			for (k = 0; k < currentNode.toString().length(); ++k) {
				if(currentNode == head) {
					break;
				}
				str += " ";
			}
			str += currentNode;		
		}
		
		for (k = 0; k < currentNode.toString().length(); ++k) {
			str += " ";
		}
		str += currentNode;
		
		return str;
	}

	/**
	 * @see java.util.AbstractCollection#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		final SkipList<E> thisList = this;
		return new Iterator<E>() {
			
			final SkipList<E> list = thisList;
			Node<E> currentNode = head;

			@Override
			public boolean hasNext() {
				return currentNode == null;
			}

			@Override
			public E next() {
				Node<E> res = currentNode;
				
				currentNode = currentNode.getNodes()[0];
				return res.getKey();
			}

			@Override
			public void remove() {
				if (!hasNext()) {
					throw new IllegalStateException("Called after last next() call.");
				}
				
				final Node<E> lastNode = currentNode;
				currentNode = currentNode.getNodes()[0];
				
				list.remove(lastNode);
			}
		};
	}

	/**
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		return this.size;
	}
}