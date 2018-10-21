package <missing>;

public class GlobalMembers
{
	/* 
	 * ????main.cpp
	 * ??????
	 * ?????2013-01-11
	 * ????????????N(N<=100)???2?N?????
	 */


	public static void f(int n)
	{
		int i;
		int j;
		int l;
		int len;
		int[] c = new int[10000];
		c[0] = 1;
		len = 1;
		for (i = 0; i < n; i++)
		{
			l = 0;
			for (j = 0; j < len; j++)
			{
				c[j] = c[j] * 2 + l;
				l = 0;
				if (c[j] > 9)
				{
					l = (c[j] - c[j] % 10) / 10;
					c[j] -= 10;
				}
			}
			if (l > 0)
			{
				c[j] += l;
				len += 1;
			}
		}
		for (i = len - 1; i >= 0; i--)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(N);
		return 0;
	}
}

