package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int day;
		int i;
		int j;
		int k;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
			 b[i][j] = 0;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			day = Integer.parseInt(tempVar2);
		}
		a[4][4] = m;
		b[4][4] = m;
		for (k = 0;k < day;k++)
		{
			   for (i = 0;i < 9;i++)
			   {
				  for (j = 0;j < 9;j++)
				  {
				 if (a[i][j] != 0)
				 {
					 b[i][j] += a[i][j];
				 b[i][j - 1] += a[i][j];
				 b[i][j + 1] += a[i][j];
				 b[i - 1][j] += a[i][j];
				 b[i + 1][j] += a[i][j];
				 b[i - 1][j - 1] += a[i][j];
				 b[i + 1][j - 1] += a[i][j];
				 b[i - 1][j + 1] += a[i][j];
				 b[i + 1][j + 1] += a[i][j];
				 }
				  }
			   }
		   for (i = 0;i < 9;i++)
		   {
			   for (j = 0;j < 9;j++)
			   {
				   a[i][j] = b[i][j];
			   }
		   }
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
			System.out.printf("%d ",a[i][j]);
			}
		 System.out.printf("%d\n",a[i][8]);
		}
	}
}

