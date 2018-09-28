package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int judge(int x,int y)
	{
	  int i;
	  int j;
	  for (i = 0;i < 5;i++)
	  {
		if (a[i][y] < a[x][y])
		{
		   return 0;
		}
	  }
	  for (j = 0;j < 5;j++)
	  {
		if (a[x][j] > a[x][y])
		{
		  return 0;
		}
	  }
	  return 1;
	}
	public static int Main()
	{
	   int i;
	   int j;
	   int k = 0;
	   for (i = 0;i < 5;i++)
	   {
		 for (j = 0;j < 5;j++)
		 {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar);
		   }
		 }
	   }
	   for (i = 0;i < 5;i++)
	   {
		 for (j = 0;j < 5;j++)
		 {
		   if (judge(i, j) != 0)
		   {
			   System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
			   k = 1;
		   }
		 }
	   }
	   if (k == 0)
	   {
		 System.out.print("not found");
	   }
	}
}

