package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int o;
		int q;
		int j;
		int k;
		int J;
		int K;
		int v;
		int w;
		int m;
		int p;
		int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 p = Integer.parseInt(tempVar2);
	 }
	 for (j = 0;j < m;j++)
	 {
		  for (k = 0;k < p;k++)
		  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[j][k] = Integer.parseInt(tempVar3);
		 }
		  }
	 }

	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 p = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 n = Integer.parseInt(tempVar5);
	 }
	 for (J = 0;J < p;J++)
	 {
		  for (K = 0;K < n;K++)
		  {
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 b[J][K] = Integer.parseInt(tempVar6);
		 }
		  }
	 }
	for (i = 0;i < m;i++)
	{
		for (o = 0;o < n;o++)
		{
		 for (q = 0;q < p;q++)
		 {
	 c[i][o] = c[i][o] + a[i][q] * b[q][o];
		 }
		}
	}
	 for (v = 0;v < m;v++)
	 {
		 for (w = 0;w < n - 1;w++)
		 {
	   System.out.printf("%d ",c[v][w]);
		 }
	  if (w == n - 1)
	  {
	  System.out.printf("%d\n",c[v][w]);
	  }
	 }

	}
}

