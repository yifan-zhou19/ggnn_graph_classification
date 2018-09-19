package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int sum = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i <= month - 1; i++)
		{
			if (i == month - 1)
			{
				sum += day;
			}
			else
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					sum += m2[i];
				}
				else
				{
					sum += m1[i];
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

