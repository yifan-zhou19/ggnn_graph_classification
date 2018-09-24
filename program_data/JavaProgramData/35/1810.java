package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[N][M];
	 int i;
	 int j;
	 int t;
	 int k;
	 int max;
	 int min;
	 int l = 0;
	int row;
	int col;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}

	for (i = 0;i < row;i++)
	{
	  for (j = 0;j < col;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	}

	for (i = 0;i < row;i++)
	{
	   max = a[i][0];
	   for (j = 0;j < col;j++)
	   {
		if (a[i][j] >= max)
		{
		 max = a[i][j];
		 k = j;
		}
	   }
		min = a[0][k];
		for (t = 0;t < row;t++)
		{
		 if (a[t][k] <= min)
		 {
		  min = a[t][k];
		 }
		}
		 if (max == min)
		 {
			 System.out.printf("%d+%d\n",i,k);
			 l++;
		 }
	}
	  if (l == 0)
	  {
	   System.out.print("No");
	  }
	return 0;
	}
}

