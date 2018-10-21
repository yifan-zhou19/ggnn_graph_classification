package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int j;
		int a;
		int k;
		int[][] sz = new int[100][100];
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (a = 0;a < k;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[a] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[a] = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m[a];i++)
			{
				for (j = 0;j < n[a];j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			 if (m[a] != 1 && n[a] != 1)
			 {
				for (j = 0;j < n[a];j++)
				{
					sum[a] += sz[0][j];
					sum[a] += sz[m[a] - 1][j];
				}
				for (i = 1;i < m[a] - 1;i++)
				{
					sum[a] += sz[i][0];
					sum[a] += sz[i][n[a] - 1];
				}
			 }
			 else
			 {
				 for (i = 0;i < m[a];i++)
				 {
					 for (j = 0;j < n[a];j++)
					 {
						 sum[a] += sz[i][j];
					 }
				 }
			 }
		}
			for (a = 0;a < k;a++)
			{
			System.out.printf("%d\n",sum[a]);
			}

			return 0;
	}



}

