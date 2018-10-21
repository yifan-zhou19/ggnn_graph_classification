package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int n;
		int[] s = new int[100];
		int i;
		int j;
		int len;
		int col;
		int m;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				len = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				col = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < len;i++)
			{
				for (j = 0;j < col;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
					sum += sz[i][j];
				}
			}
			if (col == 1 || len == 1)
			{
				s[m] = sum;
			}
			else
			{
				for (j = 0;j < col - 1;j++)
				{
					s[m] += sz[0][j];
				}
				for (i = 0;i < len - 1;i++)
				{
					s[m] += sz[i][col - 1];
				}
				for (j = 1;j < col;j++)
				{
					s[m] += sz[len - 1][j];
				}
				for (i = 1;i < len;i++)
				{
					s[m] += sz[i][0];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

