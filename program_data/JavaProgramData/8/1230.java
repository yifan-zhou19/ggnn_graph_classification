package <missing>;

public class GlobalMembers
{
	public static void f(int[] c, int x)
	{
		int p;
		for (int i = 0;i < x;i++)
		{
			for (int j = 0;j < x - i - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					p = c[j];
					c[j] = c[j + 1];
					c[j + 1] = p;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		f(a, m);
		f(b, n);
		for (i = 0;i < m;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.print(b[j]);
			System.out.print(' ');
		}
		System.out.print(b[j]);
		return 0;
	}


}

