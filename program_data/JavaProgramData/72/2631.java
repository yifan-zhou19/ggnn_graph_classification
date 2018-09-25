package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int[][] a = new int[20][20];
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
				  if (j == 0)
				  {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   a[i][j] = Integer.parseInt(tempVar3);
				   }
				  }
				   else
				   {
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   a[i][j] = Integer.parseInt(tempVar4);
				   }
				   }
			  }
		  }
		  for (i = 0;i < m;i++)
		  {
			   for (j = 0;j < n;j++)
			   {
					 if (j != 0)
					 {
							 if (a[i][j - 1] > a[i][j])
							 {
					 continue;
							 }
					 }
					 if (j != n - 1)
					 {
							   if (a[i][j + 1] > a[i][j])
							   {
					 continue;
							   }
					 }
					 if (i != m - 1)
					 {
							   if (a[i + 1][j] > a[i][j])
							   {
					 continue;
							   }
					 }
					 if (i != 0)
					 {
							 if (a[i - 1][j] > a[i][j])
							 {
					 continue;
							 }
					 }
					 System.out.printf("%d %d\n",i,j);
			   }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

