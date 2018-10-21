package algorism;
/**
 * ȫ����
 * @author zhonglijunyi<br>
 * ������nextLargestPermutation(char[])
 * 		���ֵ���,������һ����������<br>
 * �и�����
 */
public class Permutation {
	
	/**
	 * �и���Ŀ����1,2,2,3,4,5��ȫ���У�����,4���ڵ���λ��1��5����һ��
	 * @param args
	 */
	public static void main(String[] args) {
		char a[] = {'1','2','2','3','4','5'};
		String str;
		int i,count = 1;
		str = new String(a);
		System.out.println(str);
		for(i = 0; i < 720; i++){
			if(nextLargestPermutation(a)){//���ֵ���,������һ����������
				if(check(a)){			//���a��˳���Ƿ����Ҫ��
					count ++;
					str = new String(a);
					System.out.println(str);
				}
			}
		}
		System.out.println("�������������У�"+count+"����");
	}
	
	/**
	 * ���a��˳���Ƿ����Ҫ��4���ڵ���λ��1��5����һ��
	 * @param a һ�����飬��ʾ����
	 * @return ����Ҫ�󷵻�true
	 */
	private static boolean check(char[] a){
		if(a[2] == '4')//4�ڵ���λ��
			return false;
		int i = 0;
		//������һ�� 1��5 ���ֵ�λ��
		while((a[i] != '5') && (a[i]!='1')){
			i++;
		}
		//��һ���� 1��5
		if(a[i+1] == '1' || a[i+1] == '5')
			return false;
		return true;
	}
	
	/**
	 * ���ֵ���,������һ����������
	 * @param a һ������
	 * @return �����һ��������򷵻�true;
	 */
	public static boolean nextLargestPermutation(char[] a){
		int j = a.length - 2;
		while(a[j] >= a[j+1]){
			j--;
			if(j < 0)
				return false;
		}
		//now j is the largest subscript(�±�) with a[j] < a[j+1]
		int k = a.length - 1;
		while(a[j] >= a[k]){
			k--;
		}
		//a[k] is the smallest integer greater than a[j] to the right of a[j]
		//interchange a[j] and a[k]
		//System.out.println("j="+j+",k="+k);
		char temp;
		temp = a[j];
		a[j] = a[k];
		a[k] = temp;
		int r = a.length - 1;
		int s = j + 1;
		//System.out.println("r="+r+",s="+s);
		while(r > s){
			//interchange a[r] and a[s]
			temp = a[r];
			a[r] = a[s];
			a[s] = temp;
			r--;
			s++;
		}
		//this puts the tail end of the permutation after the j_th position
		//	increasing order
		return true;
	}
}
