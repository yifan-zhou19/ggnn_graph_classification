package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int l;
		int s;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] sf = new int[k];
		for (i = 0;i < k;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			 for (j = 0;j < m;j++)
			 {
				 for (l = 0;l < n;l++)
				 {
					 String tempVar4 = ConsoleInput.scanfRead();
					 if (tempVar4 != null)
					 {
						 sz[j][l] = Integer.parseInt(tempVar4);
					 }
				 }
			 }
			 if (m == 1)
			 {
				 for (l = 0;l < n;l++)
				 {
					 s += sz[0][l];
				 }
			 }
			 else if (n == 1)
			 {
				for (j = 0;j < m;j++)
				{
					s += sz[j][0];
				}
			 }
			 else
			 {
				for (j = 0;j < m;j++)
				{
					 s += sz[j][0] + sz[j][n - 1];
				}
				 for (l = 0;l < n;l++)
				 {
					 s += sz[0][l] + sz[m - 1][l];
				 }
				 s = s - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
			 }
				 sf[i] = s;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",sf[i]);
		}
		return 0;
	}

}

