package <missing>;

public class GlobalMembers
{
	public static int exchange(int n, int m, int[][] num)
	{
		int i;
		int t;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				t = num[n][i];
				num[n][i] = num[m][i];
				num[m][i] = t;
			}
			return 1;
		}
		if (n < 0 || n >= 5 || m < 0 || m >= 5)
		{
			return 0;
		}
	}

	public static int Main()
	{
		int[][] num = new int[5][5];
		int i;
		int j;
		int n;
		int m;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
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

		if (exchange(n, m, num) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",num[i][j]);
				}
				System.out.printf("%d",num[i][4]);
				System.out.print("\n");
			}
		}
		if (exchange(n, m, num) == 0)
		{
			System.out.print("error\n");
		}

		return 0;
	}

}

