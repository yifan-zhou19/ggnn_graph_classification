package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] arr = new int[9][9];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			arr[4][4] = m;
		for (;n > 0;n--)
		{
			int[][] temp = new int[9][9];
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					if (arr[i][j] > 0)
					{
						temp[i][j] += 2 * arr[i][j];
						temp[i - 1][j - 1] += arr[i][j];
						temp[i - 1][j] += arr[i][j];
						temp[i - 1][j + 1] += arr[i][j];
						temp[i][j - 1] += arr[i][j];
						temp[i][j + 1] += arr[i][j];
						temp[i + 1][j] += arr[i][j];
						temp[i + 1][j - 1] += arr[i][j];
						temp[i + 1][j + 1] += arr[i][j];
					}
				}
			}
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					arr[i][j] = temp[i][j];
				}
			}
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 8;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(' ');
			}
			System.out.print(arr[i][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

