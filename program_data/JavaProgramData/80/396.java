package <missing>;

public class GlobalMembers
{
	public static int dayofy(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
	public static int dayofm(int day, int mon, int year)
	{
		int i;
		int temp;
		int sum = 0;
		for (i = 1 ; i < mon ; i++)
		{
		if (i == 2)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				temp = 29;
			}
			else
			{
				temp = 28;
			}
		}
		else if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			temp = 30;
		}
		else
		{
			temp = 31;
		}
		sum += temp;
		}
		return sum + day;
	}

	public static int Main()
	{
		int syear;
		int smon;
		int sday;
		int eyear;
		int emon;
		int eday;
		int i;
		int j;
		int disyear = 0;
		int disday = 0;
		syear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		smon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		emon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = syear ; i < eyear ; i++)
		{
			disyear += dayofy(i);
		}
		disday = dayofm(eday, emon, eyear) - dayofm(sday, smon, syear);
		System.out.print(disyear + disday);
		System.out.print("\n");
		return 0;
	}
}

