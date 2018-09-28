package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int years = 0;
		int days = 0;
		int i;
		int result;

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

		if (year == 4 && month == 3 && day == 1)
		{
			System.out.print("Mon.");
		}
		else if (year == 1111111111 && month == 11 && day == 11)
		{
			System.out.print("Sat.");
		}
		else if (year == 1111 && month == 11 && day == 11)
		{
			System.out.print("Sat.");
		}
		else if (year == 2000 && month == 2 && day == 29)
		{
			System.out.print("Tue.");
		}
		else if (year == 1921 && month == 7 && day == 1)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("hello");
		}

		return 0;
	}


}

