package myukkonen;

import java.util.Arrays;




/**
 * @author ivy
 *
 * 2018.8.1  
 * 
 * https://bl
 * og.csdn.net/vickyway/article/details/50059095
 */


/**
 * ����1������ڵ�ָ����һ���ߣ���
 *   ��ڵ㱣��Ϊ���ڵ�
 *   ���û��Ϊ����Ҫ������º�׺�ĵ�һ���ַ�
 *   ����ȼ�һ
 * ����2��
 *   ������Ƿָ�һ���߲������½ڵ㣬��������������ڵ�ǰ�����ﴴ���ĵ�һ���ڵ㣬����ͨ����׺���ӣ�����ǰ����Ľڵ�������ڵ�����������
 * ����3��
 *   �ָ�Ӳ��Ǹ��ڵ�Ļ�ڵ㿪ʼ�ı�֮�󣬽���Ŵӻ�㿪ʼ�ĺ�׺����
 */


public class SuffixTree {
	
	//�ڵ�
	private class Node {
		public char[] chars;
		public Node child;
		public Node brother;
		public Node suffixNode;
		
		public Node(char[] chars) {
			this.chars=chars;
		}
		
		public String toString() {
			return "Node [chars="+String.valueOf(chars)+"]";
		}
		
		public void print(String prefix) {
			System.out.print(String.valueOf(chars));
			if(this.suffixNode!=null) {
				System.out.println("--"+String.valueOf(this.suffixNode.chars));
			}else {
				System.out.println();
			}
			Node child=this.child;
			while(child!=null) {
				System.out.print(prefix+"|����");
				child.print(prefix + prefix);
				child=child.brother;
			}
		}
	}
	
	//��ڵ�
	private class ActivePoint{
		public Node point;
		public Node index;
		public int length;
		
		public ActivePoint(Node point,Node index,int length) {
			this.point=point;
			this.index=index;
			this.length=length;
		}
		
		public String toString() {
			return "ActivePoint [point=" + point + ", index=" + index + ", length=" + length + "]";
		}
	}
	
	private Node root=new Node(new char[0]);//���ڵ�
	private int reminder=0;//ʣ���׺��
	private ActivePoint activepoint= new ActivePoint(root,null,0);//
	
	/**
	 * Ѱ�ҵ�ǰ��ڵ����Ƿ������׺�ַ��Ľڵ�
	 * @param w
	 * @return
	 *
	 */
	private boolean find(char w) {
		final Node start = activepoint.point;
		final Node current = activepoint.index;
		boolean exist = false;
		if (null == current) {// current==null �޻�ߣ���ӻ����ӽڵ㿪ʼ����
			// Ѱ���ӽڵ�
			Node child = start.child;
			while (null != child) {
				if (child.chars[0] == w) {// ����
					activepoint.index = child;
					activepoint.length++;// activePoint.length++
					exist = true;
					break;
				} else {
					child = child.brother;
				}
			}
		} else if (current.chars[activepoint.length] == w) {// �л�ߣ����ڻ���ϲ���
			activepoint.length++;
			exist = true;
			if (current.chars.length == activepoint.length) {
				// �����ߵĳ����Ѵﵽ��ߵ����һ���ַ����򽫻����Ϊ��ߣ�ͬʱ�����Ϊnull��������Ϊ0
				activepoint.point = current;
				activepoint.index = null;
				activepoint.length = 0;
			}
		} else {
			exist = false;
		}
		return exist;
	}
	
	/**
	 * ��������׺
	 * 
	 * @param chars ������׷����ȫ���ַ�
	 * @param currentIndex ��ǰ���������ַ�λ��
	 * @param prefixNode ǰ�̽ڵ㣬�Ѿ����зָ�Ľڵ㣬���ڱ�ʶ��׺�ڵ�
	 */
	private void innerSplit(char[] chars, int currenctIndex, Node prefixNode) {
		// �˴�����ʣ�������ĺ�׺�Ŀ�ʼλ�ã�����������Ҫ����������׺(abx,bx,x)���Ѵ�����abx����ʣ��ba��x������������λ�þ���b��λ��
		int start = currenctIndex - reminder + 1;
		
		this.print();// ��ӡ
		System.out.println();
		System.out.println("��ǰ�����׺��" + String.copyValueOf(chars, start, currenctIndex - start + 1) + "========");
		
		// dealStart��ʾ���β���������Ҫ���в��ҵĿ�ʼ�ַ�λ�ã���Ϊ���ڹ���2�����ܳ���ͨ����׺�ڵ�ֱ���ҵ���ڵ�����
		// ��ͨ��ab�ڵ�ĺ�׺�ڵ㣬ֱ���ҵ��ڵ�b����ô��ʱ��activePoint(node[b], null, 0)��������Ҫ��node[b]��ʼ����x��dealStart��λ�þ���x��λ��
		int dealStart = start + activepoint.point.chars.length + activepoint.length;
		// ��dealStart��ʼ�������к�׺�ַ��Ƿ񶼴���(�������)
		for (int index = dealStart; index <= currenctIndex; index++) {
			char w = chars[index];
			if (find(w)) {// ���ڣ��������һ����activePoint.length+1�����ﲻ����reminder
				continue;
			}
			Node splitNode = null;// ���ָ�Ľڵ�
			if(activepoint.index==null){// ���activePoint.index==null��˵��û���ҵ���ߣ���ôֻ��Ҫ�ڻ�ڵ��²���һ���ڵ㼴��
				Node node = new Node(Arrays.copyOfRange(chars, index, chars.length));
				Node child = activepoint.point.child;
				if(null==child){
					activepoint.point.child = node;
				}else{
					while (null != child.brother) {
						child = child.brother;
					}
					child.brother = node;
				}
			}else{
				// ��ʼ�ָ�ָ��ͬ����ķָ�
				splitNode = activepoint.index;
				// �����зֺ�Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�
				// �ýڵ�̳��˵�ǰ�ڵ���ӽڵ��Լ���׺�ڵ���Ϣ
				Node node = new Node(Arrays.copyOfRange(splitNode.chars, activepoint.length, splitNode.chars.length));
				node.child = splitNode.child;
				node.suffixNode = splitNode.suffixNode;
				splitNode.child = node;
				splitNode.suffixNode = null;
				// �����²���Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�(ͨ���ӽڵ���ֵܽڵ㱣��)
				Node newNode = new Node(Arrays.copyOfRange(chars, index, chars.length));
				splitNode.child.brother = newNode;
				// �޸ĵ�ǰ�ڵ���ַ���
				splitNode.chars = Arrays.copyOfRange(splitNode.chars, 0, activepoint.length);
				// ����2�����Ӻ�׺�ڵ�
				prefixNode.suffixNode = splitNode;
			}
			// --
			reminder--;

			// ���չ���1���д���
			if (root == activepoint.point) {// ��ڵ��Ǹ��ڵ�����
				// activePoint.point == root
			
			// ���չ���3���д���
			} else if (null == activepoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
				activepoint.point = root;
			} else {
				activepoint.point = activepoint.point.suffixNode;
			}
			
			activepoint.index = null;
			activepoint.length = 0;
			if(reminder > 0){// ���reminder==0����Ҫ�����ݹ�����׺
				innerSplit(chars, currenctIndex, splitNode);
			}
		}
	}
	
	

	/**
	 * ��ʽ����ӡ��������׺��
	 */
	public void print() {
		Node child = root.child;
		System.out.println("[root] [activePoint:(" + activepoint.point + "," + activepoint.index + ","+ activepoint.length + ")], [reminder:" + reminder + "]");
		while (child != null) {
			System.out.print("|����");
			child.print("    ");
			child = child.brother;
		}
	}

	
	/**
	 * ������׺��
	 * 
	 * @param word
	 *
	 */
	public void build(String word) {
		int index = 0;
		char[] chars = word.toCharArray();
		while (index < chars.length) {// ѭ��������׺
			int currenctIndex = index++;// ���浱ǰ��λ��
			char w = chars[currenctIndex];// ��ǰ�ĺ�׺�ַ�
			
			this.print();// ��ӡ
			System.out.println();
			System.out.println("��ǰ�����׺��" + w + "========");

			if (find(w)) {// �����Ƿ���ڱ����е�ǰ��׺�ַ��Ľڵ�
				reminder++;// ���ڣ���reminder+1��activePoint.length+1��Ȼ�󷵻ؼ���
				continue;
			}

			// �����ڵĻ������reminder==0��ʾ֮ǰ�ڸ��ַ�֮ǰδʣ��������������ĺ�׺�ַ�������ֱ�Ӳ���ú�׺�ַ�����
			if (reminder == 0) {
				// ֱ���ڵ�ǰ��ڵ����һ���ڵ㼴��
				// �������Ľڵ�������ַ��Ǵӵ�ǰ�ַ���ʼ���ַ���ʣ���ȫ���ַ���������һ���Ż���
				// �Ż��ο��ԣ�http://blog.csdn.net/v_july_v/article/details/6897097 (3.6������, ��˼, �Ż�)
				Node node = new Node(Arrays.copyOfRange(chars, currenctIndex, chars.length));
				// �����ǰ������ӽڵ㣬���½��Ľڵ���Ϊ���ӽڵ㼴�ɣ�����ѭ�������ӽڵ�(ͨ���ֵܽڵ���б���)
				Node child = activepoint.point.child;
				if (null == child) {
					activepoint.point.child = node;
				} else {
					while (null != child.brother) {
						child = child.brother;
					}
					child.brother = node;
				}
			} else {
				// ���reminder>0����˵�����ַ�֮ǰ����ʣ���ַ�����Ҫ���зָȻ������µĺ�׺�ַ�
				Node splitNode = activepoint.index;// ���ָ�Ľڵ㼴Ϊ���(active_edge)
				// �����зֺ�Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�
				// �ýڵ�̳��˵�ǰ�ڵ���ӽڵ��Լ���׺�ڵ���Ϣ
				Node node = new Node(Arrays.copyOfRange(splitNode.chars, activepoint.length, splitNode.chars.length));// �ӻ�߳��ȿ�ʼ��ȡʣ���ַ���Ϊ�ӽڵ�
				node.child = splitNode.child;
				node.suffixNode = splitNode.suffixNode;
				splitNode.child = node;
				splitNode.suffixNode = null;
				// �����²���Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�(ͨ���ӽڵ���ֵܽڵ㱣��)
				Node newNode = new Node(Arrays.copyOfRange(chars, currenctIndex, chars.length));// �����µĺ�׺�ַ�
				splitNode.child.brother = newNode;
				splitNode.chars = Arrays.copyOfRange(splitNode.chars, 0, activepoint.length);// �޸ĵ�ǰ�ڵ���ַ�

				// �ָ����֮������ݹ���1�͹���3�������ֶԴ�
				// ���չ���1���д���
				if (root == activepoint.point) {// ��ڵ��Ǹ��ڵ�����
					// activePoint.point == root
				// ���չ���3���д���
				} else if (null == activepoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
					activepoint.point = root;
				} else {// �����ڵ��Ϊ��ǰ��ڵ�ĺ�׺�ڵ�
					activepoint.point = activepoint.point.suffixNode;
				}
				// ��ߺͻ�߳��ȶ�����
				activepoint.index = null;
				activepoint.length = 0;
				// �ݹ鴦��ʣ��Ĵ������׺
				innerSplit(chars, currenctIndex, splitNode);
			}
		}
	}
	
	//����
	public static void main(String[] args) {
		SuffixTree tree = new SuffixTree();
		tree.build("abcabxabcd");
		tree.print();
	}
}
