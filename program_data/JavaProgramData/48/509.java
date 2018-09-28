package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;

	public static int Main()
	{
		int produce = new int(int x, int y, int n);
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= 9; i++)
		{
			System.out.print(produce(i, 1, n));
			for (int j = 2; j <= 9; j++)
			{
				System.out.print(" ");
				System.out.print(produce(i, j, n));
			}
			System.out.print("\n");
		}
		return 0;
	}

	public static int produce(int x, int y, int day)
	{
		if (x == 0 || y == 0 || x == 10 || y == 10)
		{
			return 0;
		}
		else if (day == 0)
		{
			if (x == 5 && y == 5)
			{
				return m;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return (produce(x - 1, y, day - 1) + produce(x + 1, y, day - 1) + produce(x, y - 1, day - 1) + produce(x, y + 1, day - 1) + produce(x, y, day - 1) * 2) + produce(x - 1, y - 1, day - 1) + produce(x - 1, y + 1, day - 1) + produce(x + 1, y - 1, day - 1) + produce(x + 1, y + 1, day - 1);
		}
	}
}

