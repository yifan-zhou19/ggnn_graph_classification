package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[8][8];
	 int i;
	 int k;
	 int row;
	 int col;
	 int max;
	 int x;
	 int min;
	 int l;
	 int y;
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
	   for (k = 0;k < col;k++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i][k] = Integer.parseInt(tempVar3);
		 }
	   }
	 }
	 for (i = 0;i < row;i++)
	 {
	  max = a[i][0];
	  for (k = 0;k < col;k++)
	  {
		 if (a[i][k] >= max)
		 {
		   max = a[i][k];
		   x = k;
		 }
	  }
	  min = a[0][x];
	 for (l = 0;l < row;l++)
	 {
	 if (a[l][x] <= min)
	 {
	  min = a[l][x];
	  y = l;
	 }
	 }
	 if (min == max)
	 {
	  System.out.printf("%d+%d",y,x);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  goto CATHERING;
	 }
	 }
	 System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	CATHERING:
	 return 0;
	}

}

