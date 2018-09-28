package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.???????? **
	//*?????? 1300017623 **
	//*???2013.11.1  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i1 = 0;
		int i2 = row - 1;
		int j1 = 0;
		int j2 = col - 1;
		for (i = 0; i < row ; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (true)
		{
			for (j = j1; j <= j2; j++)
			{
				System.out.print(a[i1][j]);
				System.out.print("\n");
			}
			i1++;
			if (i1 > i2)
			{
				break;
			}
			for (i = i1; i <= i2; i++)
			{
				System.out.print(a[i][j2]);
				System.out.print("\n");
			}
			j2--;
			if (j1 > j2)
			{
				break;
			}
			for (j = j2; j >= j1; j--)
			{
				System.out.print(a[i2][j]);
				System.out.print("\n");
			}
			i2--;
			if (i1 > i2)
			{
				break;
			}
			for (i = i2; i >= i1; i--)
			{
				System.out.print(a[i][j1]);
				System.out.print("\n");
			}
			j1++;
			if (i1 > i2)
			{
				break;
			}
		}

			return 0;
	}
}

