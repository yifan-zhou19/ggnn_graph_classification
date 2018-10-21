package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int[] max = new int[8];
		int[] min = new int[8];
		int e = 1;
		int n;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < m;j++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  sz[i][j] = Integer.parseInt(tempVar3);
			  }
		   }
		}
		for (k = 0;k < n;k++)
		{
		   max[k] = 0;
		   min[k] = 0;
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < m - 1;j++)
		   {
			  if (sz[i][max[i]] < sz[i][j + 1])
			  {
				max[i] = j + 1;
			  }
		   }
		}
		for (j = 0;j < m;j++)
		{
		   for (i = 0;i < n - 1;i++)
		   {
			  if (sz[min[j]][j] > sz[i + 1][j])
			  {
				min[j] = i + 1;
			  }
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (min[max[i]] == i)
		   {
			 System.out.printf("%d+%d\n",i,max[i]);
			 e = 0;
		   }
		}
		if (e == 1)
		{
		  System.out.print("No");
		}
		int t;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			t = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

