package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int r;
	 int row;
	 int col;
	 int flag1;
	 int p = 0;
	 int[][] a = new int[8][8];
	 int max;
	 int minnum;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 row = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 col = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < row;i++)
	 {
	  for (j = 0;j < col;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 for (i = 0;i < row;i++)
	 {
	  max = a[i][0];
	  minnum = 0;
	  for (j = 0;j < col;j++)
	  {
	   if (a[i][j] > max)
	   {
		max = a[i][j];
		minnum = j;
	   }
	  }
	  for (r = 0, flag1 = 1;r < row && flag1 != 0;r++)
	  {
	   if (max > a[r][minnum])
	   {
		flag1 = 0;
	   }
	  }
	   if (flag1 != 0)
	   {
		System.out.printf("%d+%d",i,minnum);
		p = 1;
	   }
	 }
	 if (p != 1)
	 {
	  System.out.print("No");
	 }
	return 0;
	}
}

