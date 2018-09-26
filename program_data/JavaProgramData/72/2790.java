package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] point = new int[20][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					point[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;;)
		{
			for (j = 0;;)
			{
				if (point[0][0] >= point[0][1] != 0 && point[0][0] >= point[1][0])
				{
					System.out.print("0 0\n");
				}
				break;
			}
			for (j = 1;j < m - 1;j++)
			{
				if (point[0][j] >= point[0][j - 1] != 0 && point[0][j] >= point[0][j + 1] != 0 && point[0][j] >= point[1][j])
				{
					System.out.printf("0 %d\n",j);
				}
			}
			for (j = m - 1;;)
			{
				if (point[0][m - 1] >= point[0][m - 2] != 0 && point[0][m - 1] >= point[1][m - 1])
				{
					System.out.printf("0 %d\n",m - 1);
				}
				break;
			}
			break;
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 0;;)
			{
				if (point[i][0] >= point[i][1] != 0 && point[i][0] >= point[i - 1][0] != 0 && point[i][0] >= point[i + 1][0])
				{
					System.out.printf("%d 0\n",i);
				}
				break;
			}
			for (j = 1;j < m - 1;j++)
			{
				if (point[i][j] >= point[i - 1][j] != 0 && point[i][j] >= point[i][j - 1] != 0 && point[i][j] >= point[i + 1][j] != 0 && point[i][j] >= point[i][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
			for (j = m - 1;;)
			{
				if (point[i][m - 1] >= point[i][m - 2] != 0 && point[i][m - 1] >= point[i - 1][m - 1] != 0 && point[i][m - 1] >= point[i + 1][m - 1])
				{
					System.out.printf("%d %d\n",i,m - 1);
				}
				break;
			}
		}
		for (i = n - 1;;)
		{
			for (j = 0;;)
			{
				if (point[n - 1][0] >= point[n - 1][1] != 0 && point[n - 1][0] >= point[n - 2][0])
				{
					System.out.printf("%d 0\n",n - 1);
				}
				break;
			}
			for (j = 1;j < m - 1;j++)
			{
				if (point[n - 1][j] >= point[n - 1][j - 1] != 0 && point[n - 1][j] >= point[n - 1][j + 1] != 0 && point[n - 1][j] >= point[n - 2][j])
				{
					System.out.printf("%d %d\n",n - 1,j);
				}
			}
			for (j = m - 1;;)
			{
				if (point[n - 1][m - 1] >= point[n - 1][m - 2] != 0 && point[n - 1][m - 1] >= point[n - 2][m - 1])
				{
					System.out.printf("%d %d\n",n - 1,m - 1);
				}
				break;
			}
			break;
		}
		return 0;
	}
}

