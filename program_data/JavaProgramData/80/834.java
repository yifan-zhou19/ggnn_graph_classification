package <missing>;

public class GlobalMembers
{
	//??????????????????
	//????????????????????????
	public static int DateToDay(int year,int month,int day)
	{
		int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365}; //??????????????????
		int[] b = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366}; //???
		int d1;
		int d2;
		int d3;
		int leap; //??
		leap = ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400); //??????
		d1 = leap * 366 + (year - 1 - leap) * 365; //?????
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //???????
		{
			d2 = b[month - 1]; //?b??
		}
		else //??
		{
			d2 = a[month - 1]; //?a??        //?????
		}
		d3 = day;
		return d1 + d2 + d3;
	}

	public static int Main()
	{
		int starty;
		int startm;
		int startd;
		int endy;
		int endm;
		int endd;
		int distance;
		starty = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		distance = DateToDay(endy, endm, endd) - DateToDay(starty, startm, startd);
		System.out.print(distance);
		System.out.print("\n");
		return 0;
	}
}

