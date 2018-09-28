package <missing>;

public class GlobalMembers
{
	// jisuan.cpp : Defines the entry point for the console application.
	// ??????????????? 
	public static int Main()
	{
		int startyear = 0;
		int startmonth;
		int startday;
		int endyear = 0;
		int endmonth;
		int endday;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int leapyear = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int[] year = {365, 366};
		int[][] month =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		leapyear = ((startyear % 4 == 0) && (startyear % 100 != 0)) || (startyear % 400 == 0);
		for (int i = 0;i < startmonth - 1;i++)
		{
			sum1 = sum1 + month[leapyear][i];
		}
		sum1 = sum1 + startday;
		for (int i = startyear;i < endyear;i++)
		{
			leapyear = ((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0);
			sum2 = sum2 + year[leapyear];
		}
		leapyear = ((endyear % 4 == 0) && (endyear % 100 != 0)) || (endyear % 400 == 0);
		for (int k = 0;k < endmonth - 1;k++)
		{
			sum3 = sum3 + month[leapyear][k];
		}
		sum3 = sum3 + endday;
		sum2 = sum2 + sum3 - sum1;
		System.out.print(sum2);
		return 0;
	}






}

