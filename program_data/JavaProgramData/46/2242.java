package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int n;
	 int i;
	 int m;
	 int j;
	 int[][] sz = new int[100][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
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
				 (sz[i][j]) = Integer.parseInt(tempVar3);
			 }
		 }
	 }
	 c = 0;
	   for (i = 0;c < n * m;i++)
	   {
		 a = i % 4;
		 b = i / 4;
		 if (a == 0)
		 {
		   for (j = b;j < n - b;j++)
		   {
			   System.out.printf("%d\n",sz[b][j]);
			   c = c + 1;
		   }
		 }
		 if (a == 1)
		 {
		   for (j = b + 1;j < m - b;j++)
		   {
			   System.out.printf("%d\n",sz[j][n - 1 - b]);
			   c = c + 1;
		   }
		 }
		 if (a == 2)
		 {
		   for (j = n - 2 - b;j >= b;j--)
		   {
			   System.out.printf("%d\n",sz[m - 1 - b][j]);
			   c = c + 1;
		   }
		 }
		 if (a == 3)
		 {
		   for (j = m - 2 - b;j > b;j--)
		   {
			   System.out.printf("%d\n",sz[j][b]);
			   c = c + 1;
		   }
		 }
	   }
		 return 0;
	}
}

