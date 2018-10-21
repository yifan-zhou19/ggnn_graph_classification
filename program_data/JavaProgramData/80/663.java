package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int starty;
		int startm;
		int startd;
		int endy;
		int endm;
		int endd;
		int i;
		int j;
		int y = 0;
		int m1 = 0;
		int m2 = 0;
		int year;
		int year1;
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??

		starty = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (year = starty;year < endy;year++) //??????????
		{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			 year1 = 366;
		}
		else
		{
			year1 = 365;
		}
		y = y + year1;
		}

		if ((starty % 4 == 0 && starty % 100 != 0) || (starty % 400 == 0))
		{
			for (i = 1;i < startm;i++)
			{
		m1 = m1 + month2[i];
			}
		}
		else
		{
			for (i = 1;i < startm;i++)
			{
	m1 = m1 + month1[i];
			}
		}
		if ((endy % 4 == 0 && endy % 100 != 0) || (endy % 400 == 0))
		{
				for (i = 1;i < endm;i++)
				{
			m2 = m2 + month2[i];
				}
		}
			else
			{
				for (i = 1;i < endm;i++)
				{
					m2 = m2 + month1[i];
				}
			}
		int sum;
		sum = y + m2 - m1 + endd - startd;
		System.out.print(sum);


	}


}

