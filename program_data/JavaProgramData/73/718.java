package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int max;
		  int maxj;
		  int f;
		  int[][] a = new int[5][5];
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
			 max = a[i][0];
			 k = 0;
			 maxj = 1;
			 for (j = 0;j < 5;j++)
			 {
			   if (a[i][j] > max)
			   {
				  max = a[i][j];
				  k = j;
			   }
			 }
			 for (f = 0;f < 5;f++)
			 {
			   if (max > a[f][k])
			   {
				 maxj = 0;
				 break;
			   }
			 }
			 if (maxj == 1)
			 {
						System.out.printf("%d %d %d\n",i + 1,k + 1,max);
						break;
			 }
		  }
		  if (maxj == 0)
		  {
			System.out.print("not found");
		  }
	}
}

