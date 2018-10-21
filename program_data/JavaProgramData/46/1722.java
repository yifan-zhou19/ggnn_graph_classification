package <missing>;

public class GlobalMembers
{
	//***********************************
	//*   ????????              *
	//*   ??????                  *
	//*   ?????2011?11?5?       *
	//***********************************


	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int p;
		int count;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		p = 0; //p???????????
		count = 0; //count?????????
		i = 0;
		j = 0;
		while (true)
		{
			for (j = count; j < col - count; j++)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				p = p + 1;
			} //??????
			if (p == row * col)
			{
				break;
			}
			for (i = count + 1; i < row - count; i++)
			{
				System.out.print(array[i][j - 1]);
				System.out.print("\n");
				p = p + 1;
			} //??????
			if (p == row * col)
			{
				break;
			}
			for (j = col - count - 2; j >= count; j--)
			{
				System.out.print(array[i - 1][j]);
				System.out.print("\n");
				p = p + 1;
			} //??????
			if (p == row * col)
			{
				break;
			}
			for (i = row - count - 2; i > count; i--)
			{
				System.out.print(array[i][j + 1]);
				System.out.print("\n");
				p = p + 1;
			} //??????
			i = i + 1;
			if (p == row * col)
			{
				break; //??????????????,??
			}
			count = count + 1;
		}
		return 0;
	}
}

