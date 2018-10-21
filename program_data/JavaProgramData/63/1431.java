package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int q;
		int n;
		int l;
		int i;
		int j;
		int sum;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 100;i++)
		{
			 for (j = 0;j < 100;j++)
			 {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		   if (j == q - 1)
		   {
			   break;
		   }
			 }
		  if (i == m - 1)
		  {
			  break;
		  }
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			q = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < 100;i++)
		{
			 for (j = 0;j < 100;j++)
			 {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 b[i][j] = Integer.parseInt(tempVar6);
			 }
		  if (j == n - 1)
		  {
			  break;
		  }
			 }
		 if (i == q - 1)
		 {
			 break;
		 }
		}
		for (i = 0;i < m;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			 sum = 0;
		  for (l = 0;l < q;l++)
		  {
		   sum = sum + a[i][l] * b[l][j];
		  }
		  c[i][j] = sum;
		 }
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
		  System.out.printf("%d ",c[i][j]);
			}
		 System.out.printf("%d\n",c[i][n - 1]);
		}

		return 0;
	}

}

