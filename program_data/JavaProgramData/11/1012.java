package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int num = 0;
		int[] Ping = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
		{
			;
		}
		else
		{
			Ping[2]++;
		}
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < month ; i++)
		{
			num += Ping[i];
		}
		System.out.print(num + day);
		System.out.print("\n");
	}
}

