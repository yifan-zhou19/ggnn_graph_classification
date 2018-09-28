package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int i;
	int j;
	int m;
	int span = 0;
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
	int[][] array = new int[100][100];
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
	   for (m = 0;;m++)
	   {
		for (i = m;i < col - m;i++)
		{
		 System.out.printf("%d\n",array[m][i]);
		 span++;
		}
		System.out.print("\n");
		if (span == row * col)
		{
			break;
		}
		for (j = m + 1;j < row - m;j++)
		{
		 System.out.printf("%d\n",array[j][col - m - 1]);
		 span++;
		}
		System.out.print("\n");
		if (span == row * col)
		{
			break;
		}
		for (i = col - 2 - m;i >= m;i--)
		{
		 System.out.printf("%d\n",array[row - m - 1][i]);
		 span++;
		}
		System.out.print("\n");
		if (span == row * col)
		{
			break;
		}
		for (j = row - 2 - m;j > m;j--)
		{
		 System.out.printf("%d\n",array[j][m]);
		 span++;
		}
		System.out.print("\n");
		if (span == row * col)
		{
			break;
		}
	   }
	   return 0;
	}


}

