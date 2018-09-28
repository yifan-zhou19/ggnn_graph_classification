package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		//??????
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//startDay?1?1??????
		//xMonthThirteenth????13??????????
		//whatDay????13??????
		int startDay;
		int xMonthThirteenth = 13;
		int whatDay;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startDay = Integer.parseInt(tempVar);
		}
		xMonthThirteenth += (startDay - 1);
		for (i = 0; i < 12; i++)
		{
			whatDay = xMonthThirteenth % 7;
			if (whatDay == 5)
			{
				System.out.printf("%d\n", i + 1);
			}
			xMonthThirteenth += days[i];
		}

		return 0;
	}

}

