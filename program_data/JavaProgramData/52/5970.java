package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[105];
		int n;
		int m;
		int i;
		int j;
		int t;
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= m; i++)
		{
			t = (p + n - 1);
			for (j = n - 2;j >= 0; j--)
			{
				p[j + 1] =  (p + j);
			}
			p[0] = t;
		}
		for (i = 0; i <= n - 1;i++)
		{
			if (i != n - 1)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

