package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[10][10];
	public static int[] max = new int[10];
	public static int[] min = new int[10];
	public static int i;
	public static int Main()
	{
		int Row;
		int Col;
		int f = -1;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			Col = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < Row;row++)
		{
		 for (col = 0;col < Col;col++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 array[row][col] = Integer.parseInt(tempVar3);
			 }
		 }
		}




		for (row = 0;row < Row;row++)
		{
			max[row] = 0;
		   for (i = 1;i < Col;i++)
		   {
				if (array[row][max[row]] < array[row][i])
				{
				  max[row] = i;
				}

		   }
		}




		for (col = 0;col < Col;col++)
		{
			  min[col] = 0;
			  for (i = 0;i < Row;i++)
			  {
				   if (array[min[col]][col] > array[i][col])
				   {
					   min[col] = i;
				   }
			  }

		}




	  for (row = 0;row < Row;row++)
	  {
		   if (min[max[row]] == row)
		   {
			  System.out.printf("%d+%d",row,max[row]);
			   f = 1;
			  break;
		   }
	  }
		   if (f == -1)
		   {
		   System.out.print("No");
		   }
		return 0;
	}
}

