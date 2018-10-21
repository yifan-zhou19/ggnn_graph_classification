package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //??????
		int col;
		int k;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col]; //????
		for (i = 0;i < row;i++) //??????
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] p = new int[col]; //??????
		p = array; //??
		System.out.print(p);
		System.out.print("\n");
		for (k = 1;k <= row + col - 2;k++) //??????????????????  ???????????????
		{
			for (i = 0,j = k - i;i < row;i++,j--) //????  ????  ????
			{
				if (i >= 0 && i < row && j >= 0 && j < col) //???????????????
				{
					System.out.print((p[i] + j));
					System.out.print("\n");
				}
			}
		}
		return 0;

	}

}

