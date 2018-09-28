package <missing>;

public class GlobalMembers
{
	public static void circle(int[][] list, int row_min, int row_max, int col_min, int col_max)
	{
	  int i;
	  int j;
	  if (row_min == row_max || col_min == col_max)
	  {
		for (i = col_min; i < col_max; i++)
		{
		  System.out.printf("%d\n",list[row_min][i]);
		}
		for (i = row_min; i <= row_max; i++)
		{
		  System.out.printf("%d\n",list[i][col_max]);
		}
	  }
	  else
	  {
		for (i = col_min; i < col_max; i++)
		{
		  System.out.printf("%d\n",list[row_min][i]);
		}
		for (i = row_min; i < row_max; i++)
		{
		  System.out.printf("%d\n",list[i][col_max]);
		}
		for (i = col_max; i > col_min; i--)
		{
		  System.out.printf("%d\n",list[row_max][i]);
		}
		for (i = row_max; i > row_min; i--)
		{
		  System.out.printf("%d\n",list[i][col_min]);
		}
	  }
	}

	public static int Main()
	{
	  int[][] array = new int[100][100];
	  int i;
	  int j;
	  int sumrow;
	  int sumcol;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  sumrow = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  sumcol = Integer.parseInt(tempVar2);
	  }
	  for (i = 0; i < sumrow; i++)
	  {
		for (j = 0; j < sumcol; j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  array[i][j] = Integer.parseInt(tempVar3);
		  }
		}
	  }

	  int row_min = 0;
	  int row_max = sumrow - 1;
	  int col_min = 0;
	  int col_max = sumcol - 1;

	  while (row_min <= row_max != 0 && col_min <= col_max)
	  {
		circle(array, row_min, row_max, col_min, col_max);
		row_min++;
		row_max--;
		col_min++;
		col_max--;
	  }

	  return 0;
	}
}

