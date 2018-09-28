package <missing>;

public class GlobalMembers
{
	public static int LpYr(int yr)
	{
	   return yr % 100 != 0 && yr % 4 == 0 || yr % 400 == 0;
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int days;
		int dayofwn;
		int[] daysofm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayofw = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		days = (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + d;
		for (i = 0;i < m - 1;i++)
		{
		   days += daysofm[i];
		}
		if (m > 2)
		{
			days += LpYr(y);
		}
		dayofwn = days % 7;
		System.out.printf("%s\n",dayofw[dayofwn]);

	  return 0;
	}
}

