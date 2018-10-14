import java.util.Scanner;

// ͼ����С������
public class Kruskal {

	static Edge e[] = new Edge[10];// �����С����ʵ����������ã�Ҫ��m�����ֵ��1

	static int n, m;
	static int sum = 0, count = 0;// ���鼯��Ҫ�õ���һЩ������f����Ĵ�С����ʵ����������ã�Ҫ��n�����ֵ��1
	static int f[] = new int[7];

	static void quicksort(int left, int right) {
		int i, j;
		Edge t = new Edge();

		if (left > right) {
			return;
		}

		i = left;
		j = right;
		while (i != j) {
			// ˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ
			while (e[j].w >= e[left].w && i < j) {
				j--;
			}
			// �ٴ���߿�ʼ��
			while (e[i].w <= e[left].w && i < j) {
				i++;
			}
			// ����
			if (i < j) {
				t = e[i];
				e[i] = e[j];
				e[j] = t;
			}
		}
		// ���ս���׼����λ����left��i
		t = e[left];
		e[left] = e[i];
		e[i] = t;

		quicksort(left, i - 1);// ����������ߵ�
		quicksort(i + 1, right);// ���������ұߵ�
		return;
	}

	// ���鼯Ѱ�����ȵĺ���
	int temp;
	static int getf(int v) {
		if (f[v] == v) {
			return v;
		} else {
			// ������·��ѹ��
			f[v] = getf(f[v]);// �˴��Ⱥ�������һ�е�df[v]��Ϊ����������ɣ���ɻ�Ϊtemp
			return f[v];
		}
	}

	// ���鼯�ϲ������Ӽ��ĺ���
	static boolean merge(int v, int u) {
		int t1, t2;
		t1 = getf(v);
		t2 = getf(u);
		if (t1 != t2) {
			f[t2] = t1;
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();// n��ʾ�������
		m = cin.nextInt();// m��ʾ�ߵ�����
		e = new Edge[m+1];
		// �����
		int a, b, c;
		for (int i = 1; i <= m; i++) {
			a = cin.nextInt();
			b = cin.nextInt();
			c = cin.nextInt();
			e[i] = new Edge(a,b,c);
		}

		quicksort(1, m);// ��Ȩֵ��С����Ա߽��п�������

		f = new int[n+1];
		// ���鼯��ʼ��
		for (int i = 1; i <= n; i++) {
			f[i] = i;
		}

		// Kruskal�㷨���Ĳ���
		for (int i = 1; i <= m; i++) {
			// �ж�һ���ߵ����������Ƿ��Ѿ���ͨ�����ж��Ƿ�����ͬһ��������
			if (merge(e[i].u, e[i].v)) {
				count++;
				sum += e[i].w;
			}

			if (count == n - 1) {
				break;
			}
		}

		System.out.println(sum);

	}
}
/*
Input:
6 9
2 4 11
3 5 13
4 6 3
5 6 4
2 3 6
4 5 7
1 2 1
3 4 9
1 3 2

Output:
19
*/