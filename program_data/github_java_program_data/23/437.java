package DataStruct;

import org.hamcrest.core.IsInstanceOf;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��16�� ���� 12:57:15
* ��˵��:  ��Ծ��Ľڵ��࣬ ������key-value left, right,up,down �ĸ�ָ��
*  ����� https://blog.csdn.net/BrilliantEagle/article/details/52206261 ��code
*/
public class SkipListNode<T> {
	public int key;
	public T value;
	public SkipListNode<T> up, down, left, right; // ���������ĸ�ָ��
	public static final int HEAD_KEY = Integer.MIN_VALUE;
	public static final int TAIL_KEY = Integer.MAX_VALUE;
	// ���캯��
	public SkipListNode(int k, T V) {
		this.key = k;
		this.value = V;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	// ��д�� equals() ���ڱȽ�
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SkipListNode<?>)) {
			return false;
		}
		SkipListNode<T> other = (SkipListNode<T>)obj; // ǿת����
		try{
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.toString());
		}
		return other.key == key && other.value == value;
		
	}
	@Override
	public String toString() {
		return "Key-Value: " + key + "-" + value;
	}

}
