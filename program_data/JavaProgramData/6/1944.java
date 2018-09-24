package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] m = new int[200];
		int[] n = new int[200];
		int i;
		int t;
		int j;
		int[][] a = new int[200][200];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{

						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 m[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 n[i] = Integer.parseInt(tempVar3);
						 }
						 for (t = 1;t <= m[i];t++)
						 {
											 for (j = 1;j <= n[i];j++)
											 {
																 String tempVar4 = ConsoleInput.scanfRead();
																 if (tempVar4 != null)
																 {
																	 a[t][j] = Integer.parseInt(tempVar4);
																 }
											 }
						 }

						if (m[i] == 1 && n[i] == 1)
						{
						System.out.printf("%d", a[1][1]);
						}
						else
						{

						 sum = 0;

						  for (t = 1;t <= n[i];t++)
						  {
											  sum = sum + a[1][t];
						  }

						  for (j = 1;j <= n[i];j++)
						  {
											  sum = sum + a[m[i]][j];
						  }

						  for (t = 1;t <= m[i];t++)
						  {
											  sum = sum + a[t][1];
						  }

						  for (j = 1;j <= m[i];j++)
						  {
											  sum = sum + a[j][n[i]];
						  }

						  sum = sum - a[1][1] - a[1][n[i]] - a[m[i]][n[i]] - a[m[i]][1];
						  System.out.printf("%d\n", sum);
						}
		}

		return 0;
	}
}

