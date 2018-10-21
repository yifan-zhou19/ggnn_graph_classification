package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int M;
	   int N;
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
	   M = m + 2;
	   N = n + 2;
	   int[][] a = new int[M][N];
	   for (int i = 0;i <= N - 1;i++)
	   {
	   a[0][i] = 0;
	   }
	   for (int i = 0;i <= M - 1;i++)
	   {
	   a[i][0] = 0;
	   }
	   for (int i = 0;i <= N - 1;i++)
	   {
	   a[M - 1][i] = 0;
	   }
	   for (int i = 0;i <= M - 1;i++)
	   {
	   a[i][N - 1] = 0;
	   }
	   for (int i = 1;i <= M - 2;i++)
	   {
			for (int j = 1;j <= N - 2;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
	   }
	   for (int i = 1;i <= M - 2;i++)
	   {
			for (int j = 1;j <= N - 2;j++)
			{
			  if ((a[i][j] >= a[i][j + 1]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i - 1][j]))
			  {
			  System.out.printf("%d %d\n",i - 1,j - 1);
			  }


			}
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}

