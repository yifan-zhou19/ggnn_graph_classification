package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t = 0;
	int i;
	int j;
	int[][] a = new int[6][6];
	int q = 0;
	int d = 0;
	for (i = 1;i <= 5;i++)
	{
	  for (j = 1;j <= 5;j++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
	  }
	}
	for (i = 1;i <= 5;i++)
	{
	 for (j = 1;j <= 5;j++)
	 {
	  for (t = 1;t <= 5;t++)
	  {
	  if (a[i][j] >= a[i][t] != 0 && a[i][j] <= a[t][j])
	  {
	   d++;
	  }
	  }
	  if (d == 5)
	  {
		  System.out.printf("%d %d %d\n",i,j,a[i][j]);
	  q = 1;
	  }
	  else if (i == 5 && j == 5 && q != 1)
	  {
	  System.out.print("not found");
	  }
	  d = 0;
	 }
	}

	}

}

