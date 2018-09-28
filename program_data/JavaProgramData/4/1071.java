package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[r][c];
		for (int i = 0;i < r;i++)
		{
			for (int j = 0;j < c;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int k = 0;k < r + c - 1;k++)
		{
			if (k < c)
			{
				for (int i = 0;i < r && k - i >= 0;i++)
				{
					System.out.print((*(a + i) + k - i));
					System.out.print("\n");
				}
			}
			else
			{
				for (int i = c - 1;i >= 0 && k - i < r;i--)
				{
					System.out.print((*(a + k - i) + i));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

