package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(int a[],int b[],int n,int m);
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		f(a, b, n, m);
		return 0;
	}
	public static void f(int[] a, int[] b, int n, int m)
	{
		int k;
		int j;
		int t;
		for (j = 0;j < n - 1;j++) //????
		{
			for (k = 0;k < n - 1 - j;k++)
			{
				if (a[k] > a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (k = 0;k < m - 1 - j;k++)
			{
				if (b[k] > b[k + 1])
				{
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
				}
			}
		}
		for (k = n;k < n + m;k++) //????
		{
			a[k] = b[k - n];
		}
		System.out.print(a[0]);
		for (k = 1;k < n + m;k++)
		{
			System.out.print(' ');
			System.out.print(a[k]);
		}
	}
}

