package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int i;
		int j;
		int l;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (l = 0;l < k;l++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  for (i = 0;i < m;i++)
		  {
			 for (j = 0;j < n;j++)
			 {
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar4);
				 }
			 }
		  }
			 for (j = 0;j < n;j++)
			 {
				sum1 = sum1 + a[0][j];
				if ((m - 1) != 0)
				{
			   sum2 = sum2 + a[m - 1][j];
				}
			 }
			 for (i = 1;i < m - 1;i++)
			 {
			  sum3 = sum3 + a[i][0];
			  if ((n - 1) != 0)
			  {
			  sum4 = sum4 + a[i][n - 1];
			  }
			 }
			  System.out.printf("%d\n",sum1 + sum2 + sum3 + sum4);
			 sum1 = 0;
			 sum2 = 0;
			 sum3 = 0;
			 sum4 = 0;
		}
	}
}

