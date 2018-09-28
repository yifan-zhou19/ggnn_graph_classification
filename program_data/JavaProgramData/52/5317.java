package <missing>;

public class GlobalMembers
{
	/*
	 * ????xunhuan.cpp
	 * ??????
	 * ?????2012 12 22
	 * ?????????
	 */



	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n - m;j++)
			{
				t = (a + n - m + i - j);
				a[n - m + i - j] = (a + n - m + i - j - 1);
				a[n - m + i - j - 1] = t;
			} //????
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
			System.out.print((a + i));
			System.out.print(" ");
			}
			else
			{
				System.out.print((a + i));
			}
		}
		return 0;
	}

}

