package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] days =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int Count = 0;
		int i;
		int j;
		int k;

		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = year1,j = month1,k = day1;i < year2 || j < month2 || k < day2;Count++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) //??
			{
				if (k < days[1][j - 1])
				{
					k++;
				}
				else
				{
					k = 1;
					if (j < 12)
					{
						j++;
					}
					else
					{
						i++;
						j = 1;
					}
				}
			}
			else
			{
				if (k < days[0][j - 1])
				{
					k++;
				}
				else
				{
					k = 1;
					if (j < 12)
					{
						j++;
					}
					else
					{
						i++;
						j = 1;
					}
				}
			}
		}
		System.out.print(Count);

		return 0;
	}

}

