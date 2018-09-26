package <missing>;

public class GlobalMembers
{
	public static int f(int i, int j, int m, int n, int[][] a)
	{
		int i1;
		int j1;
		int k;
		int test = 1;
		int[][] d =
		{
			{-1, 0},
			{1, 0},
			{0, -1},
			{0, 1}
		};
		for (k = 0;k < 4;k++)
		{
			   i1 = i + d[k][0];
			   j1 = j + d[k][1];
			   if (i1 >= 0 && i1 < m && j1 >= 0 && j1 < n)
			   {
				 if (a[i][j] < a[i1][j1])
				 {
				   test = 0;
				   break;
				 }
			   }
		}
		   if (test == 0)
		   {
		   return 0;
		   }
		   else
		   {
		   return 1;
		   }
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
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
		 for (j = 0;j < n;j++)
		 {
			 if (f(i, j, m, n, a) == 1)
			 {
			 System.out.printf("%d %d\n",i,j);
			 }
		 }
		}
	}
}

