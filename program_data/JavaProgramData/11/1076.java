package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			a[2] = 29;
		}
		int sum = 0;
		for (int i = 1; i < month; i++)
		{
			sum = sum + a[i];
		}
		sum = sum + day;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

