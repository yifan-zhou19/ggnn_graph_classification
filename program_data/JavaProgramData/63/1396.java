package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m1;
		int n1;
		int m2;
		int n2;
		int p;
		int q;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] answer = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m1;i++)
		{
			for (j = 0;j < n1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			n2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < m2;i++)
		{
			for (j = 0;j < n2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < m1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				answer[i][j] = 0;
				for (p = 0;p < n1;p++)
				{
					answer[i][j] = answer[i][j] + a[i][p] * b[p][j];
				}
			}
		}
		for (i = 0;i < m1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				if (j == 0 && j != n2 - 1)
				{
					System.out.printf("%d",answer[i][j]);
				}
				else if (j == n2 - 1 && j != 0)
				{
					System.out.printf(" %d\n",answer[i][j]);
				}
				else if (j == 0 && j == n2 - 1)
				{
					System.out.printf("%d\n",answer[i][j]);
				}
				else
				{
					System.out.printf(" %d",answer[i][j]);
				}
			}
		}
	}
}

