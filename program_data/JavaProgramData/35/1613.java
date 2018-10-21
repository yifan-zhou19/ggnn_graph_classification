package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int t;
		int k;
		int max;
		int min;
		int l = 0;
	 for (i = 0;i < m;i++)
	 {
		   for (j = 0;j < n;j++)
		   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
		   }
	 }
	  for (i = 0;i < m;i++)
	  {
	   max = a[i][0];
	   k = 0;
	   for (j = 1;j < n;j++)
	   {
		if (a[i][j] > max)
		{
		 max = a[i][j];
		 k = j;
		}
	   }
		min = a[0][k];
		for (t = 1;t < m;t++)
		{
		 if (a[t][k] < min)
		 {
		  min = a[t][k];
		 }
		}
		  if (max == min)
		  {
			System.out.printf("%d+%d",i,k);
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

