package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int num = 0;
		int i;
		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) //???????
		{
			a[1] = 29;
		}
		else
		{
			a[1] = 28;
		}
		for (i = 0;i < month - 1;i++) //??month-1???????
		{
			num += a[i];
		}
		num += day; //???month?????
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

