package <missing>;

public class GlobalMembers
{
	/*???2011-12-30
	 *??????
	 *????08.cpp
	 *????? - ??(10.5) ???
	 */


	public static int Main()
	{
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n = 0;
		int year = 0;
		int month1 = 0;
		int month2 = 0;
		int days = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int temp = 0; temp < n; temp++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			days = 0;
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				month[2] = 29;
			}
			else
			{
				month[2] = 28;
			}
			if (month1 < month2)
			{
				for (int temp2 = month1; temp2 < month2; temp2++)
				{
					days += month[temp2];
				}
			}
			else
			{
				for (int temp2 = month2; temp2 < month1; temp2++)
				{
					days += month[temp2];
				}
			}
			if (days % 7 == 0)
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

