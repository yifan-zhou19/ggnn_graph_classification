package <missing>;

public class GlobalMembers
{
	public static void move(int n, int[] p)
	{
		int t = p[n - 1];
		for (int i = n - 1;i > 0;i--)
		{
			p[i] = p[i - 1];
		}
		*p = t;
	}

	public static int Main()
	{
		int n;
		int m;
		int k;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 1;k <= m;k++)
		{
			move(n, a);
		}
		for (k = 0;k < n - 1;k++)
		{
			System.out.print(a[k]);
			System.out.print(' ');
		}
		System.out.print(a[n - 1]);
		return 0;
	}

}

