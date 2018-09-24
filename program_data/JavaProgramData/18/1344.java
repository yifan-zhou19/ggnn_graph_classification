package <missing>;

public class GlobalMembers
{
	/*
	 * ????1002.cpp
	 * ??????
	 * ?????2012-11-27
	 * ?????????????
	 */



	public static int[][] a = new int[101][101]; //??????

	public static int f(int n)
	{ //n???????
		if (n == 1)
		{
			return 0; //?????1*1???0
		}
		int h; //????
		int w;
		int mw;
		int mh;
		int i;
		int j;
		for (i = 1; i <= n; ++i)
		{
			mw = 1000; //?????????
			for (h = 1; h <= n; ++h)
			{
				if (a[i][h] < mw)
				{
					mw = a[i][h]; //????
				}
			}
			for (h = 1; h <= n; ++h)
			{
				a[i][h] -= mw; //??
			}
		}
		for (i = 1; i <= n; ++i)
		{
			mh = 1000; //??????
			for (h = 1; h <= n; ++h)
			{
				if (a[h][i] < mh)
				{
					mh = a[h][i]; //????
				}
			}
			for (h = 1; h <= n; ++h)
			{
				a[h][i] -= mh; //??
			}
		}
		w = a[2][2]; //???????
		for (i = 2; i < n; ++i)
		{
			for (j = 1; j <= n; ++j)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (i = 2; i < n; ++i)
		{
			for (j = 1; j < n; ++j)
			{
				a[j][i] = a[j][i + 1]; //?????????
			}
		}
		return w + f(n - 1); //??????????????????????
	}

	public static int Main()
	{
		int n;
		int i;
		int i1;
		int i2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; ++i)
		{
			for (i1 = 1; i1 <= n; ++i1)
			{
				for (i2 = 1; i2 <= n; ++i2)
				{
					a[i1][i2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(f(n));
			System.out.print("\n");
		}
		return 0; //????
	}
}

