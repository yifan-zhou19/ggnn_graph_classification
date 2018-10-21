package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] array = new int[99][99];
	   int row;
	   int col;
	   int i;
	   int j;
	   int t = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   row = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
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
				   array[i][j] = Integer.parseInt(tempVar3);
			   }
			  }
	   }
	   for (t = 0;t <= row + col - 2;t++)
	   {
		   if (t < col)
		   {
		   for (i = 0;i <= t != 0 && i <= row - 1;i++)
		   {
				  System.out.printf("%d\n",array[i][t - i]);
		   }
		   }
	   else
	   {
		   for (i = t + 1 - col;i <= t != 0 && i <= row - 1;i++)
		   {
			   System.out.printf("%d\n",array[i][t - i]);
		   }
	   }
	   }
	   return 0;
	}
}

