package <missing>;

public class GlobalMembers
{
	//*********************************************
	//** ??: ???????? **
	//** ??: ??? 1300012722 **
	//** ??: 2013.11.1 **
	//*********************************************
	public static int Main()
	{
		int row; //??????row,???col, ??????????????????n????????count
		int col;
		int n;
		int i;
		int j;
		int count = 0;
		int sum;
		int[][] array = new int[120][120]; //??????,????times
		int times;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = row * col; //???????????sum
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 1;
		j = 1; //?i?j????????????array[1][1]
		while (true)
		{
			n = i;
			for (j = n; j <= col - n + 1; j++)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				count++;
			}
			j--;
			i++;
			if (count >= sum)
			{
				break; //???????????????
			}
			for (; i <= row - n + 1; i++)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				count++;
			}
			if (count >= sum)
			{
				break; //???????????????
			}
			i--;
			j--;
			for (; j >= n; j--)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				count++;
			}
			if (count >= sum)
			{
				break; //???????????????
			}
			j++;
			i--;
			for (; i > n; i--)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				count++;
			}
			if (count >= sum)
			{
				break; //???????????????
			}
			i++;
			j++;
		}
		return 0;
	}
}

