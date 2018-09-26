package <missing>;

public class GlobalMembers
{
	/*************************************
	*file 2.cpp                     ******
	*author ???                    ****
	*date 2013-11-1                    ***
	*description ????????        *
	*************************************/
	public static int Main()
	{
		int row; //???????
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i; //?????????
		int j;
		int m;
		int n;
		int s = row * col; //s???????,k????
		int k = 0;
		int[][] a = new int[200][200];
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		//??????i,i???i,col-i+1???row-i+1,col-i+1???row-i+1,i?????i,i?
		for (i = 1; (i <= col - i + 1) && (i <= row - i + 1); i++)
		{
			for (m = i; m <= col - i + 1 && (k - s); m++) //???k-s?????????????????????????????????
			{
				System.out.print(a[i][m]);
				System.out.print("\n");
				k++;
			}
			for (m = i + 1; m <= row - i + 1 && (k - s); m++)
			{
				System.out.print(a[m][col - i + 1]);
				System.out.print("\n");
				k++;
			}
			for (m = col - i; m >= i != 0 && (k - s); m--)
			{
				System.out.print(a[row - i + 1][m]);
				System.out.print("\n");
				k++;
			}
			for (m = row - i; m > i && (k - s); m--)
			{
				System.out.print(a[m][i]);
				System.out.print("\n");
				k++;
			}
		}
		return 0;
	}
}

