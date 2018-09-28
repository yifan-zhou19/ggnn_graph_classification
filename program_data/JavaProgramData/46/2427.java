package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int N = row * col;
		//???????
		int[][] array = new int[100][100];
		for (int r = 0 ; r < row ; r++)
		{
			for (int c = 0 ; c < col ; c++)
			{
				array[r][c] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		//????????????
		int r = 0;
		int c = 0;
		int K = 0;
		while (true) //????????????
		{

			//????
			for (int j = c ; j <= col - 1 ; j++)
			{
				System.out.print(array[r][j]);
				System.out.print("\n");
				K++;
			}
			if (r < row - 1)
			{
				r++; //????????
			}
			if (K == N)
			{
				break; //??????????
			}
			//????
			for (int i = r ; i <= row - 1 ; i++)
			{
				System.out.print(array[i][col - 1]);
				System.out.print("\n");
				K++;
			}
			if (c < col - 1)
			{
				col--; //?????????
			}
			if (K == N)
			{
				break; //??????????
			}
			//????
			for (int j = col - 1 ; j >= c ; j--)
			{
				System.out.print(array[row - 1][j]);
				System.out.print("\n");
				K++;
			}
			if (r < row - 1)
			{
				row--; //?????????
			}
			if (K == N)
			{
				break; //??????????
			}
			//????
			for (int i = row - 1 ; i >= r ; i--)
			{
				System.out.print(array[i][c]);
				System.out.print("\n");
				K++;
			}
			if (c < col - 1)
			{
				c++;
			}
			if (K == N)
			{
				break; //??????????
			}
		}

		return 0;
	}
	// ( > w < ) finished~
}

