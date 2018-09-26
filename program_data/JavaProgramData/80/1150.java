package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int answer = 0;
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int gap;
		gap = endYear - startYear;
		int judge1;
		int judge2;
		int mid;
		judge1 = ((endYear % 400 == 0) || (endYear % 4 == 0 && endYear % 100 != 0));
		judge2 = ((startYear % 400 == 0) || (startYear % 4 == 0 && startYear % 100 != 0));
			if (startYear == endYear && startMonth == endMonth && startDay == endDay)
			{
				  System.out.print("0");
			   return 0;
			}
		if (startMonth > endMonth)
		{
				mid = 0;
				for (int i = endMonth - 1;i < startMonth - 1;i++)
				{
					mid += d[i];
				}
				   mid += (startDay - endDay);
			answer -= mid;
		}
			else
			{
				mid = 0;
				for (int i = startMonth - 1;i < endMonth - 1;i++)
				{
					mid += d[i];
				}
				mid += (endDay - startDay);
				answer += mid;
			}
			   answer += 365 * gap;
				for (int k = startYear + 1;k < endYear;k++)
				{
					answer += (k % 400 == 0 || (k % 4 == 0 && k % 100 != 0));
				}
				if ((startMonth < 2 && judge2 == 1) || ((startMonth == 2 && startDay != 29) && judge2 == 1))
				{
					answer++;
				}
				  if (endMonth > 2 && judge1 == 1)
				  {
					answer++;
				  }
				System.out.print(answer);
				return 0;
	}

}

