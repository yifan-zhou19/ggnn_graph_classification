package <missing>;

public class GlobalMembers
{
	public static int f(int n, int m)
	{
		if (n >= 5 || m >= 5)
		{
			return 0;
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] shuzu = new int[5][5];
		int[] t = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (f(n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
			   t[j] = shuzu[n][j];
			   shuzu[n][j] = shuzu[m][j];
			   shuzu[m][j] = t[j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",shuzu[i][j]);
				}
				System.out.printf("%d\n",shuzu[i][j]);
			}
		}
		return 0;
	}
}

