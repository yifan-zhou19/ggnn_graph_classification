package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int count;
		int i;
		int j;

		int[][] array = new int[100][100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}

		for (i = 0; i <= row - 1; i++)
		{
			  for (j = 0; j <= col - 1; j++)
			  {
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						array[i][j] = Integer.parseInt(tempVar3);
					}
			  }
		}




		int x = 0;
		int y = 0;

		for (count = 1; count <= col; count++)
		{
				  i = x;
				  j = y;
				  System.out.printf("%d\n", array[i][j]);

				  while (i + 1 <= row - 1 && j - 1 >= 0)
				  {
						  i = i + 1;
						  j = j - 1;
						  System.out.printf("%d\n", array[i][j]);
				  }

				  y = y + 1;
		}

		x = 1;
		y = col - 1;
		for (count = 2; count <= row; count++)
		{
				  i = x;
				  j = y;
				  System.out.printf("%d\n", array[i][j]);

				  while (i + 1 <= row - 1 && j - 1 >= 0)
				  {
						  i = i + 1;
						  j = j - 1;
						  System.out.printf("%d\n", array[i][j]);
				  }

				  x = x + 1;
		}




		return 0;
	}


}

