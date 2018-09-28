package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //i,j ?????
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(array + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < col;i++) //??1??????
		{
			int k = 0; //????k=0
			j = i; //?j=i
			System.out.print((*(array + k) + j));
			System.out.print("\n");
			while (k + 1 < row && j - 1 >= 0) //?k+1<row??j-1>=0
			{
				k++; //k??
				j--; //j??
				System.out.print((*(array + k) + j));
				System.out.print("\n");
			}
		}
		for (i = 1;i < row;i++) //?????????
		{
			int k = col - 1; //????k=col-1
			j = i; //?j=i
			System.out.print((*(array + j) + k));
			System.out.print("\n");
			while (j + 1 < row && k - 1 >= 0) //?j+1<row??k-1>=0
			{
				j++; //j??
				k--; //k??
				System.out.print((*(array + j) + k));
				System.out.print("\n");
			}
		}
		return 0;
	}


}

