package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: int f(unsigned int year,int month,int day)
	public static int f(int year,int month,int day)
	{
		int t = 0;


		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			t = 1;
		}
		int[] monthday = {0, 31, 28 + t, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int summonth = 0;
		int sum = 0;

		int i;
		for (i = 0;i < month;i++)
		{
			summonth += monthday[i];
		}
		sum = summonth + day;

		return sum;

	}


	public static int Main()
	{

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int year,month,day;
		int year;
		int month;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		int i;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int sumyear=0;
		int sumyear = 0;
		sumyear += (year - 1) / 4 * (1 * 4 + 1) - (year - 1) / 100 + (year - 1) / 400;
		sumyear += (year - 1) % 4 * 1;

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int total;
		int total;
		total = sumyear + f(year, month, day);

		int week;
		week = total % 7;
		switch (week)
		{
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		case 0:
			System.out.print("Sun.");
			break;
		}

		return 0;

	}
}

