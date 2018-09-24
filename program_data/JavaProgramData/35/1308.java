package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int line;
		int row;
		int[] maxLine = new int[8];
		int[] minRow = new int[8];
		int[][] num = new int[8][8];
		char c;
		line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i != line;i++)
		{
			for (j = 0; j != row; j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i != line;i++)
		{
			int maxl = -32767;
			for (j = 0; j != row; j++)
			{
				if (maxl < num[i][j])
				{
					maxl = num[i][j];
					maxLine[i] = j;
				}
			}
		}
		for (j = 0; j != row; j++)
		{
			int minr = 32767;
			for (i = 0; i != line; i++)
			{
				if (minr > num[i][j])
				{
					minr = num[i][j];
					minRow[j] = i;
				}
			}
		}
		int ansline = -1;
		int ansrow = -1;
		for (i = 0; i != line; i++)
		{
			if (minRow[maxLine[i]] == i)
			{
				ansline = i;
				ansrow = maxLine[i];
			}
		}
		if (ansline != -1)
		{
			System.out.print(ansline);
			System.out.print("+");
			System.out.print(ansrow);
		}
			else
			{
				System.out.print("No");
			}

		return 0;
	}
}

