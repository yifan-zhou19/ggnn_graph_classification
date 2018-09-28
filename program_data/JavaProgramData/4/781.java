package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int r;
	public static int c;
	public static int judge(int i,int c)
	{
		if (i - c >= 0)
		{
			return i - c + 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < r;i++)
		{
			for (int j = 0;j < c;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0;i < r + c - 1;i++)
		{
			for (int j = judge(i, c);j <= i != 0 && j < r && i - j < c;j++)
			{
				System.out.print((*(a + j) + i - j));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

