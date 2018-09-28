package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char t;
		char[][] a = new char[50][20];
		int n = 0;
		int i;
		t = System.in.read();
		while (t > 15)
		{
			i = 0;
			while (t >= 'A')
			{
				a[n][i] = t;
				t = System.in.read();
				i++;
			}
			t = System.in.read();
			n++;
		}
		for (int k = n - 1;k > 0;k--)
		{
			i = 0;
			while (a[k][i] >= 'A')
			{
				System.out.print(a[k][i]);
				i++;
			}
			System.out.print(' ');
		}
		i = 0;
			while (a[0][i] >= 'A')
			{
				System.out.print(a[0][i]);
				i++;
			}
		return 0;
	}
}
