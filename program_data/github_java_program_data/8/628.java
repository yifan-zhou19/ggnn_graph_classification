package ch.epfl.sweng.project.quadtree;

import android.renderscript.RSIllegalArgumentException;
import android.renderscript.RSInvalidStateException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jatentaki on 27.10.16.
 *
 * A data structure allowing for fast retrieval of elements laying in a rectangular subextent of
 * some 2d plane. Generic over stored elements, as long as they implement Bounded, that is it is
 * possible to tell which subextent of the plane they occupy. The structure DOES NOT claim to
 * return ONLY elements in the subextent, but quickly discards many that surely do not.
 * @param <T> The type of stored objects
 */

public class Quadtree<T extends Bounded> {
    private final BoundingRectangle extent;
    private List<T> ownElements = new ArrayList<>();
    private final int maxDepth;
    private final int depth;
    private boolean isALeaf = true; // a freshly created tree is empty and thus a leaf

    private QuadNode NW;
    private QuadNode SW;
    private QuadNode NE;
    private QuadNode SE;

    /**
     * Represents a node: the extent of the node and (possibly) a Quadtree of that extent. This
     * allows us to not recompute the extent each time insertion is performed, but it is rather
     * owned by the QuadNode
     */
    private final class QuadNode {
        private Quadtree<T> tree = null;
        private final BoundingRectangle extent;

        private QuadNode(BoundingRectangle extent) {
            this.extent = extent;
        }

        void expand() {
            this.tree = new Quadtree<T>(this.extent, maxDepth, depth+1);
        }

        int queryRealDepth() {
            return tree.queryRealDepth();
        }

        public Iterator<T> get(BoundingRectangle queryRectangle) {
            return tree.get(queryRectangle);
        }

        boolean isEmpty() {
            return tree == null;
        }

        void insert(T element, BoundingRectangle boundingRectangle) {
            tree.insert(element, boundingRectangle);
        }
    }

    /**
     * Create a new Quadtree
     * @param extent the subextent of the whole 2D plane where elements are allowed be inserted
     *               (queries can ask outside as well, and will retrieve an empty result by definition)
     * @param maxDepth the maximum depth of underlying recursive tree structure. Allows to control
     *                 the memory complexity
     */
    public Quadtree(BoundingRectangle extent, int maxDepth) {
        if (extent == null)
            throw new RSIllegalArgumentException("Extent of a quadtree must be non-null");

        this.extent = extent;
        this.maxDepth = maxDepth;
        this.depth = 0;

        initNodes();
    }

    private Quadtree(BoundingRectangle extent, int maxDepth, int depth) {
        this.extent = extent;
        this.maxDepth = maxDepth;
        this.depth = depth;

        initNodes();
    }

    private void initNodes() {
        NW = new QuadNode(extent.getNW());
        SW = new QuadNode(extent.getSW());
        NE = new QuadNode(extent.getNE());
        SE = new QuadNode(extent.getSE());
    }

    /**
     * Get all the elements owned by the Quadtree that could possibly lay within queryRectangle
     * @param queryRectangle the extent to search for objects
     * @return Iterator<T> over the elements of type T owned by the Quadtree
     */
    public Iterator<T> get(BoundingRectangle queryRectangle) {
        ChainingIterator<T> chainedIterator = new ChainingIterator<>(ownElements.iterator());

        if ((!NE.isEmpty()) && (NE.extent.intersects(queryRectangle)))
            chainedIterator.chain(NE.get(queryRectangle));

        if ((!SE.isEmpty()) && (SE.extent.intersects(queryRectangle)))
            chainedIterator.chain(SE.get(queryRectangle));

        if ((!NW.isEmpty()) && (NW.extent.intersects(queryRectangle)))
            chainedIterator.chain(NW.get(queryRectangle));

        if ((!SW.isEmpty()) && (SW.extent.intersects(queryRectangle)))
            chainedIterator.chain(SW.get(queryRectangle));


        return chainedIterator;
    }

    /**
     * Diagnostic method for checking the actual (as opposed to maximumDepth provided in the
     * constructor) recursive depth of the tree - and thus indirectly its memory consumption
     * @return the depth of the tree
     */
    public int queryRealDepth() {
        if (isALeaf)
            return depth;

        int maxN = Math.max(NW.queryRealDepth(), NE.queryRealDepth());
        int maxS = Math.max(SW.queryRealDepth(), SE.queryRealDepth());

        return Math.max(maxN, maxS);
    }

    /**
     * Insert a new element to the Quadtree, at the location specified by its Bounded implementation
     * @param element the element to be inserted
     */
    public void insert(T element) {
        BoundingRectangle boundingRectangle = element.getBoundingRectangle();

        if (!extent.contains(boundingRectangle))
            throw new RSIllegalArgumentException(
                    "Attempting to insert outside the extent of a quadtree"
        );

        // avoid recalculating the rectangle on each level of the tree
        insert(element, boundingRectangle);
    }

    /**
     * Expand a leaf to a node: create leaves, stop being a leaf itself.
     * Only valid if depth != maxDepth and not a node already
     */
    private void expand() {
        if (depth == maxDepth)
            throw new RSInvalidStateException("Trying to expand a leaf at max depth!");

        if (!isALeaf)
            throw new RSInvalidStateException("Trying to expand a node!");

        SE.expand();
        SW.expand();
        NE.expand();
        NW.expand();

        this.isALeaf = false;
    }

    private void insert(T element, BoundingRectangle boundingRectangle) {
        if (!extent.contains(boundingRectangle))
            throw new RSIllegalArgumentException(
                    "Attempting to insert outside the extent of a quadtree"
            );

        // if we are at max depth, can can only expand our own list of elements
        if (depth == maxDepth) {
            ownElements.add(element);
            return;
        }

        // if we are a leaf, expand to a node
        if (isALeaf)
            expand();

        /*
            It's necessary to find the right subregion.
            If it's unique
                -> insert there
            otherwise
                -> insert to own list
         */
        boolean alreadyFoundASubregion = false;
        QuadNode insertionDestination = null;

        if (SE.extent.intersects(boundingRectangle)) {
            alreadyFoundASubregion = true;
            insertionDestination = SE;
        }

        if (NE.extent.intersects(boundingRectangle)) {
            if (alreadyFoundASubregion) { // the subregion is not unique
                ownElements.add(element);
                return;
            }

            alreadyFoundASubregion = true;
            insertionDestination = NE;
        }

        if (NW.extent.intersects(boundingRectangle)) {
            if (alreadyFoundASubregion) {
                ownElements.add(element);
                return;
            }

            alreadyFoundASubregion = true;
            insertionDestination = NW;
        }

        if (SW.extent.intersects(boundingRectangle)) {
            if (alreadyFoundASubregion) {
                ownElements.add(element);
                return;
            }

            alreadyFoundASubregion = true;
            insertionDestination = SW;
        }

        if (!alreadyFoundASubregion) {
            throw new RSInvalidStateException("Did not find a matching subextent");
        }

        insertionDestination.insert(element, boundingRectangle);
    }
}