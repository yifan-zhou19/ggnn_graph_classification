package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int sum;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
				  sum = 0;
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
				  for (i = 0;i < m;i++)
				  {
								  for (j = 0;j < n;j++)
								  {
								  String tempVar4 = ConsoleInput.scanfRead();
								  if (tempVar4 != null)
								  {
									  a[i][j] = Integer.parseInt(tempVar4);
								  }
								  if (i == 0 || i == m - 1)
								  {
								  continue;
								  }
								  if (j == 0 || j == n - 1)
								  {
								  continue;
								  }
								  a[i][j] = 0;
								  }
				  }


				  for (i = 0;i < m;i++)
				  {
					  for (j = 0;j < n;j++)
					  {
						  sum += a[i][j];
					  }
				  }

				  System.out.printf("%d\n",sum);
		}

	return 0;
	}

}

