package <missing>;

public class GlobalMembers
{
	/*????*/
	public static void judge(int[][] a, int m, int n)
	{
	   int i = 0;
	   int j = 0;
	   if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
	   {
		   System.out.printf("%d %d\n",i,j);
	   }
	   for (j = 1,i = 0;j < n - 1;j++)
	   {
		   if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] > a[i + 1][j])
		   {
			   System.out.printf("%d %d\n",i,j);
		   }
	   }
	   j = n - 1;
	   if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
	   {
		   System.out.printf("%d %d\n",i,j);
	   }
	   for (i = 1;i < m - 1;i++)
	   {
		  j = 0;
		  if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
		  {
			  System.out.printf("%d %d\n",i,j);
		  }
		  for (j = 1;j < n - 1;j++)
		  {
			 if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
			 {
				 System.out.printf("%d %d\n",i,j);
			 }
		  }
		  j = n - 1;
		  if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
		  {
			  System.out.printf("%d %d\n",i,j);
		  }
	   }
	   j = 0;
	   i = m - 1;
	   if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
	   {
		   System.out.printf("%d %d\n",i,j);
	   }
	   for (j = 1;j < n - 1;j++)
	   {
		   if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
		   {
			   System.out.printf("%d %d\n",i,j);
		   }
	   }

	   j = n - 1;
	   if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
	   {
		   System.out.printf("%d %d\n",i,j);
	   }
	}
	public static void Main()
	{
	   int m;
	   int n;
	   int i;
	   int j;
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
	   int[][] a = new int[20][20];

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

	   judge(a, m, n);

	}
}

