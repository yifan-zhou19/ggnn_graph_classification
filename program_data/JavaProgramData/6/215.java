package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		int j;
		int t;
		int s;
		 int[][] a = new int[100][100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (t = 0;t < k;t++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 m = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 n = Integer.parseInt(tempVar3);
			 }
			 s = 0;
			 for (i = 0;i < m;i++)
			 {
			   for (j = 0;j < n;j++)
			   {
						 String tempVar4 = ConsoleInput.scanfRead();
						 if (tempVar4 != null)
						 {
							 a[i][j] = Integer.parseInt(tempVar4);
						 }
			   if (i == 0 || i == m - 1)
			   {
			   s = s + a[i][j];
			   }
			   if ((j == 0 || j == n - 1) && i != 0 && i != m - 1)
			   {
			   s = s + a[i][j];
			   }
			   }
			 }
		System.out.printf("%d\n",s);
		 }
		return 0;
	}

}

