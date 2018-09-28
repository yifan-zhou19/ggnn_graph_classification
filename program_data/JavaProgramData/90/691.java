package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (n == 1)
		{
			return (1);
		}
		else
		{
			if (m == 0)
			{
				return (1);
			}
			else
			{
				if (m >= n)
				{
					return (f(m, n - 1) + f(m - n, n));
				}
				else
				{
					return (f(m, m));
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int t;
		int[][] g = new int[20][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				g[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				g[i][1] = Integer.parseInt(tempVar3);
			}
				System.out.printf("%d\n",f(g[i][0], g[i][1]));
		}
	}
}

