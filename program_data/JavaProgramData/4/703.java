package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int i;
	int j;
	int[][] array = new int[101][101];
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= row;i++)
	{
	  for (j = 1;j <= col;j++)
	  {
		 *(*(array + i) + j) = ConsoleInput.readToWhiteSpace(true);
	  }
	}

	for (i = 1;i <= row + col - 1;i++)
	{
	   for (j = 0;j <= i;j++)
	   {
		  if (i - j > 0 && i - j <= col != 0 && j + 1 <= row)
		  {
		  System.out.print((*(array + j + 1) + i - j));
		  System.out.print("\n");
		  }
	   }
	}
	return 0;

	}
}

