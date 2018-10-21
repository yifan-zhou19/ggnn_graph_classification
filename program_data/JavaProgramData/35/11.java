package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[][] state = new int[8][8];
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

		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				state[i][j] = 1;
			}
		}

		int k;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < m;k++)
				{
					if (a[k][j] < a[i][j])
					{
						state[i][j] = 0;
					}
				}
				for (k = 0;k < n;k++)
				{
					if (a[i][k] > a[i][j])
					{
						state[i][j] = 0;
					}
				}
			}
		}
		int count = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (state[i][j] == 1)
				{
					System.out.printf("%d+%d\n",i,j);
					count++;
				}
			}
		}
		if (count == 0)
		{
			System.out.print("No");
		}
	}

}

