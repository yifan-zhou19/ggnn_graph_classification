package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int[] x = new int[5];
		  int[] y = new int[5];
		  int i;
		  int j;
		  int k = 0;
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
			int max = a[i][0];
			for (j = 0;j < 5;j++)
			{
			   if (a[i][j] > max)
			   {
				 max = a[i][j];
				 x[i] = j;
			   }
			}
		  }
		  for (j = 0;j < 5;j++)
		  {
			int min = a[0][j];
			for (i = 0;i < 5;i++)
			{
			   if (a[i][j] <= min)
			   {
				 min = a[i][j];
				 y[j] = i;
			   }
			}
		  }
		  for (i = 0;i < 5;i++)
		  {
			if (y[x[i]] == i)
			{
			  k++;
			  System.out.printf("%d %d %d\n",i + 1,x[i] + 1,a[i][x[i]]);
			}
		  }
		  if (k == 0)
		  {
		  System.out.print("not found");
		  }

	}
}

