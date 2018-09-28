package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int[][] a = new int[N][N];
	int max;
	int maxj;
	int f;
	for (i = 0;i < N;i++)
	{
	   for (j = 0;j < N;j++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
	   }
	}
	for (i = 0;i < N;i++)
	{
	  max = a[i][0];
	  maxj = 0;
	  for (j = 0;j < N;j++)
	  {
		if (a[i][j] > max)
		{
			 max = a[i][j];
			 maxj = j;
		}
	  }
	  f = 1;
	  for (k = 0;k < N;k++)
	  {
		if (max > a[k][maxj])
		{
				f = 0;
				continue;
		}
	  }
	  if (f != 0)
	  {
		  System.out.printf("%d %d %d",i + 1,maxj + 1,a[i][maxj]);
		  break;
	  }


	}
	if (f == 0)
	{
		System.out.print("not found");
	}
	return 0;

	}
}

