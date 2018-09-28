package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = {365, 366};
		int[][] month =
		{
			{3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3},
			{3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3}
		};
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int sum = 0;
		sum += ((y - 1) / 4) * 5;
		sum %= 7;
		sum += ((y - 1) / 100) * 6;
		sum %= 7;
		sum += ((y - 1) / 400);
		sum %= 7;
		for (i = ((y - 1) / 4) * 4 + 1;i < y;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 2;
				sum %= 7;
			}
			else
			{
				sum++;
				sum %= 7;
			}
		}
		int type;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			type = 1;
		}
		else
		{
			type = 0;
		}
		for (i = 0;i < m - 1;i++)
		{
			sum += month[type][i];
			sum %= 7;
		}
		sum += d;
		sum += 6;
		sum %= 7;
		if (sum == 0)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		else if (sum == 1)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		else if (sum == 2)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		else if (sum == 3)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		else if (sum == 4)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		else if (sum == 5)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		else if (sum == 6)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		return 0;
	}
}

