package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int k;
		  int max;
		  int max2;
		  int lie;
		  int hang;
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
		  for (j = 0;j < 5;j++)
		  {
						  max = a[j][0];
						  lie = 0;
		  for (i = 0;i < 4;i++)
		  {
		  if (max < a[j][i + 1])
		  {
							   max = a[j][i + 1];
							   lie = i + 1;
		  }
		  }
	//printf("%d\n",max);
		  max2 = a[0][lie];
		  hang = 0;
		  for (k = 0;k < 4;k++)
		  {
		  if (max2 > a[k + 1][lie])
		  {
								   max2 = a[k + 1][lie];
								   hang = k + 1;
		  }
		  }
	//printf("%d\n",max2);
		  if (max == max2)
		  {
		  System.out.printf("%d %d %d\n",hang + 1,lie+1,max);
		  m++;
		  }
		  }
		  if (m == 0)
		  {
		  System.out.print("not found\n");
		  }
	}

}

