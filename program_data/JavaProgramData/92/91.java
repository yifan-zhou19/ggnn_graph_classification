package <missing>;

public class GlobalMembers
{
	public static int[][] dp = new int[1010][1010];
	public static int[] a = new int[1010];
	public static int[] b = new int[1010];
	public static int cmp1(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int cmp2(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int max(int a,int b)
	{
		return a > b != 0?a:b;
	}
	public static int mon(int i,int j)
	{
		if (a[i] > b[j])
		{
			return 200;
		}
		if (a[i] == b[j])
		{
			return 0;
		}
		if (a[i] < b[j])
		{
			return -200;
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		while (n != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp1); //????
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp2); //????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(dp,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= n;i++)
			{
				dp[i][0] = dp[i - 1][0] + mon(n - i, i - 1);
				for (j = 1;j < i;j++)
				{
					dp[i][j] = max(dp[i - 1][j - 1] + mon(j - 1, i - 1), dp[i - 1][j] + mon(n - (i - j), i - 1));
				}
				dp[i][i] = dp[i - 1][i - 1] + mon(i - 1, i - 1);
			}
			int Max = -99999999;
			for (i = 0;i < n;i++)
			{
				if (dp[n][i] > Max)
				{
					Max = dp[n][i];
				}
			}
			System.out.print(Max);
			System.out.print("\n");


			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

