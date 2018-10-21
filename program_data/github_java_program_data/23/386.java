package DataStruct;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��17�� ����11:32:42
* ��˵��: ��������Ķ� ��Ծ��
*/

import java.util.Random;

class SkipList<T>{
	
	// ͷβָ��
	private SkipListNode<T> head, tail;
	private int nodes; // �ڵ���
	private int listLevel; // ����
	private static final double PROBABILITY=0.5;//��������һ���ĸ���
	private Random random;
	public SkipList() {
		random = new Random();
		clear(); // ÿһ�δ���һ���µ���Ծ���ʱ�򣬶�Ҫclearһ��
	}
	
	// �����Ծ��
	public void clear() {
		head = new SkipListNode<T>(SkipListNode.HEAD_KEY, null);
		tail = new SkipListNode<T>(SkipListNode.TAIL_KEY, null);
		
		listLevel = 0; // ����Ϊ0
		nodes = 0; // �ڵ���Ϊ0
		horizontalLink(head, tail);
	}
	public boolean isEmpty() {
		return nodes == 0; // �ڵ����Ƿ�Ϊ0
	}
	public int size() {
		return nodes; // ���ؽڵ�����
	}
	
	// Ѱ�ҽڵ�
	private SkipListNode<T> findNode(int key) {
		SkipListNode<T> p = head; // ��ͷ��㿪ʼ����
		while (true) {
			while (p.right.key != SkipListNode.TAIL_KEY && p.right.key <= key) {
				p = p.right; // ���� ����
			}
			if (p.down != null) {
				p = p.down; // ����һ�� ��̽����
			}
			else {
				break;
			}
		}
		return p;
	}
	// �����Ƿ�洢key, ���ڷ��ظýڵ㣬���򷵻�null
	public SkipListNode<T> search(int key) {
		SkipListNode<T> p = findNode(key);
		
        if (key == p.getKey()) {
            return p;
        } else {
            return null;
        }
	}
	
	// ����Ծ�������� key-value��
	public void put(int k, T v) {
		// ����̽�����������Ƿ��и�key�Ľڵ�, ����ֱ���滻v�� ����
		SkipListNode<T> p = findNode(k);
		if (k == p.getKey()) {
			p.value = v;
			return;
		}
		// �����½ڵ���뵽 ��Ծ����
		SkipListNode<T> newNode = new SkipListNode<T>(k, v);
		backlink(p, newNode);
		int currentLevel=0; //��ǰ���ڵĲ㼶��0
		// ���ѡ�� ����Ľڵ��Ƿ�����
		while (random.nextDouble() < PROBABILITY) {
			//��������˸߶ȣ���Ҫ���½�һ������
            if (currentLevel >= listLevel) {
            	
                listLevel++;
                SkipListNode<T> p1=new SkipListNode<T>(SkipListNode.HEAD_KEY, null);
                SkipListNode<T> p2=new SkipListNode<T>(SkipListNode.TAIL_KEY, null);
                horizontalLink(p1, p2);
                vertiacallLink(p1, head);
                vertiacallLink(p2, tail);
                
                head=p1;
                tail=p2;
            }
            //��p�ƶ�����һ��
            while (p.up==null) {
                p=p.left;
            }
            p=p.up;

            SkipListNode<T> e=new SkipListNode<T>(k, null);//ֻ����key��ok
            backlink(p, e);//��e���뵽p�ĺ���
            vertiacallLink(e, newNode);//��e��q��������
            newNode=e;
            currentLevel++;
		}
		nodes++;
		
	}
	
	// ˮƽ˫�����������ڵ�
	private void horizontalLink(SkipListNode<T> a, SkipListNode<T> b) {
		a.right = b;
		b.left = a; 
	}
	// ����Ҫ��after�ڵ���뵽before�ڵ�֮��
	// �ⲻ��������ѧ����˫������� �ڵ���뷽����
	private void backlink(SkipListNode<T> before, SkipListNode<T> after) {
		after.left = before;
		after.right = before.right;
		before.right.left = after;
		before.right = after;
	}
	
	
	// ��ֱ���������ڵ�
	private void vertiacallLink(SkipListNode<T> node1,SkipListNode<T> node2){
        node1.down=node2;
        node2.up=node1;
    }
	
	// ��ӡ�� ��Ծ��
	@Override
	public String toString() {
		if (isEmpty()) {
            return "��Ծ��Ϊ�գ�";
        }
        StringBuilder builder=new StringBuilder();
        SkipListNode<T> p=head;
        while (p.down!=null) {
            p=p.down;
        }

        while (p.left!=null) {
            p=p.left;
        }
        if (p.right!=null) {
            p=p.right;
        }
        while (p.right!=null) {
            builder.append(p);
            builder.append("\n");
            p=p.right;
        }

        return builder.toString();
	}
	
}
