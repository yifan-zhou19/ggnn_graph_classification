package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int[][] a = new int[8][8];
		   int i;
		   int j;
		   int b;
		   int col;
		   int count1 = 0;
		   int m;
		   int n;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   scanf(",");
		   String tempVar2 = ConsoleInput.scanfRead();
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
							   (a[i][j]) = Integer.parseInt(tempVar3);
						   }
				   }
		   }
		   for (i = 0;i < n;i++)
		   {
			   col = 0;
				   b = a[i][0];
				   for (j = 0;j < m;j++)
				   {
						   if (a[i][j] > b)
						   {
								   b = a[i][j];
								   col = j;
						   }
				   }
				   for (j = 0;j < n;j++)
				   {
						   if (b > a[j][col])
						   {

						   break;
						   }
				   }
				   if (j == n)
				   {
					   System.out.printf("%d+%d",i,col);
					   count1 = 1;
					   break;
				   }
		   }
		   if (count1 == 0)
		   {
			   System.out.print("No");
		   }
		   return 0;
	}

}

