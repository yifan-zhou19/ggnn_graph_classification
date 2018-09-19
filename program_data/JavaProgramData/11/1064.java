package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month1;
		int day;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int sum = 0;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			month[2] = month[2] + 1;
			for (i = 1;i < month1;i++)
			{
				sum = sum + month[i];
			}
			sum = sum + day;
		}
		else
		{
		for (i = 1;i < month1;i++)
		{
				sum = sum + month[i];
		}
			sum = sum + day;
		}

		System.out.print(sum);
		return 0;

	}
}

