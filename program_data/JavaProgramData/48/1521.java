package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int p;
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
		int[][][] a = new int[9][9][6];
		int i;
		int j;
		for (p = 0;p < n + 1;p++)
		{
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
			  a[i][j][p] = 0;
			}
		}
		}
			   a[4][4][0] = m;
			   for (p = 1;p < n + 1;p++)
			   {
			   for (i = 1;i < 8;i++)
			   {
				  for (j = 1;j < 8;j++)
				  {
					  a[i][j][p] = 2 * a[i][j][p - 1] + a[i][j + 1][p - 1] + a[i][j - 1][p - 1] + a[i + 1][j][p - 1] + a[i - 1][j][p - 1] + a[i - 1][j - 1][p - 1] + a[i - 1][j + 1][p - 1] + a[i + 1][j - 1][p - 1] + a[i + 1][j + 1][p - 1];
				  }
			   }
			   }
				  if (n == 4)
				  {
				  for (j = 1;j < 8;j++)
				  {
					  a[0][j][n] = a[1][j][n - 1] + a[1][j - 1][n - 1] + a[1][j + 1][n - 1];
					  a[8][j][n] = a[7][j][n - 1] + a[7][j - 1][n - 1] + a[7][j + 1][n - 1];
				  }
					  for (i = 1;i < 8;i++)
					  {
						  a[i][0][n] = a[i][1][n - 1] + a[i - 1][1][n - 1] + a[i + 1][1][n - 1];
						  a[i][8][n] = a[i][7][n - 1] + a[i - 1][7][n - 1] + a[i + 1][7][n - 1];
					  }
						  a[0][0][n] = a[0][8][n] = a[8][0][n] = a[8][8][n] = a[7][7][n - 1];
				  }
					  for (i = 0;i < 9;i++)
					  {
						  for (j = 0;j < 9;j++)
						  {
							   if (j == 0)
							   {
							   System.out.printf("%d",a[i][j][n]);
							   }
							   else
							   {
							   System.out.printf(" %d",a[i][j][n]);
							   }
							   if (j == 8)
							   {
							   System.out.print("\n");
							   }
						  }
					  }
							  String tempVar3 = ConsoleInput.scanfRead();
							  if (tempVar3 != null)
							  {
								  i = Integer.parseInt(tempVar3);
							  }
	}

}

