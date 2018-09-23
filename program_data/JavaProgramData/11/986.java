package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int year;
		int month;
		int day;
		int n = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] pin = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			if (month >= 2)
			{
				for (i = 0; i <= month - 2; i++)
				{
					n = n + run[i];
				}
				n = n + day;
			}
			if (month == 1)
			{
				n = day;
			}
		}
		else
		{
			if (month >= 2)
			{
				for (i = 0; i <= month - 2; i++)
				{
					n = n + pin[i];
				}
				n = n + day;
			}
			if (month == 1)
			{
				n = day;
			}
		}
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}

