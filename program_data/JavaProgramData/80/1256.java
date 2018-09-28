package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int year;
		int month;
		int day;
		int[] total = new int[3];
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int j = 2;
		while (j-- != 0)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total[j] = 0;
			for (int i = 1;i < year;i++)
			{
					if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
					{
							total[j] += 366;
					}
					else
					{
							total[j] += 365;
					}
			}
			for (int i = 1;i < month;i++)
			{
				total[j] += m[i];
			}
			total[j] += day;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
					if (month > 2)
					{
							total[j]++;
					}
			}
		}
		System.out.print(total[0] - total[1]);
		System.out.print("\n");
		return 0;
	 }
}

