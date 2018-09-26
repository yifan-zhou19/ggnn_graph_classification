package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] mount = new int[20][20];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mount[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (i = 0;i <= n - 1;i++)
			{
				if (i == 0)
				{
				if (mount[0][i] >= mount[1][i] != 0 && mount[0][i] >= mount[0][i + 1])
				{
				System.out.printf("0 %d\n",i);
				}
				}
			else if (i != 0 && i != n - 1)
			{
				if (mount[0][i] >= mount[1][i] != 0 && mount[0][i] >= mount[0][i + 1] != 0 && mount[0][i] >= mount[0][i - 1])
				{
				System.out.printf("0 %d\n",i);
				}
			}
			else if (i == n - 1)
			{
				if (mount[0][i] >= mount[1][i] != 0 && mount[0][i] >= mount[0][i - 1])
				{
				System.out.printf("0 %d\n",i);
				}
			}
			}
		   for (j = 1;j <= m - 2;j++)
		   {
			   for (i = 0;i <= n - 1;i++)
			   {
				if (i == 0)
				{
			if (mount[j][i] >= mount[j + 1][i] != 0 && mount[j][i] >= mount[j][i + 1] != 0 && mount[j][i] >= mount[j - 1][i])
			{
				System.out.printf("%d %d\n",j,i);
			}
				}
			if (i != 0 && i != n - 1)
			{
			if (mount[j][i] >= mount[j + 1][i] != 0 && mount[j][i] >= mount[j][i + 1] != 0 && mount[j][i] >= mount[j][i - 1] != 0 && mount[j][i] >= mount[j - 1][i])
			{
				System.out.printf("%d %d\n",j,i);
			}
			}
			if (i == n - 1)
			{
			  if (mount[j][i] >= mount[j + 1][i] != 0 && mount[j][i] >= mount[j][i - 1] != 0 && mount[j][i] >= mount[j - 1][i])
			  {
				System.out.printf("%d %d\n",j,i);
			  }
			}
			   }
		   }
				for (i = 0;i <= n - 1;i++)
				{
				if (i == 0)
				{
			  if (mount[m - 1][i] >= mount[m - 2][i] != 0 && mount[m - 1][i] >= mount[m - 1][i + 1])
			  {
				System.out.printf("%d %d\n",m - 1,i);
			  }
				}
			if (i != 0 && i != n - 1)
			{
			  if (mount[m - 1][i] >= mount[m - 2][i] != 0 && mount[m - 1][i] >= mount[m - 1][i + 1] != 0 && mount[m - 1][i] >= mount[m - 1][i - 1])
			  {
				System.out.printf("%d %d\n",m - 1,i);
			  }
			}
			if (i == n - 1)
			{
			  if (mount[m - 1][i] >= mount[m - 1][i] != 0 && mount[m - 1][i] >= mount[m - 1][i - 1])
			  {
				System.out.printf("%d %d\n",m - 1,i);
			  }
			}
				}
				return 0;
	}
}

