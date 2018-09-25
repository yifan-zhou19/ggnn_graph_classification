package <missing>;

public class GlobalMembers
{
	public static int ping(int n)
	{
		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
		{
			return 31;
		}
		if (n == 2)
		{
			return 28;
		}
		if (n == 4 || n == 6 || n == 9 || n == 11)
		{
			return 30;
		}
	}
	public static int run(int n)
	{
		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
		{
			return 31;
		}
		if (n == 2)
		{
			return 29;
		}
		if (n == 4 || n == 6 || n == 9 || n == 11)
		{
			return 30;
		}
	}

	public static int Main()
	{
		int n;
		int month;
		int day;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0))
		{
			for (i = 1;i < month;i++)
			{
				sum += run(i);
			}
			sum += day;
			System.out.print(sum);
		}
		else
		{
				for (i = 1;i < month;i++)
				{
					sum += ping(i);
				}
				sum += day;
				System.out.print(sum);
		}
		return 0;
	}
}

