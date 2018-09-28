package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*????? 1300012845 **
	//*???2013.11.2  **
	//********************************
	public static int Main() //???
	{
		int[][] x = new int[104][104];
		int[] y = new int[10001];
		int N;
		int row;
		int col;
		int i;
		int j;
		int k;
		int l = 1;
		int min;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 1, j = 1;
		N = row * col;
		if (row > col)
		{
			min = col;
		}
		else
		{
			min = row;
		}
		for (k = 1; k <= min; k++) //????1
		{
			for (j = k; j <= col - k; j++) //????????
			{
				if (l > N)
				{
					break; //break??
				}
				y[l] = x[k][j]; //?????y??
				l++;
			}
			for (i = k; i <= row - k; i++) //????????
			{
				if (l > N)
				{
					break;
				}
				y[l] = x[i][col - k + 1];
				l++;
			}
			for (j = col - k + 1; j >= k + 1; j--) //??????????
			{
				if (l > N)
				{
					break;
				}
				y[l] = x[row - k + 1][j];
				l++;
			}
			for (i = row - k + 1; i >= k + 1; i--) //??????????
			{
				if (l > N)
				{
					break;
				}
				y[l] = x[i][k];
				l++;
			}
		}
		if (col == row && col % 2 != 0)
		{
			y[N] = x [(col + 1) / 2][(col + 1) / 2];
		}
		for (l = 1; l <= N; l++) //??
		{
			System.out.print(y[l]);
			System.out.print("\n");
		}
		return 0;
	}
}

