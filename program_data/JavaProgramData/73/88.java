package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int max;
		int min;
		int m = 0;
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar);
			  }
		   }
		}
		for (i = 0;i < 5;i++)
		{
		   m = 0;
		   max = a[i][0];
		   for (j = 1;j < 5;j++)
		   {
			  if (a[i][j] > max)
			  {
				 m = j;
				 max = a[i][m];
			  }
		   }
		   b[i][m]++;
		}
		for (j = 0;j < 5;j++)
		{
		   m = 0;
		   min = a[0][j];
		   for (i = 1;i < 5;i++)
		   {
			  if (a[i][j] < min)
			  {
				 m = i;
				 min = a[m][j];
			  }
		   }
		   b[m][j]++;
		}
		m = 0;
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			  if (b[i][j] == 2)
			  {
				 System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
				 m++;
			  }
		   }
		}
		if (m == 0)
		{
		   System.out.print("not found");
		}
	}

}

