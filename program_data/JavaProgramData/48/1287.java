package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][][] a = new int[5][11][11];
		  int i;
		  int j;
		  int k;
		  int day;
		  for (i = 0;i <= 4;i++)
		  {
			  for (j = 0;j <= 10;j++)
			  {
				  for (k = 0;k <= 10;k++)
				  {
					  a[i][j][k] = 0;
				  }
			  }
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[0][5][5] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  day = Integer.parseInt(tempVar2);
		  }
		  for (i = 1;i <= day;i++)
		  {
			  for (j = 1;j <= 9;j++)
			  {
				  for (k = 1;k <= 9;k++)
				  {
					  a[i][j][k] = a[i - 1][j][k] * 2 + a[i - 1][j - 1][k - 1] + a[i - 1][j - 1][k] + a[i - 1][j - 1][k + 1] + a[i - 1][j + 1][k - 1] + a[i - 1][j + 1][k] + a[i - 1][j + 1][k + 1] + a[i - 1][j][k - 1] + a[i - 1][j][k + 1];
				  }
			  }
		  }
		  for (j = 1;j <= 9;j++)
		  {
			  for (k = 1;k <= 9;k++)
			  {
				  if (k == 1)
				  {
					  System.out.printf("%d",a[day][j][k]);
				  }
				  else
				  {
					  System.out.printf(" %d",a[day][j][k]);
				  }
			  }
			  System.out.print("\n");
		  }
		  System.in.read();
		  System.in.read();
	}
}

