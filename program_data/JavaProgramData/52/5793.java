package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int m;
		int temp;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		int[] p = a;
		for (int i = 0;i <= n - 1;++i)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int k = 1;k <= m;++k)
		{
			temp = (p + n - 1);
			for (int i = n - 2;i >= 0;--i)
			{
				p[i + 1] = (p + i);
			}
			p[0] = temp;
		}
		for (int i = 0;i <= n - 1;++i)
		{
			if (i != n - 1)
			{
				System.out.print((p + i));
				System.out.print(' ');
			}
			else
			{
				System.out.print((p + i));
			}
		}
		return 0;
	}

}

