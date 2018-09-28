package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//while(1)
		//{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		if (y > 400 && y % 400 != 0)
		{
			y = y % 400;
		}
		for (int i = 1;i < y;i++)
		{
			int total = 365;
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				total = 366;
			}
			sum += total;
			if (sum > 7)
			{
				sum = sum % 7;
			}
		}
		int[] e = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
		{
			e[2] = 29;
		}
		for (int i = 0;i < m;i++)
		{
			sum += e[i];
		}
		sum += d;
		sum = sum % 7;
		if (sum == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		if (sum == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		if (sum == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		if (sum == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		if (sum == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		if (sum == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		if (sum == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}

		//}
	 return 0;

	}



}

