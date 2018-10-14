package day6;

//����
public class Fibonacci {
	// 쳲���������ָ��������һ�����У�1��1��2��3��5��8��13��21��34������
	// ������дӵ�3�ʼ��ÿһ�����ǰ����֮�͡�
	// ����ѧ�ϣ�쳲��������������±��Եݹ�ķ������壺F(0)=1��F(1)=1, F(n)=F(n-1)+F(n-2)��n>=2��n��N*��
	public static void main(String[] args) {
		int n = 6;
		System.out.println("��" + n + "��쳲�������Ϊ��");
		System.out.println(getFib(n));
	}

	public static int getFib(int n) {
		if (n < 1) {
			System.out.println("�����������1");
		}
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return getFib(n - 1) + getFib(n - 2);
		}
	}
}
