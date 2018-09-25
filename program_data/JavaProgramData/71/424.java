package <missing>;

public class GlobalMembers
{
	/* title:???*
	 * author:???*
	 * time:2011.9.28*/




	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int i;
		int j;
		int t;
		int day;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] rmonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					  day = 0;
			if (month1 > month2)
			{
				t = month1;
				month1 = month2;
				month2 = t;
			}
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				for (j = month1; j < month2; j++)
				{
					day = day + rmonth[j];
				}
			}
			else
			{
				for (j = month1; j < month2; j++)
				{
					day = day + month[j];
				}
			}
			if (day % 7 == 0)
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

