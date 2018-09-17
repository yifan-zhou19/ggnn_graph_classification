package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int year;
		int month;
		int day;
		int num = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			a[2]++;
		}
		for (int i = 1;i < month;i++)
		{
			num += a[i];
		}
		num += day;
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

