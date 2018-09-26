package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[105][105];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 1;i <= col;i++)
		{ //????????????????
			int k = 1;
			while (k <= row != 0 && i - k + 1 >= 1)
			{
				System.out.print((*(a + k) + i - k + 1));
				System.out.print("\n");
				k++;
			}
		}
		for (int i = 2;i <= row;i++)
		{ //?????????????????
			int k = 0;
			while (i + k <= row != 0 && col - k >= 1)
			{
				System.out.print((*(a + i + k) + col - k));
				System.out.print("\n");
				k++;
			}
		}
		return 0;
	}
}

