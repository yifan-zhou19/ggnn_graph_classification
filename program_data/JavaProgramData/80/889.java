package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int count = 0;
		int i;
		int[] dofm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = (year2 - year1) * 365 + (year2 - year1) / 4 + (year1 % 4 - year2 % 4 > 0) - (year2 - year1) / 100 - (year1 % 100 - year2 % 100 > 0) + (year2 - year1) / 400 + (year1 % 400 - year2 % 400 > 0) - day1 + day2;
		for (i = month1 - 1; i < 12; i++)
		{
			count += dofm[i] + (judge(year1) && i == 1);
		}
		for (i = month2 - 1; i < 12; i++)
		{
			count -= dofm[i] + (judge(year2) && i == 1);
		}
		System.out.print(count);
		return 0;
	}
}

