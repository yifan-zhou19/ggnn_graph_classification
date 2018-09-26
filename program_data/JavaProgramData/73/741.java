package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int k;
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
		  int max;
		  int maxj;
		  int flag;
		  for (i = 0;i < 5;i++)
		  {
						  max = a[i][0];
						  maxj = 0;
						  for (j = 0;j < 5;j++)
						  {
										  if (a[i][j] > max)
										  {
														 max = a[i][j];
														 maxj = j;
										  }
						  }
						  flag = 1;
						  for (k = 0;k < 5;k++)
						  {
						  if (max > a[k][maxj])
						  {
											flag = 0;
											continue;
						  }
						  }
						  if (flag != 0)
						  {
								  System.out.printf("%d %d %d",i + 1,maxj + 1,max);
								  break;
						  }
		  }
		  if (flag == 0)
		  {
		  System.out.print("not found\n");
		  }
		  System.in.read();
		  System.in.read();
	}
}

