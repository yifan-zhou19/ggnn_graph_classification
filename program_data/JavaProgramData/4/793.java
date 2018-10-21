package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int col;
		int row = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < row ; i++)
		{
			for (int j = 0 ; j < col ; j++)
			{
				* (* (array + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		System.out.print(array);
		System.out.print("\n");
		if (row == 1 && col == 1)
		{
			return 0;
		}
		if (col == 1)
		{
			for (int i = 1 ; i < row ; i++)
			{
				System.out.print((array + i));
				System.out.print("\n");
			}
			return 0;
		}
		int r = 0;
		int l = 1;
		int begl = 1;
		int begr = 0;
		while (r != row - 1 || l != col - 1)
		{
			System.out.print((* (array + r) + l));
			System.out.print("\n");
			r++;
			l--;
			if (l < 0 || r == row) //?????
			{
				begl++; //??????
				if (begl == col) //??????????????????
				{
					begl--;
					begr++;
				}
				l = begl;
				r = begr;
			}
		}
		System.out.print((* (array + r) + l));
		System.out.print("\n");

		return 0;
	}
	// ( > w < ) finished~
}

