package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] board = new int[500][500];
		int n;
		int i;
		int j;
		int r1;
		int c1;
		int r2;
		int c2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = *board;
		int p = board;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(p + i * 500 + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(p + i * 500 + j) == 0)
				{
					r1 = i;
					c1 = j;
					i = 9999;
					break;
				}
			}
		}
		for (i = n - 1; i >= 0; i--)
		{
			for (j = n - 1; j >= 0; j--)
			{
				if (*(p + i * 500 + j) == 0)
				{
					r2 = i;
					c2 = j;
					i = -1;
					break;
				}
			}
		}
		System.out.print((r2 - r1 - 1) * (c2 - c1 - 1));
		System.out.print("\n");
		return 0;
	}
}

