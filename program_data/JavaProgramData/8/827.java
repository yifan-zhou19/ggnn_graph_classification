package <missing>;

public class GlobalMembers
{
	/*
	 * ????0908.cpp
	 * ??????
	 * ?????2012-11-23
	 * ???????????
	 */



	public static void program()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int M = n;
		final int N = n;
		int[] a = new int[M];
		int[] b = new int[N];
		for (i = 0;i < m;++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;++i)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;++i)
		{
			for (j = i + 1;j < m;++j)
			{
				if (a[i] > a[j])
				{
			a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
				}
			}
		}
		for (i = 0;i < n;++i)
		{
			for (j = i + 1;j < n;++j)
			{
				if (b[i] > b[j])
				{
				b[i] = b[i] + b[j];
				b[j] = b[i] - b[j];
				b[i] = b[i] - b[j];
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < m;++i)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		for (i = 0;i < n;++i)
		{
			System.out.print(' ');
			System.out.print(b[i]);
		}
	}

	public static int Main()
	{
		program();
		return 0;
	}
}

