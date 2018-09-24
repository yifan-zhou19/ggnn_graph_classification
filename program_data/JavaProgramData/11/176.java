package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main(String[] args)
	{
		int year;
		int month;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int days[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //?????????0??????????0??13??
		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2 && (day < 1 || day > 29))
		{
		   System.out.print("Illegal input.\n");
		   return -1;
		}
		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month != 2 && (day < 1 || day > Main_days[month]))
		{
		   System.out.print("Illegal input.\n");
		   return -1;
		}
		int n = 0;
		int i;
		for (i = 1; i < month; i++)
		{
			n += Main_days[i];
		}
		n += day;
		if (month > 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
		{
		  n++;
		}
		System.out.printf("%d", n);
	}





}

