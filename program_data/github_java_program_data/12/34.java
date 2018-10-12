
import java.util.*;
/**
 * <p>
 * ��׺����ʵ�֣�Ukkonen���취�� 
 * ���ķ������£�<code>http://www.oschina.net/translate/ukkonens-suffix-tree-algorithm-in-plain-english</code>
 * </p>
 * <p>
 * <b>������ʹ�ñ��������ַ���Ϣ���˴�ʵ��ʹ�ýڵ㱣���ַ���Ϣ��û�в��</b>
 * ͬʱ���Ľṹͨ���ӽڵ���ֵܽڵ㱣�棬������һ���ڵ���ӽڵ㣬�����ҵ���ֱ���ӽڵ㣬Ȼ��ͨ�����ӽڵ�������ֵܽڵ��ҵ�ȫ���ӽڵ�
 * </p>
 *
 * @author Vicky, zouquan
 * @email vicky01200059@163.com
 * @2015��11��25��
 *
 */
public class SuffixTree {
	private  Node root = new Node(new char[0]);// ���ڵ㣬���ڵ���chars������new char[0]
	// active point��һ����Ԫ�飺(active_node,active_edge,active_length)
	// active_node�ǵ�ǰ�Ļ�㣬�ýڵ������active_edge�ǻ�ıߣ������ýڵ�����ʾ��active_length�ǻ�ĳ���
	private ActivePoint activePoint = new ActivePoint(root, null, 0);
	private int reminder = 0;// remainder����ʾ��ʣ���ٺ�׺��Ҫ����
	
	public int minMatchLen = 15;

	/**
	 * ������׺��
	 * 
	 * @param word
	 */
	public void build(String word) {
		int index = 0;
		char[] chars = word.toCharArray();
		while (index < chars.length) {// ѭ��������׺
			int currenctIndex = index++;// ���浱ǰ��λ��,ע�⣺int a=b++;�൱��int a=b;b++;����a=b+1!
			char w = chars[currenctIndex];// ��ǰ�ĺ�׺�ַ�

			// this.print();
		//	System.out.println("��֮ǰ���Ԫ��"+activePoint.toString());
		//	System.out.println("��֮ǰreminder��" + String.valueOf(reminder));

	//		if(currenctIndex%1000==1)
		//	   System.out.println("building the prefix tree: " + currenctIndex + "  /  "+(chars.length-1));
			   
			  

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
				//node.position.add(currenctIndex);
				node.label=currenctIndex;
				// �����ǰ������ӽڵ㣬���½��Ľڵ���Ϊ���ӽڵ㼴�ɣ�����ѭ�������ӽڵ�(ͨ���ֵܽڵ���б���)
				Node child = activePoint.point.child;
				if (null == child) {
					activePoint.point.child = node;
				} else {
					while (null != child.brother) {
						child = child.brother;
					}
					child.brother = node;
				}
				node.father=activePoint.point;
				/*********
				Node fath = node.father;
				while(null!=fath && fath!=root){
					fath.position.add(currenctIndex);
					fath = fath.father;
				}
				*********/
			} else if(activePoint.index==null){

				//����ǰһ���ߴ���reminder����Щ���������һ�����ַ���ֱ�ӽ������±ߴ���ַ�������֮ǰǷ�µĲ���
				Node node = new Node(Arrays.copyOfRange(chars, currenctIndex, chars.length));
				//node.position.add(currenctIndex-reminder);
				node.label=currenctIndex-reminder;
				
				
				// �����ǰ������ӽڵ㣬���½��Ľڵ���Ϊ���ӽڵ㼴�ɣ�����ѭ�������ӽڵ�(ͨ���ֵܽڵ���б���)
				Node child = activePoint.point.child;
				if (null == child) {
					activePoint.point.child = node;
				} else {
					while (null != child.brother) {
						child = child.brother;
					}
					child.brother = node;
				}
				node.father = activePoint.point;
				/************
				Node fath = node.father;
				while(null!=fath && fath!=root){
					fath.position.add(currenctIndex-reminder);
					fath = fath.father;
				}
				*************/

				
				
				// �ָ����֮������ݹ���1�͹���3�������ֶԴ�
				// ���չ���1���д���
				if (root == activePoint.point) {// ��ڵ��Ǹ��ڵ�����
					// activePoint.point == root
				// ���չ���3���д���
				} else if (null == activePoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
					activePoint.point = root;
				} else {// �����ڵ��Ϊ��ǰ��ڵ�ĺ�׺�ڵ�
					activePoint.point = activePoint.point.suffixNode;
				}
				// ��ߺͻ�߳��ȶ�����
				activePoint.index = null;
				activePoint.length = 0;
				// �ݹ鴦��ʣ��Ĵ������׺
				innerSplit(chars, currenctIndex, activePoint.point);	
			}	else if(reminder-getNodeString(activePoint.point).length()<activePoint.index.chars.length){//���ﲻ����reminder������reminder-��㵽���ľ���
				// ���reminder>0����˵�����ַ�֮ǰ����ʣ���ַ�����Ҫ���зָȻ������µĺ�׺�ַ�
				Node splitNode = activePoint.index;// ���ָ�Ľڵ㼴Ϊ���(active_edge)
				// �����зֺ�Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�
				// �ýڵ�̳��˵�ǰ�ڵ���ӽڵ��Լ���׺�ڵ���Ϣ
				//�½�һ��node����index�Ķ��ӣ�index����ڲ��ڵ�
				Node node = new Node(Arrays.copyOfRange(splitNode.chars, activePoint.length, splitNode.chars.length));// �ӻ�߳��ȿ�ʼ��ȡʣ���ַ���Ϊ�ӽڵ�
				node.child = splitNode.child;
				
				Node child = splitNode.child;
				while(null!=child){
					child.father=node;
					child=child.brother;
				}
				
				
				node.suffixNode = splitNode.suffixNode;
				splitNode.child = node;
				node.father = splitNode;
				splitNode.suffixNode = null;			
				//node.position = (ArrayList<Integer>) splitNode.position.clone();
				if(splitNode.chars[splitNode.chars.length-1]=='$')
					node.label=splitNode.label;
				// �����²���Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�(ͨ���ӽڵ���ֵܽڵ㱣��)
				Node newNode = new Node(Arrays.copyOfRange(chars, currenctIndex, chars.length));// �����µĺ�׺�ַ�
				splitNode.child.brother = newNode;
				newNode.father=splitNode;
				splitNode.chars = Arrays.copyOfRange(splitNode.chars, 0, activePoint.length);// �޸ĵ�ǰ�ڵ���ַ�
				//newNode.position.add(currenctIndex-reminder);
				newNode.label=currenctIndex-reminder;

				Node fath = newNode.father;
				/***************
				while(null!=fath && fath!=root){
					fath.position.add(currenctIndex-reminder);
					fath = fath.father;
				}
				****************/
				
				// �ָ����֮������ݹ���1�͹���3�������ֶԴ�
				// ���չ���1���д���
				if (root == activePoint.point) {// ��ڵ��Ǹ��ڵ�����
					// activePoint.point == root
				// ���չ���3���д���
				} else if (null == activePoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
					activePoint.point = root;
				} else {// �����ڵ��Ϊ��ǰ��ڵ�ĺ�׺�ڵ�
					activePoint.point = activePoint.point.suffixNode;
				}
				// ��ߺͻ�߳��ȶ�����
				activePoint.index = null;
				activePoint.length = 0;
				// �ݹ鴦��ʣ��Ĵ������׺
				innerSplit(chars, currenctIndex, splitNode);
			}
			else if(reminder-getNodeString(activePoint.point).length()==activePoint.index.chars.length){
				//ֱ���ڻ�ߵĽ���ϲ���һ���µĶ��ӣ����ò����ڲ��ڵ���
				Node node = new Node(Arrays.copyOfRange(chars, currenctIndex, chars.length));
				//node.position.add(currenctIndex-reminder);
				node.label=currenctIndex-reminder;

				// �����ǰ������ӽڵ㣬���½��Ľڵ���Ϊ���ӽڵ㼴�ɣ�����ѭ�������ӽڵ�(ͨ���ֵܽڵ���б���)
				Node child = activePoint.index.child;
				if (null == child) {
					activePoint.index.child = node;
				} else {
					while (null != child.brother) {
						child = child.brother;
					}
					child.brother = node;
				}
				node.father = activePoint.index;
				/***********
				Node fath = node.father;
				while(null!=fath && fath!=root){
					fath.position.add(currenctIndex-reminder);
					fath = fath.father;
				}
				************/
				
				Node ttmp=activePoint.index;
				if (root == activePoint.point) {// ��ڵ��Ǹ��ڵ�����
					// activePoint.point == root
				// ���չ���3���д���
				} else if (null == activePoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
					activePoint.point = root;
				} else {// �����ڵ��Ϊ��ǰ��ڵ�ĺ�׺�ڵ�
					activePoint.point = activePoint.point.suffixNode;
				}
				// ��ߺͻ�߳��ȶ�����
				activePoint.index = null;
				activePoint.length = 0;
				// �ݹ鴦��ʣ��Ĵ������׺
				innerSplit(chars, currenctIndex, ttmp);
			}
			//***********		
			if(index==chars.length&&reminder > 0){
				System.out.println("�˴���Ӧ�ó��֣�");
				index-=reminder;
				reminder=0;
				activePoint.point = root;
				activePoint.index = null;
				activePoint.length=0;
			}
			//***********
		}
		
	}

	/**
	 * ����ʣ��Ĵ������׺
	 * @param chars	������׺����ȫ���ַ�
	 * @param currenctIndex	��ǰ�Ѵ��������ַ�λ��
	 * @param prefixNode ǰ�̽ڵ㣬���Ѿ����зָ�Ľڵ㣬���ڱ�ʶ��׺�ڵ�
	 */
	private void innerSplit(char[] chars, int currenctIndex, Node prefixNode) {
		// �˴�����ʣ�������ĺ�׺�Ŀ�ʼλ�ã�����������Ҫ����������׺(abx,bx,x)���Ѵ�����abx����ʣ��bx��x������������λ�þ���b��λ��
		int start = currenctIndex - reminder + 1;

		//if(null!=root.child&&null!=root.child.suffixNode) 
		//	  System.out.println("���׺��"+root.child.suffixNode);
	//	System.out.println("��ǰ�����׺��" + String.copyValueOf(chars, start, currenctIndex - start + 1) + "========");
	//	System.out.println("���Ԫ��"+activePoint.toString());
	//	System.out.println("reminder��" + String.valueOf(reminder));
		// dealStart��ʾ���β���������Ҫ���в��ҵĿ�ʼ�ַ�λ�ã���Ϊ���ڹ���2�����ܳ���ͨ����׺�ڵ�ֱ���ҵ���ڵ�����
		// ��ͨ��ab�ڵ�ĺ�׺�ڵ㣬ֱ���ҵ��ڵ�b����ô��ʱ��activePoint(node[b], null, 0)��������Ҫ��node[b]��ʼ����x��dealStart��λ�þ���x��λ��
		
		//������ˣ���Ӧ����activePoint.point.chars.length�����ǻ�㵽���������ַ�����������
		//int dealStart = start + activePoint.point.chars.length + activePoint.length;
		//************����Ҫ�޸ģ�ÿ���ڵ㵽�����ַ�����Ӧ�ô洢*****
		int tmpp=0;
		Node fathh= activePoint.point;
		while(fathh!=root){
			tmpp+=fathh.chars.length;
			fathh=fathh.father;
		}

		int dealStart = start + tmpp + activePoint.length;
		//*********************************************************
		// ��dealStart��ʼ�������к�׺�ַ��Ƿ񶼴���(�������)


//System.out.println("ע����~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int index = dealStart; index <= currenctIndex; index++) {
			char w = chars[index];
	//		System.out.println(index);
	//		System.out.println(currenctIndex);
	//		System.out.print(w);

			if (find(w)) {// ���ڣ��������һ����activePoint.length+1�����ﲻ����reminder
		//		System.out.println("ƥ������");
				continue;
			}
		//	System.out.println("ûƥ���ϣ�index��"+index);
			Node splitNode = null;// ���ָ�Ľڵ�

			if(null==activePoint.index){// ���activePoint.index==null��˵��û���ҵ���ߣ���ôֻ��Ҫ�ڻ�ڵ��²���һ���ڵ㼴��
splitNode=activePoint.point;//******���Լ��ӵ�zouquan*******

				Node node = new Node(Arrays.copyOfRange(chars, index, chars.length));

				//node.position.add(start);
				node.label=start;
				Node child = activePoint.point.child;
				if(null==child){
					activePoint.point.child = node;
				}else{
					while (null != child.brother) {
						child = child.brother;
					}
					child.brother = node;				
				}
				node.father = activePoint.point;
				//�޸Ļ�㣡��
				//*******************************�����Լ��ӵģ�
				// �ָ����֮������ݹ���1�͹���3�������ֶԴ�
				// ���չ���1���д���
				if (root == activePoint.point) {// ��ڵ��Ǹ��ڵ�����
					// activePoint.point == root
				// ���չ���3���д���
				} else if (null == activePoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
					activePoint.point = root;
				} else {// �����ڵ��Ϊ��ǰ��ڵ�ĺ�׺�ڵ�
					activePoint.point = activePoint.point.suffixNode;
				}
				// ��ߺͻ�߳��ȶ�����
				activePoint.index = null;
				activePoint.length = 0;
				//*******************************
				
				
				
				
				
				/**************
				Node fath = node.father;
				while(null!=fath && fath!=root){
					fath.position.add(start);
					fath = fath.father;
				}
				***************/	
			}else{

				// ��ʼ�ָ�ָ��ͬ����ķָ�
				splitNode = activePoint.index;//(��ߵĶ��ӽڵ㣬���Ǹ��׽ڵ�)
				// �����зֺ�Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�
				// �ýڵ�̳��˵�ǰ�ڵ���ӽڵ��Լ���׺�ڵ���Ϣ
				Node node = new Node(Arrays.copyOfRange(splitNode.chars, activePoint.length, splitNode.chars.length));
				node.child = splitNode.child;
				
				Node child = splitNode.child;
				while(null!=child){
					child.father=node;
					child=child.brother;
				}
				
				node.suffixNode = splitNode.suffixNode;
				splitNode.child = node;
				node.father = splitNode;
				splitNode.suffixNode = null;
				//node.position = (ArrayList<Integer>) splitNode.position.clone();
				if(splitNode.chars[splitNode.chars.length-1]=='$')
					node.label=splitNode.label;
				// �����²���Ľڵ㣬�ŵ���ǰ�ڵ���ӽڵ�(ͨ���ӽڵ���ֵܽڵ㱣��)
				Node newNode = new Node(Arrays.copyOfRange(chars, index, chars.length));
				splitNode.child.brother = newNode;
				newNode.father = splitNode;
				// �޸ĵ�ǰ�ڵ���ַ���
				splitNode.chars = Arrays.copyOfRange(splitNode.chars, 0, activePoint.length);
				// ����2�����Ӻ�׺�ڵ�

				prefixNode.child.suffixNode = splitNode;//ע��:ǰ��ԭ����д��ɵ�ƣ�����Ӧ���½�һ��splitNode,����predixNode.suufixNode��Ӧ����splitNode.��������ɵ�ƣ���Ҫ��ԭ�ڵ㵱��splitNode,�½�һ���ڵ�node���ԭ���Ľڵ�(newNode�Ǵ�Ų�����±ߵ�Ҷ��)������prefixNode�ͱ����splitNode��
				
				//****����splitNode��root�ı��ϵ��ַ�������
				int k=0;
				Node tmp = splitNode;
				while(tmp!=root){
					k+=tmp.chars.length;
					tmp=tmp.father;
				}			
				//***************************************
				//newNode.position.add(index-k);
				newNode.label=index-k;
				/******************
				if(index-k<0){
					System.out.println("+++++++++++++++++++++++++++");
					System.out.println(index);
					System.out.println(k);
					}

				/*****************
				Node fath = newNode.father;
				while(null!=fath && fath!=root){
					fath.position.add(index-k);
					fath = fath.father;
				}
				*****************/
			}

			reminder--;

			// ���չ���1���д���
			if (root == activePoint.point) {// ��ڵ��Ǹ��ڵ�����
				// activePoint.point == root
			
			// ���չ���3���д���
			} else if (null == activePoint.point.suffixNode) {// �޺�׺�ڵ㣬���ڵ��Ϊroot
				activePoint.point = root;
			} else {
				activePoint.point = activePoint.point.suffixNode;
			}
			
			activePoint.index = null;
			activePoint.length = 0;
			if(reminder > 0){// ���reminder==0����Ҫ�����ݹ�����׺

				innerSplit(chars, currenctIndex, splitNode);
			}
		}

	}

	/**
	 * Ѱ�ҵ�ǰ�����ӽڵ����Ƿ���ڰ�����׺�ַ��Ľڵ�(��)
	 * 
	 * @param w
	 * @return
	 */
	private boolean find(char w) {
		final Node start = activePoint.point;
		final Node current = activePoint.index;
		boolean exist = false;
//		System.out.println("find��ʼ"+activePoint.toString());
		if (null == current) {// current==null �޻�ߣ���ӻ����ӽڵ㿪ʼ����
			// Ѱ���ӽڵ�
			Node child = start.child;
			while (null != child) {			
				if (child.chars[0] == w) {// ����
					exist = true;
					if(child.chars.length>1){
					activePoint.index = child;
					activePoint.length++;// activePoint.length++
					}
					else if(child.chars.length==1){ //���ƥ��ߵ��ַ�������Ϊ1�������������ƶ�
						activePoint.point=child;
						activePoint.index = null;
						activePoint.length = 0;
					}
					break;
				} else {
					child = child.brother;
				}
			}
		} 
			
		else if (current.chars.length>activePoint.length&&current.chars[activePoint.length] == w) {// �л�ߣ����ڻ���ϲ���
			activePoint.length++;
			exist = true;
			if (current.chars.length == activePoint.length) {
				// �����ߵĳ����Ѵﵽ��ߵ����һ���ַ����򽫻����Ϊ��ߣ�ͬʱ�����Ϊnull��������Ϊ0
				activePoint.point = current;
				activePoint.index = null;
				activePoint.length = 0;
				
			}
			
		} 
		else {
			exist = false;
		}
//		System.out.println("find����"+activePoint.toString());
		return exist;
	}
	
	/**
	 * ���Ҹ����ַ����Ƿ������Ӵ�
	 * 
	 * @param word
	 * @return
	 */
	public boolean select(String word) {
		char[] chars = word.toCharArray();
		int index = 0;// ���ҵ��Ľڵ��ƥ���λ��
		// ���ҴӸ��ڵ㿪ʼ�������ӽڵ�
		Node start = root;
		for (int i = 0; i < chars.length; i++) {
			if (start.chars.length < index + 1) {// �����ǰ�ڵ���ƥ���꣬����ӽڵ㿪ʼ��ͬʱ������index==0
				index = 0;
				start = start.child;
				while (null != start) {
					// �Ƚϵ�ǰ�ڵ�ָ��λ��(index)���ַ��Ƿ���������ַ�һ��
					// �����Ǳ����ӽڵ㣬���������ƥ�任���ӽڵ����
					if (start.chars[index] == chars[i]) {
						index++;
						break;
					} else {
						start = start.brother;
					}
				}
				if (null == start) {// �ӽڵ�����궼��ƥ���򷵻�false
					return false;
				}
			} else if (start.chars[index] == chars[i]) {
				// �����ǰ���ҵ��Ľڵ�Ļ��пɱȽ��ַ�������бȽϣ������ͬ��ֱ�ӷ���false
				index++;
			} else {
				return false;
			}
		}
		return true;
	}
	/**
	 * ����node�ڵ�����к��Ҷ�ڵ��label(position)
	 * @param node
	 * @return
	 */
	
	public static ArrayList <Integer> getNodeAllLeafSonLabel(Node node){
		ArrayList <Integer> result = new ArrayList();
		
		if(node.chars[node.chars.length-1]=='$'){
			result.add(node.label);
		}
		else{
			Node child = node.child;
			while(null!=child){
				result.addAll(getNodeAllLeafSonLabel(child));
				child=child.brother;
			}
		}		
		return result;
	}
	
	/**
	 * ���Ҹ����ַ������ǰ׺����������alignmentЧ����õ���ʼλ�úͳ��ȣ�����(pos,len)��
	 * wordstartpos������word��ԭʼ�����п�ʼ��λ��
	 * @param word
	 * @return
	 */
	public int[] selectPrefixForAlignment(String word, int wordstartpos) {
		int[] back = new int[2];
		back[0]=-1;
		back[1]=0;
		//ȥ���е��Ӵ�
		word=word.substring(wordstartpos);
		
		char[] chars = word.toCharArray();
		int index = 0;// ���ҵ��Ľڵ��ƥ���λ��
		// ���ҴӸ��ڵ㿪ʼ�������ӽڵ�
		Node start = root;
		
		for (int i = 0; i < chars.length; i++) {
			if (start.chars.length < index + 1) {// �����ǰ�ڵ���ƥ���꣬����ӽڵ㿪ʼ��ͬʱ������index==0
				index = 0;
				start = start.child;

				while (null != start) {
					// �Ƚϵ�ǰ�ڵ�ָ��λ��(index)���ַ��Ƿ���������ַ�һ��
					// �����Ǳ����ӽڵ㣬���������ƥ�任���ӽڵ����
					
					if (start.chars.length>index&&start.chars[index] == chars[i]) {
						index++;
						break;
					} else if(null != start.brother){
						start = start.brother;						
					}
					else if (null == start.brother&&i>=minMatchLen){ //����һ����㣬ÿһ�����Ӷ�û�ܼ���ƥ����

						Integer[] startpos= (Integer[]) getNodeAllLeafSonLabel(start.father).toArray(new Integer[getNodeAllLeafSonLabel(start.father).size()]);
						int mindis=Integer.MAX_VALUE;
						int pos_j=-1;

						
						for(int j=0;j<startpos.length;j++){
							int tmp=Math.abs(startpos[j].intValue()-wordstartpos)-i;
							if(tmp<mindis){
								mindis=tmp;
								pos_j=startpos[j].intValue();
							}
						}

                        if(mindis<-minMatchLen){
						back[0]=pos_j;
						back[1]=i;
                        }
                        else{
                        	back[0]=-1;
    						back[1]=0;
                        }
											
						return back;						
					}else if(i<minMatchLen){
						back[0]=-1;
						back[1]=0;
											
						return back;
						
					}
				}

			} else if (start.chars[index] == chars[i]) {
				// �����ǰ���ҵ��Ľڵ�Ļ��пɱȽ��ַ�������бȽϣ������ͬ��ֱ�ӷ���false
				index++;
			} else if (i>=minMatchLen){
				//����һ���ߵ��м䣬��Ҷ�ڵ㣬��ΪҶ�ڵ���$,�϶���ͬ�������������

				Integer[] startpos= (Integer[]) getNodeAllLeafSonLabel(start).toArray(new Integer[getNodeAllLeafSonLabel(start).size()]);
				int mindis=Integer.MAX_VALUE;
				int pos_j=-1;

				for(int j=0;j<startpos.length;j++){
					int tmp=Math.abs(startpos[j].intValue()-wordstartpos)-i;
					if(tmp<mindis){
						mindis=tmp;
						pos_j=startpos[j].intValue();
						
					}
				}

				 if(mindis<-minMatchLen){
						back[0]=pos_j;
						back[1]=i;
                     }
                     else{
                     	back[0]=-1;
 						back[1]=0;
                     }
				
				return back;
			} else if(i<minMatchLen){
				back[0]=-1;
				back[1]=0;
									
				return back;
			}
		}
		//i��ͷ��

		
		Integer[] startpos= (Integer[]) getNodeAllLeafSonLabel(start).toArray(new Integer[getNodeAllLeafSonLabel(start).size()]);
		int mindis=Integer.MAX_VALUE;
		int pos_j=-1;
		for(int j=0;j<startpos.length;j++){
			int tmp=Math.abs(startpos[j].intValue()-wordstartpos);
			if(tmp<mindis){
				mindis=tmp;
				pos_j=startpos[j].intValue();
			}
		}

		back[0]=pos_j;
		back[1]=chars.length;
		return back;
	}

	/**
	 * ��ʽ����ӡ��������׺��
	 */
	public void print() {
		Node child = root.child;
		System.out.println("[root] [activePoint:(" + activePoint.point + "," + activePoint.index + ","
				+ activePoint.length + ")], [reminder:" + reminder + "]");
		while (child != null) {
			System.out.print("|����");
			child.print("    ");
			child = child.brother;
		}
	}

	/**
	 * <p>
	 * ��׺���Ľڵ㣬����
	 * ÿ���ڵ��chars���丸�׵��õ�ıߵ��ַ�����root�ڵ�û���ף�����chars=����
	 * </p>
	 */
	private class Node {
		public char[] chars;
		public Node child;
		public Node brother;
		public Node father;
		public Node suffixNode;
		//public ArrayList <Integer> position;  //������¼�ڲ��ڵ����к����Ҷ�ڵ����ĺ�׺����ʼλ�ã������Ҷ�ڵ��ֻ��һ������ֵ������������ĺ�׺����ʼλ��
		public int label;//��¼Ҷ�ڵ����ĺ�׺����ʼλ�ã��ڲ�������Ҳ��ֵ��Ҫͨ��chars������Ƿ���$���ж�
		public Node(char[] chars) {
			this.chars = chars;
			//position = new ArrayList();
		}

		@Override
		public String toString() {
			//return "Node [chars=" + String.valueOf(chars) + "]"+"position:"+String.valueOf(position);
			return "Node [chars=" + String.valueOf(chars) + "]";
		}

		public void print(String prefix) {
			System.out.print(String.valueOf(chars));
			if(chars[chars.length-1]=='$'){
				System.out.print(label);
			}
			if (null != this.suffixNode) {
				System.out.println("--" + String.valueOf(this.suffixNode.chars));
			} else {
				System.out.println();
			}
			Node child = this.child;
			while (null != child) {
				System.out.print(prefix + "|����");
				child.print(prefix + prefix);
				child = child.brother;
			}
		}
	}

	/**
	 * <p>
	 * ���(active point)��һ����Ԫ�飺(active_node,active_edge,active_length)
	 * ��ߵĸ�����point,������index�����Ӧ����point,��ȡ�洢���ַ���Ҫ�Ӷ���index��chars����(0,length)
	 * </p>
	 */
	private class ActivePoint {
		public Node point;
		public Node index;
		public int length;

		public ActivePoint(Node point, Node index, int length) {
			this.point = point;
			this.index = index;
			this.length = length;
		}

		@Override
		public String toString() {
			return "ActivePoint [point=" + point + ", index=" + index + ", length=" + length + "]";
		}
	}
	/**
	 * ��String��ʽ��,ɾ���Ƿ��ַ�(ֻ����agctn,�����ַ�ȫ���滻��n),ȫ��ת����Сд,uȫ������t
	 * @param s
	 * @return
	 */
	public static String format(String s){
		s=s.toLowerCase();
		s=s.replace('u', 't');
		StringBuffer sb = new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++){
			switch(sb.charAt(i)){
			case 'a': break;
			case 'c': break;
			case 'g': break;
			case 't': break;
			case 'n':break;
			default: sb=sb.replace(i, i+1, "n");
			}
		}
		
		
		return(sb.toString());
	}
	
	/**
	 * ����һ���ڵ㣬����Ӹ����ý��ı��ϵ��ַ���
	 * @param start
	 * @return
	 */
	
	public static String getNodeString(Node start){
		String s="";

		while(start.chars.length>0){
			s=String.valueOf(start.chars)+s;
			start=start.father;
		}
		s=String.valueOf(start.chars)+s;
		return s;
	}
	

	public static void main(String[] args) {

		SuffixTree tree = new SuffixTree();
		
		
		String s1="GATCACAGGTCTATCACCCTATTAACCACTCACGGGAGCTCTCCATGCATTTGGTATTTTCGTCTGGGGGGTGTGCACGCGATAGCATTGCGAGACGCTGGAGCCGGAGCACCCTATGTCGCAGTATCTGTCTTTGATTCCTGCCTCATCCTATTATTTATCGCACCTACGTTCAATATTACAGGCGAACATACTTACCAAGGTGTATTAATTAATTAATGCTTGTAGGACATAATAATAACAATTGAATGTCTGCACAGCCGCTTTCCACACAGACATCATAACAAAAAATTTCCACCAAACCCCCCCTCCCCCCGCTTCTGGCCACAGCACTTAAACACATCTCTGCCAAACCCCAAAAACAAAGAACCCTAACACCAGCCTAACCAGATTTCAAATTTTATCTTTTGGCGGTATGCACTTTTAACAGTCACCCCCCAACTAACACATTATTTTCCCCTCCCACTCCCATACTACTAATCTCATCAATACAACCCCCACCCATCCTACCCAGCACACACACACCGCTGCTAACCCCATACCCCGAACCAACCAAACCCCAAAGACACCCCCCACAGTTTATGTAGCTTACCTCCTCAAAGCAATACACTGAAAATGTTTAGACGGGCTCACATCACCCCATAAACAAATAGGTTTGGTCCTAGCCTTTCTATTAGCTCTTAGTAAGATTACACATGCAAGCATCCCCGTTCCAGTGAGTTCACCCTCTAAATCACCACGATCAAAAGGGACAAGCATCAAGCACGCAGCAATGCAGCTCAAAACGCTTAGCCTAGCCACACCCCCACGGGAAACAGCAGTGATTAGCCTTTAGCAATAAACGAAAGTTTAACTAAGCTATACTAACCCCAGGGTTGGTCAATTTCGTGCCAGCCACCGCGGTCACACGATTAACCCAAGTCAATAGAAGCCGGCGTAAAGAGTGTTTTAGATCACCCCCTCCCCAATAAAGCTAAAACTCACCTGAGTTGTAAAAAACTCCAGTTGACACAAAATAGACTACGAAAGTGGCTTTAACATATCTGAACACACAATAGCTAAGACCCAAACTGGGATTAGATACCCCACTATGCTTAGCCCTAAACCTCAACAGTTAAATCAACAAAACTGCTCGCCAGAACACTACGAGCCACAGCTTAAAACTCAAAGGACCTGGCGGTGCTTCATATCCCTCTAGAGGAGCCTGTTCTGTAATCGATAAACCCCGATCAACCTCACCACCTCTTGCTCAGCCTATATACCGCCATCTTCAGCAAACCCTGATGAAGGCTACAAAGTAAGCGCAAGTACCCACGTAAAGACGTTAGGTCAAGGTGTAGCCCATGAGGTGGCAAGAAATGGGCTACATTTTCTACCCCAGAAAACTACGATAGCCCTTATGAAACTTAAGGGTCGAAGGTGGATTTAGCAGTAAACTGAGAGTAGAGTGCTTAGTTGAACAGGGCCCTGAAGCGCGTACACACCGCCCGTCACCCTCCTCAAGTATACTTCAAAGGACATTTAACTAAAACCCCTACGCATTTATATAGAGGAGACAAGTCGTAACATGGTAAGTGTACTGGAAAGTGCACTTGGACGAACCAGAGTGTAGCTTAACACAAAGCACCCAACTTACACTTAGGAGATTTCAACTTAACTTGACCGCTCTGAGCTAAACCTAGCCCCAAACCCACTCCACCTTACTACCAGACAACCTTAGCCAAACCATTTACCCAAATAAAGTATAGGCGATAGAAATTGAAACCTGGCGCAATAGATATAGTACCGCAAGGGAAAGATGAAAAATTATAACCAAGCATAATATAGCAAGGACTAACCCCTATACCTTCTGCATAATGAATTAACTAGAAATAACTTTGCAAGGAGAGCCAAAGCTAAGACCCCCGAAACCAGACGAGCTACCTAAGAACAGCTAAAAGAGCACACCCGTCTATGTAGCAAAATAGTGGGAAGATTTATAGGTAGAGGCGACAAACCTACCGAGCCTGGTGATAGCTGGTTGTCCAAGATAGAATCTTAGTTCAACTTTAAATTTGCCCACAGAACCCTCTAAATCCCCTTGTAAATTTAACTGTTAGTCCAAAGAGGAACAGCTCTTTGGACACTAGGAAAAAACCTTGTAGAGAGAGTAAAAAATTTAACACCCATAGTAGGCCTAAAAGCAGCCACCAATTAAGAAAGCGTTCAAGCTCAACACCCACTACCTAAAAAATCCCAAACATATAACTGAACTCCTCACACCCAATTGGACCAATCTATCACCCTATAGAAGAACTAATGTTAGTATAAGTAACATGAAAACATTCTCCTCCGCATAAGCCTGCGTCAGATTAAAACACTGAACTGACAATTAACAGCCCAATATCTACAATCAACCAACAAGTCATTATTACCCTCACTGTCAACCCAACACAGGCATGCTCATAAGGAAAGGTTAAAAAAAGTAAAAGGAACTCGGCAAATCTTACCCCGCCTGTTTACCAAAAACATCACCTCTAGCATCACCAGTATTAGAGGCACCGCCTGCCCAGTGACACATGTTTAACGGCCGCGGTACCCTAACCGTGCAAAGGTAGCATAATCACTTGTTCCTTAAATAGGGACCTGTATGAATGGCTCCACGAGGGTTCAGCTGTCTCTTACTTTTAACCAGTGAAATTGACCTGCCCGTGAAGAGGCGGGCATGACACAGCAAGACGAGAAGACCCTATGGAGCTTTAATTTATTAATGCAAACAGTACCTAACAAACCCACAGGTCCTAAACTACCAAACCTGCATTAAAAATTTCGGTTGGGGCGACCTCGGAGCAAAACCCAACCTCCGAGCAGTACATGCTAAGACTTCACCAGTCAAAGCGAACTACTATACTCAATTGATCCAATAACTTGACCAACGGAACAAGTTACCCTAGGGATAACAGCGCAATCCTATTCTAGAGTCCATATCAACAATAGGGTTTACGACCTCGATGTTGGATCAGGACATCCCGATGGTGCAGCCGCTATTAAAGGTTCGTTTGTTCAACGATTAAAGTCCTACGTGATCTGAGTTCAGACCGGAGTAATCCAGGTCGGTTTCTATCTACTTCAAATTCCTCCCTGTACGAAAGGACAAGAGAAATAAGGCCTACTTCACAAAGCGCCTTCCCCCGTAAATGATATCATCTCAACTTAGTATTATACCCACACCCACCCAAGAACAGGGTTTGTTAAGATGGCAGAGCCCGGTAATCGCATAAAACTTAAAACTTTACAGTCAGAGGTTCAATTCCTCTTCTTAACAACATACCCATGGCCAACCTCCTACTCCTCATTGTACCCATTCTAATCGCAATGGCATTCCTAATGCTTACCGAACGAAAAATTCTAGGCTATATACAACTACGCAAAGGCCCCAACGTTGTAGGCCCCTACGGGCTACTACAACCCTTCGCTGACGCCATAAAACTCTTCACCAAAGAGCCCCTAAAACCCGCCACATCTACCATCACCCTCTACATCACCGCCCCGACCTTAGCTCTCACCATCGCTCTTCTACTATGAACCCCCCTCCCCATACCCAACCCCCTGGTCAACCTCAACCTAGGCCTCCTATTTATTCTAGCCACCTCTAGCCTAGCCGTTTACTCAATCCTCTGATCAGGGTGAGCATCAAACTCAAACTACGCCCTGATCGGCGCACTGCGAGCAGTAGCCCAAACAATCTCATATGAAGTCACCCTAGCCATCATTCTACTATCAACATTACTAATAAGTGGCTCCTTTAACCTCTCCACCCTTATCACAACACAAGAACACCTCTGATTACTCCTGCCATCATGACCCTTGGCCATAATATGATTTATCTCCACACTAGCAGAGACCAACCGAACCCCCTTCGACCTTGCCGAAGGGGAGTCCGAACTAGTCTCAGGCTTCAACATCGAATACGCCGCAGGCCCCTTCGCCCTATTCTTCATAGCCGAATACACAAACATTATTATAATAAACACCCTCACCACTACAATCTTCCTAGGAACAACATATGACGCACTCTCCCCTGAACTCTACACAACATATTTTGTCACCAAGACCCTACTTCTAACCTCCCTGTTCCTATGAATTCGAACAGCATACCCCCGATTCCGCTACGACCAACTCATACACCTCCTATGAAAAAACTTCCTACCACTCACCCTAGCATTACTTATATGATATGTCTCCATACCCATTACAATCTCCAGCATTCCCCCTCAAACCTAAGAAATATGTCTGATAAAAGAGTTACTTTGATAGAGTAAATAATAGGAGCTTAAACCCCCTTATTTCTAGGACTATGAGAATCGAACCCATCCCTGAGAATCCAAAATTCTCCGTGCCACCTATCACACCCCATCCTAAAGTAAGGTCAGCTAAATAAGCTATCGGGCCCATACCCCGAAAATGTTGGTTATACCCTTCCCGTACTAATTAATCCCCTGGCCCAACCCGTCATCTACTCTACCATCTTTGCAGGCACACTCATCACAGCGCTAAGCTCGCACTGATTTTTTACCTGAGTAGGCCTAGAAATAAACATGCTAGCTTTTATTCCAGTTCTAACCAAAAAAATAAACCCTCGTTCCACAGAAGCTGCCATCAAGTATTTCCTCACGCAAGCAACCGCATCCATAATCCTTCTAATAGCTATCCTCTTCAACAATATACTCTCCGGACAATGAACCATAACCAATACTACCAATCAATACTCATCATTAATAATCATAATGGCTATAGCAATAAAACTAGGAATAGCCCCCTTTCACTTCTGAGTCCCAGAAGTTACCCAAGGCACCCCTCTGACATCCGGCCTGCTTCTTCTCACATGACAAAAACTAGCCCCCATCTCAATCATATACCAAATCTCTCCCTCACTAAACGTAAGCCTTCTCCTCACTCTCTCAATCTTATCCATCATAGCAGGCAGTTGAGGTGGATTAAACCAAACCCAGCTACGCAAAATCTTAGCATACTCCTCAATTACCCACATAGGATGAATAATAGCAGTTCTACCGTACAACCCTAACATAACCATTCTTAATTTAACTATTTATATTATCCTAACTACTACCGCATTCCTACTACTCAACTTAAACTCCAGCACCACGACCCTACTACTATCTCGCACCTGAAACAAGCTAACATGACTAACACCCTTAATTCCATCCACCCTCCTCTCCCTAGGAGGCCTGCCCCCGCTAACCGGCTTTTTGCCCAAATGGGCCATTATCGAAGAATTCACAAAAAACAATAGCCTCATCATCCCCACCATCATAGCCACCATCACCCTCCTTAACCTCTACTTCTACCTACGCCTAATCTACTCCACCTCAATCACACTACTCCCCATATCTAACAACGTAAAAATAAAATGACAGTTTGAACATACAAAACCCACCCCATTCCTCCCCACACTCATCGCCCTTACCACGCTACTCCTACCTATCTCCCCTTTTATACTAATAATCTTATAGAAATTTAGGTTAAATACAGACCAAGAGCCTTCAAAGCCCTCAGTAAGTTGCAATACTTAATTTCTGTAACAGCTAAGGACTGCAAAACCCCACTCTGCATCAACTGAACGCAAATCAGCCACTTTAATTAAGCTAAGCCCTTACTAGACCAATGGGACTTAAACCCACAAACACTTAGTTAACAGCTAAGCACCCTAATCAACTGGCTTCAATCTACTTCTCCCGCCGCCGGGAAAAAAGGCGGGAGAAGCCCCGGCAGGTTTGAAGCTGCTTCTTCGAATTTGCAATTCAATATGAAAATCACCTCGGAGCTGGTAAAAAGAGGCCTAACCCCTGTCTTTAGATTTACAGTCCAATGCTTCACTCAGCCATTTTACCTCACCCCCACTGATGTTCGCCGACCGTTGACTATTCTCTACAAACCACAAAGACATTGGAACACTATACCTATTATTCGGCGCATGAGCTGGAGTCCTAGGCACAGCTCTAAGCCTCCTTATTCGAGCCGAACTGGGCCAGCCAGGCAACCTTCTAGGTAACGACCACATCTACAACGTTATCGTCACAGCCCATGCATTTGTAATAATCTTCTTCATAGTAATACCCATCATAATCGGAGGCTTTGGCAACTGACTAGTTCCCCTAATAATCGGTGCCCCCGATATGGCGTTTCCCCGCATAAACAACATAAGCTTCTGACTCTTACCTCCCTCTCTCCTACTCCTGCTCGCATCTGCTATAGTGGAGGCCGGAGCAGGAACAGGTTGAACAGTCTACCCTCCCTTAGCAGGGAACTACTCCCACCCTGGAGCCTCCGTAGACCTAACCATCTTCTCCTTACACCTAGCAGGTGTCTCCTCTATCTTAGGGGCCATCAATTTCATCACAACAATTATCAACATAAAACCCCCTGCCATAACCCAATACCAAACGCCCCTCTTCGTCTGATCCGTCCTAATCACAGCAGTCCTACTTCTCCTATCTCTCCCAGTCCTAGCTGCTGGCATCACTATACTACTAACAGACCGCAACCTCAACACCACCTTCTTCGACCCCGCCGGAGGAGGAGACCCCATTCTATACCAACACCTATTCTGATTTTTCGGTCACCCTGAAGTTTATATTCTTATCCTACCAGGCTTCGGAATAATCTCCCATATTGTAACTTACTACTCCGGAAAAAAAGAACCATTTGGATACATAGGTATGGTCTGAGCTATGATATCAATTGGCTTCCTAGGGTTTATCGTGTGAGCACACCATATATTTACAGTAGGAATAGACGTAGACACACGAGCATATTTCACCTCCGCTACCATAATCATCGCTATCCCCACCGGCGTCAAAGTATTTAGCTGACTCGCCACACTCCACGGAAGCAATATGAAATGATCTGCTGCAGTGCTCTGAGCCCTAGGATTCATCTTTCTTTTCACCGTAGGTGGCCTGACTGGCATTGTATTAGCAAACTCATCACTAGACATCGTACTACACGACACGTACTACGTTGTAGCTCACTTCCACTATGTCCTATCAATAGGAGCTGTATTTGCCATCATAGGAGGCTTCATTCACTGATTTCCCCTATTCTCAGGCTACACCCTAGACCAAACCTACGCCAAAATCCATTTCACTATCATATTCATCGGCGTAAATCTAACTTTCTTCCCACAACACTTTCTCGGCCTATCCGGAATGCCCCGACGTTACTCGGACTACCCCGATGCATACACCACATGAAACATCCTATCATCTGTAGGCTCATTCATTTCTCTAACAGCAGTAATATTAATAATTTTCATGATTTGAGAAGCCTTCGCTTCGAAGCGAAAAGTCCTAATAGTAGAAGAACCCTCCATAAACCTGGAGTGACTATATGGATGCCCCCCACCCTACCACACATTCGAAGAACCCGTATACATAAAATCTAGACAAAAAAGGAAGGAATCGAACCCCCCAAAGCTGGTTTCAAGCCAACCCCATGGCCTCCATGACTTTTTCAAAAAGGTATTAGAAAAACCATTTCATAACTTTGTCAAAGTTAAATTATAGGCTAAATCCTATATATCTTAATGGCACATGCAGCGCAAGTAGGTCTACAAGACGCTACTTCCCCTATCATAGAAGAGCTTATCACCTTTCATGATCACGCCCTCATAATCATTTTCCTTATCTGCTTCCTAGTCCTGTATGCCCTTTTCCTAACACTCACAACAAAACTAACTAATACTAACATCTCAGACGCTCAGGAAATAGAAACCGTCTGAACTATCCTGCCCGCCATCATCCTAGTCCTCATCGCCCTCCCATCCCTACGCATCCTTTACATAACAGACGAGGTCAACGATCCCTCCCTTACCATCAAATCAATTGGCCACCAATGGTACTGAACCTACGAGTACACCGACTACGGCGGACTAATCTTCAACTCCTACATACTTCCCCCATTATTCCTAGAACCAGGCGACCTGCGACTCCTTGACGTTGACAATCGAGTAGTACTCCCGATTGAAGCCCCCATTCGTATAATAATTACATCACAAGACGTCTTGCACTCATGAGCTGTCCCCACATTAGGCTTAAAAACAGATGCAATTCCCGGACGTCTAAACCAAACCACTTTCACCGCTACACGACCGGGGGTATACTACGGTCAATGCTCTGAAATCTGTGGAGCAAACCACAGTTTCATACCCATCGTCCTAGAATTAATTCCCCTAAAAATCTTTGAAATAGGGCCCGTATTTACCCTATAGCACCCCCTCTAGAGCCCACTGTAAAGCTAACTTAGCATTAACCTTTTAAGTTAAAGATTAAGAGAACCAACACCTCTTTACAGTGAAATGCCCCAACTAAATACTACCGTATGGCCCACCATAATTACCCCCATACTCCTTACACTATTCCTCATCACCCAACTAAAAATATTAAACACAAACTACCACCTACCTCCCTCACCAAAGCCCATAAAAATAAAAAATTATAACAAACCCTGAGAACCAAAATGAACGAAAATCTGTTCGCTTCATTCATTGCCCCCACAATCCTAGGCCTACCCGCCGCAGTACTGATCATTCTATTTCCCCCTCTATTGATCCCCACCTCCAAATATCTCATCAACAACCGACTAATCACCACCCAACAATGACTAATCAAACTAACCTCAAAACAAATGATAACCATACACAACACTAAAGGACGAACCTGATCTCTTATACTAGTATCCTTAATCATTTTTATTGCCACAACTAACCTCCTCGGACTCCTGCCTCACTCATTTACACCAACCACCCAACTATCTATAAACCTAGCCATGGCCATCCCCTTATGAGCGGGCGCAGTGATTATAGGCTTTCGCTCTAAGATTAAAAATGCCCTAGCCCACTTCTTACCACAAGGCACACCTACACCCCTTATCCCCATACTAGTTATTATCGAAACCATCAGCCTACTCATTCAACCAATAGCCCTGGCCGTACGCCTAACCGCTAACATTACTGCAGGCCACCTACTCATGCACCTAATTGGAAGCGCCACCCTAGCAATATCAACCATTAACCTTCCCTCTACACTTATCATCTTCACAATTCTAATTCTACTGACTATCCTAGAAATCGCTGTCGCCTTAATCCAAGCCTACGTTTTCACACTTCTAGTAAGCCTCTACCTGCACGACAACACATAATGACCCACCAATCACATGCCTATCATATAGTAAAACCCAGCCCATGACCCCTAACAGGGGCCCTCTCAGCCCTCCTAATGACCTCCGGCCTAGCCATGTGATTTCACTTCCACTCCATAACGCTCCTCATACTAGGCCTACTAACCAACACACTAACCATATACCAATGATGGCGCGATGTAACACGAGAAAGCACATACCAAGGCCACCACACACCACCTGTCCAAAAAGGCCTTCGATACGGGATAATCCTATTTATTACCTCAGAAGTTTTTTTCTTCGCAGGATTTTTCTGAGCCTTTTACCACTCCAGCCTAGCCCCTACCCCCCAATTAGGAGGGCACTGGCCCCCAACAGGCATCACCCCGCTAAATCCCCTAGAAGTCCCACTCCTAAACACATCCGTATTACTCGCATCAGGAGTATCAATCACCTGAGCTCACCATAGTCTAATAGAAAACAACCGAAACCAAATAATTCAAGCACTGCTTATTACAATTTTACTGGGTCTCTATTTTACCCTCCTACAAGCCTCAGAGTACTTCGAGTCTCCCTTCACCATTTCCGACGGCATCTACGGCTCAACATTTTTTGTAGCCACAGGCTTCCACGGACTTCACGTCATTATTGGCTCAACTTTCCTCACTATCTGCTTCATCCGCCAACTAATATTTCACTTTACATCCAAACATCACTTTGGCTTCGAAGCCGCCGCCTGATACTGGCATTTTGTAGATGTGGTTTGACTATTTCTGTATGTCTCCATCTATTGATGAGGGTCTTACTCTTTTAGTATAAATAGTACCGTTAACTTCCAATTAACTAGTTTTGACAACATTCAAAAAAGAGTAATAAACTTCGCCTTAATTTTAATAATCAACACCCTCCTAGCCTTACTACTAATAATTATTACATTTTGACTACCACAACTCAACGGCTACATAGAAAAATCCACCCCTTACGAGTGCGGCTTCGACCCTATATCCCCCGCCCGCGTCCCTTTCTCCATAAAATTCTTCTTAGTAGCTATTACCTTCTTATTATTTGATCTAGAAATTGCCCTCCTTTTACCCCTACCATGAGCCCTACAAACAACTAACCTGCCACTAATAGTTATGTCATCCCTCTTATTAATCATCATCCTAGCCCTAAGTCTGGCCTATGAGTGACTACAAAAAGGATTAGACTGAACCGAATTGGTATATAGTTTAAACAAAACGAATGATTTCGACTCATTAAATTATGATAATCATATTTACCAAATGCCCCTCATTTACATAAATATTATACTAGCATTTACCATCTCACTTCTAGGAATACTAGTATATCGCTCACACCTCATATCCTCCCTACTATGCCTAGAAGGAATAATACTATCGCTGTTCATTATAGCTACTCTCATAACCCTCAACACCCACTCCCTCTTAGCCAATATTGTGCCTATTGCCATACTAGTCTTTGCCGCCTGCGAAGCAGCGGTGGGCCTAGCCCTACTAGTCTCAATCTCCAACACATATGGCCTAGACTACGTACATAACCTAAACCTACTCCAATGCTAAAACTAATCGTCCCAACAATTATATTACTACCACTGACATGACTTTCCAAAAAACACATAATTTGAATCAACACAACCACCCACAGCCTAATTATTAGCATCATCCCTCTACTATTTTTTAACCAAATCAACAACAACCTATTTAGCTGTTCCCCAACCTTTTCCTCCGACCCCCTAACAACCCCCCTCCTAATACTAACTACCTGACTCCTACCCCTCACAATCATGGCAAGCCAACGCCACTTATCCAGTGAACCACTATCACGAAAAAAACTCTACCTCTCTATACTAATCTCCCTACAAATCTCCTTAATTATAACATTCACAGCCACAGAACTAATCATATTTTATATCTTCTTCGAAACCACACTTATCCCCACCTTGGCTATCATCACCCGATGAGGCAACCAGCCAGAACGCCTGAACGCAGGCACATACTTCCTATTCTACACCCTAGTAGGCTCCCTTCCCCTACTCATCGCACTAATTTACACTCACAACACCCTAGGCTCACTAAACATTCTACTACTCACTCTCACTGCCCAAGAACTATCAAACTCCTGAGCCAACAACTTAATATGACTAGCTTACACAATAGCTTTTATAGTAAAGATACCTCTTTACGGACTCCACTTATGACTCCCTAAAGCCCATGTCGAAGCCCCCATCGCTGGGTCAATAGTACTTGCCGCAGTACTCTTAAAACTAGGCGGCTATGGTATAATACGCCTCACACTCATTCTCAACCCCCTGACAAAACACATAGCCTACCCCTTCCTTGTACTATCCCTATGAGGCATAATTATAACAAGCTCCATCTGCCTACGACAAACAGACCTAAAATCGCTCATTGCATACTCTTCAATCAGCCACATAGCCCTCGTAGTAACAGCCATTCTCATCCAAACCCCCTGAAGCTTCACCGGCGCAGTCATTCTCATAATCGCCCACGGACTTACATCCTCATTACTATTCTGCCTAGCAAACTCAAACTACGAACGCACTCACAGTCGCATCATAATCCTCTCTCAAGGACTTCAAACTCTACTCCCACTAATAGCTTTTTGATGACTTCTAGCAAGCCTCGCTAACCTCGCCTTACCCCCCACTATTAACCTACTGGGAGAACTCTCTGTGCTAGTAACCACGTTCTCCTGATCAAATATCACTCTCCTACTTACAGGACTCAACATACTAGTCACAGCCCTATACTCCCTCTACATATTTACCACAACACAATGGGGCTCACTCACCCACCACATTAACAACATAAAACCCTCATTCACACGAGAAAACACCCTCATGTTCATACACCTATCCCCCATTCTCCTCCTATCCCTCAACCCCGACATCATTACCGGGTTTTCCTCTTGTAAATATAGTTTAACCAAAACATCAGATTGTGAATCTGACAACAGAGGCTTACGACCCCTTATTTACCGAGAAAGCTCACAAGAACTGCTAACTCATGCCCCCATGTCTAACAACATGGCTTTCTCAACTTTTAAAGGATAACAGCTATCCATTGGTCTTAGGCCCCAAAAATTTTGGTGCAACTCCAAATAAAAGTAATAACCATGCACACTACTATAACCACCCTAACCCTGACTTCCCTAATTCCCCCCATCCTTACCACCCTCGTTAACCCTAACAAAAAAAACTCATACCCCCATTATGTAAAATCCATTGTCGCATCCACCTTTATTATCAGTCTCTTCCCCACAACAATATTCATGTGCCTAGACCAAGAAGTTATTATCTCGAACTGACACTGAGCCACAACCCAAACAACCCAGCTCTCCCTAAGCTTCAAACTAGACTACTTCTCCATAATATTCATCCCTGTAGCATTGTTCGTTACATGGTCCATCATAGAATTCTCACTGTGATATATAAACTCAGACCCAAACATTAATCAGTTCTTCAAATATCTACTCATCTTCCTAATTACCATACTAATCTTAGTTACCGCTAACAACCTATTCCAACTGTTCATCGGCTGAGAGGGCGTAGGAATTATATCCTTCTTGCTCATCAGTTGATGATACGCCCGAGCAGATGCCAACACAGCAGCCATTCAAGCAATCCTATACAACCGTATCGGCGATATCGGTTTCATCCTCGCCTTAGCATGATTTATCCTACACTCCAACTCATGAGACCCACAACAAATAGCCCTTCTAAACGCTAATCCAAGCCTCACCCCACTACTAGGCCTCCTCCTAGCAGCAGCAGGCAAATCAGCCCAATTAGGTCTCCACCCCTGACTCCCCTCAGCCATAGAAGGCCCCACCCCAGTCTCAGCCCTACTCCACTCAAGCACTATAGTTGTAGCAGGAATCTTCTTACTCATCCGCTTCCACCCCCTAGCAGAAAATAGCCCACTAATCCAAACTCTAACACTATGCTTAGGCGCTATCACCACTCTGTTCGCAGCAGTCTGCGCCCTTACACAAAATGACATCAAAAAAATCGTAGCCTTCTCCACTTCAAGTCAACTAGGACTCATAATAGTTACAATCGGCATCAACCAACCACACCTAGCATTCCTGCACATCTGTACCCACGCCTTCTTCAAAGCCATACTATTTATGTGCTCCGGGTCCATCATCCACAACCTTAACAATGAACAAGATATTCGAAAAATAGGAGGACTACTCAAAACCATACCTCTCACTTCAACCTCCCTCACCATTGGCAGCCTAGCATTAGCAGGAATACCTTTCCTCACAGGTTTCTACTCCAAAGACCACATCATCGAAACCGCAAACATATCATACACAAACGCCTGAGCCCTATCTATTACTCTCATCGCTACCTCCCTAACAAGCGCCTATAGCACTCGAATAATTCTTCTCACCCTAACAGGTCAACCTCGCTTCCCCACCCTTACTAACATTAACGAAAATAACCCCACCCTACTAAACCCCATTAAACGCCTGGCAGCCGGAAGCCTATTCGCAGGATTTCTCATTACTAACAACATTTCCCCCGCATCCCCCTTCCAAACAACAATCCCCCTCTACCTAAAACTCACAGCCCTCGCTGTCACTTTCCTAGGACTTCTAACAGCCCTAGACCTCAACTACCTAACCAACAAACTTAAAATAAAATCCCCACTATGCACATTTTATTTCTCCAACATACTCGGATTCTACCCTAGCATCACACACCGCACAATCCCCTATCTAGGCCTTCTTACGAGCCAAAACCTGCCCCTACTCCTCCTAGACCTAACCTGACTAGAAAAGCTATTACCTAAAACAATTTCACAGCACCAAATCTCCACCTCCATCATCACCTCAACCCAAAAAGGCATAATTAAACTTTACTTCCTCTCTTTCTTCTTCCCACTCATCCTAACCCTACTCCTAATCACATAACCTATTCCCCCGAGCAATCTCAATTACAATATATACACCAACAAACAATGTTCAACCAGTAACTACTACTAATCAACGCCCATAATCATACAAAGCCCCCGCACCAATAGGATCCTCCCGAATCAACCCTGACCCCTCTCCTTCATAAATTATTCAGCTTCCTACACTATTAAAGTTTACCACAACCACCACCCCATCATACTCTTTCACCCACAGCACCAATCCTACCTCCATCGCTAACCCCACTAAAACACTCACCAAGACCTCAACCCCTGACCCCCATGCCTCAGGATACTCCTCAATAGCCATCGCTGTAGTATATCCAAAGACAACCATCATTCCCCCTAAATAAATTAAAAAAACTATTAAACCCATATAACCTCCCCCAAAATTCAGAATAATAACACACCCGACCACACCGCTAACAATCAATACTAAACCCCCATAAATAGGAGAAGGCTTAGAAGAAAACCCCACAAACCCCATTACTAAACCCACACTCAACAGAAACAAAGCATACATCATTATTCTCGCACGGACTACAACCACGACCAATGATATGAAAAACCATCGTTGTATTTCAACTACAAGAACACCAATGACCCCAATACGCAAAATTAACCCCCTAATAAAATTAATTAACCACTCATTCATCGACCTCCCCACCCCATCCAACATCTCCGCATGATGAAACTTCGGCTCACTCCTTGGCGCCTGCCTGATCCTCCAAATCACCACAGGACTATTCCTAGCCATGCACTACTCACCAGACGCCTCAACCGCCTTTTCATCAATCGCCCACATCACTCGAGACGTAAATTATGGCTGAATCATCCGCTACCTTCACGCCAATGGCGCCTCAATATTCTTTATCTGCCTCTTCCTACACATCGGGCGAGGCCTATATTACGGATCATTTCTCTACTCAGAAACCTGAAACATCGGCATTATCCTCCTGCTTGCAACTATAGCAACAGCCTTCATAGGCTATGTCCTCCCGTGAGGCCAAATATCATTCTGAGGGGCCACAGTAATTACAAACTTACTATCCGCCATCCCATACATTGGGACAGACCTAGTTCAATGAGTCTGAGGAGGCTACTCAGTAGACAGTCCCACCCTCACACGATTCTTTACCTTTCACTTCATCTTGCCCTTCATTATTGCAGCCCTAGCAGCACTCCACCTCCTATTCTTGCACGAAACGGGATCAAACAACCCCCTAGGAATCACCTCCCATTCCGATAAAATCACCTTCCACCCTTACTACACAATCAAAGACGCCCTCGGCTTACTTCTCTTCCTTCTCTCCTTAATGACATTAACACTATTCTCACCAGACCTCCTAGGCGACCCAGACAATTATACCCTAGCCAACCCCTTAAATACCCCTCCCCACATCAAGCCCGAATGATATTTCCTATTCGCCTACACAATTCTCCGATCCGTCCCTAACAAACTAGGAGGCGTCCTTGCCCTATTACTATCCATCCTCATCCTAGCAATAATCCCCATCCTCCATATATCCAAACAACAAAGCATAATATTTCGCCCACTAAGCCAATCACTTTATTGACTCCTAGCCGCAGACCTCCTCATTCTAACCTGAATCGGAGGACAACCAGTAAGCTACCCTTTTACCATCATTGGACAAGTAGCATCCGTACTATACTTCACAACAATCCTAATCCTAATACCAACTATCTCCCTAATTGAAAACAAAATACTCAAATGGGCCTGTCCTTGTAGTATAAACTAATACACCAGTCTTGTAAACCGGAGATGAAAACCTTTTTCCAAGGACAAATCAGAGAAAAAGTCTTTAACTCCACCATTAGCACCCAAAGCTAAGATTCTAATTTAAACTATTCTCTGTTCTTTCATGGGGAAGCAGATTTGGGTACCACCCAAGTATTGACTCACCCATCAACAACCGCTATGTATTTCGTACATTACTGCCAGCCACCATGAATATTGTACGGTACCACAAATACTTGACCACCTGTAGTACATAAAAACCCAATCCACATCAAACCCCCCCCCCCATGCTTACAAGCAAGTACAGCAACCAACCCTCAACTATCACACATCAACTGCAACTCCAAAGCCACCCCTCACCCACTAGGATACCAACAGACCTACCCACCCTTAACAGTACATAGTACATAAAGCCATTTACCGTACATAGCACATTACAGTCAAATCCCTTCTCGTCCCCATGGATGACCCCCCTCAGATAGGGGTCCCTTGACCACCATCCTCCGTGAAATCAATATCCCGCACAAGAGTGCTACTCTCCTCGCTCCGGGCCCATAACACTTGGGGGTAGCTAAAGTGAACTGTATCCGACATCTGGTTCCTACTTCAGGGCCATAAAGCCTAAATAGCCCACACGTTCCCCTTAAATAAGACATCACGATG";
	//	String s1 ="ACACCGATGAGTCTGTCACGCGATAGCATGACGCTGCACCCTATGCTCGATAGCATTGCGAC";
		//String s1 ="ACACCGATGAGTCTGTCACGCGATAGCATGAC";
		//String s1 ="ACCACAACACCACAACACCACCACAACACCACCAACCACCT";
		//String s1 ="CACAACACCAC";
		//String s1="GGGAGCCATGCATT";
		s1=format(s1)+"$";
		tree.build(s1);  
	  //  tree.print();
		
		//System.out.println(String.valueOf(tree.root.child.position));
		
		//System.out.println(String.valueOf(tree.root.child.chars));
	/*
		Node start=tree.root.child.brother.child.child.child;
		Integer[] startpos= (Integer[]) getNodeAllLeafSonLabel(start).toArray(new Integer[getNodeAllLeafSonLabel(start).size()]);
		System.out.println(Arrays.toString(startpos));
		System.out.println(getNodeString(start));
	*/	
		System.out.println(tree.select("$"));
		//String word = "aab";
		//System.out.println(Arrays.toString(tree.selectPrefixForAlignment(word,0)));

System.out.println("OK!");
	}
}
