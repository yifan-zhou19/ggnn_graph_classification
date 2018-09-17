package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int depart = new int(int number, int y);

		int i;
		int n;
		int number;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(depart(number, 2));
			System.out.print("\n");
		}

		return 0;
	}

	public static int depart(int number, int y)
	{
		int count = 1;
		int a;
		int i;
		if (number == 1)
		{
			return 0;
		}
		if (number == 2)
		{
			return 1;
		}
		else
		{
		a = Math.sqrt(number);
		}
		for (i = y; i <= a; i++)
		{
			if (number % i == 0)
			{
				count += depart(number / i, i);
			}
		}
		return count;
	}


}

