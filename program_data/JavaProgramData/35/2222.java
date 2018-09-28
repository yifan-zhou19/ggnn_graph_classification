package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		int[][] num = new int[8][8];
		int i;
		int j;
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		int[] max_row = {0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 1;j <= n - 1;j++)
			{
				if (num[i][max_row[i]] < num[i][j])
				{
					max_row[i] = j;
				}
			}
		}

				int[] t = {0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				if (num[i][max_row[i]] > num[j][max_row[i]])
				{
					t[i] = 1;
				}
			}
		}

		for (i = 0;i <= m - 1;i++)
		{
			if (t[i] == 0)
			{
				System.out.printf("%d+%d\n",i,max_row[i]);
				break;
			}
		}

		if (i == m)
		{
			System.out.print("No\n");
		}
	}

}

