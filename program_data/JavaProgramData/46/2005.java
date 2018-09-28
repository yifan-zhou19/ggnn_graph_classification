package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] array = new int[100][100];
	int row;
	int col;
	int i;
	int j;
	int rowmin;
	int rowmax;
	int colmin;
	int colmax;
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
	rowmin = 0;
	rowmax = row - 1;
	colmin = 0;
	colmax = col - 1;
	while (colmin < colmax && rowmin < rowmax)
	{
	for (i = colmin;i < colmax;i++)
	{
	System.out.printf("%d\n",array[rowmin][i]);
	}
	for (i = rowmin;i < rowmax;i++)
	{
	System.out.printf("%d\n",array[i][colmax]);
	}
	for (i = colmax;i > colmin;i--)
	{
	System.out.printf("%d\n",array[rowmax][i]);
	}
	for (i = rowmax;i > rowmin;i--)
	{
	System.out.printf("%d\n",array[i][colmin]);
	}
	rowmin++;
	rowmax--;
	colmin++;
	colmax--;
	}
	if (rowmin == rowmax && colmin < colmax)
	{
		for (i = colmin;i <= colmax;i++)
		{
	System.out.printf("%d\n",array[rowmin][i]);
		}
	}
	else if (rowmin < rowmax && colmin == colmax)
	{
		for (i = rowmin;i <= rowmax;i++)
		{
	System.out.printf("%d\n",array[i][colmin]);
		}
	}
	else if (rowmin == rowmax && colmin == colmax)
	{
	System.out.printf("%d\n",array[rowmin][colmax]);
	}

	}

}

