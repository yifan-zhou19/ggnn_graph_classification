package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int year;
		int month1;
		int month2;
		int date = 1;
		int count1 = 0;
		int count2 = 0;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			count1 = count2 = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i < month1;i++)
			{
				count1 += day[i];
			}
			count1 += date;
			if (month1 > 2)
			{
				if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
				{
					count1++;
				}
			}
			for (i = 1;i < month2;i++)
			{
				count2 += day[i];
			}
			count2 += date;
			if (month2 > 2)
			{
				if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
				{
					count2++;
				}
			}
			if ((count1 - count2) % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

