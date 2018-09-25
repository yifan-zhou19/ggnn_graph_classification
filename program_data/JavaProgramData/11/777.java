package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int n = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] ping = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
		{
			for (int i = 0;i < m - 1;i++)
			{
				n = n + ping[i];
			}
			n = n + d;
		}
		else
		{
			for (int i = 0;i < m - 1;i++)
			{
				n = n + run[i];
			}
			n = n + d;
		}
		System.out.print(n);
		System.out.print("\n");

		return 0;
	}
}

