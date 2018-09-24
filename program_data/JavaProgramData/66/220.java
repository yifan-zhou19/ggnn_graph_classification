package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int d;
		int sum = 0;
		int i;
		int e;
		int f;
		int g;
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
		e = (year - 1) / 4;
			 f = (year - 1) / 100;
			 g = (year - 1) / 400;
			 sum = (e - f + g) * 2 + (year - e + f - g - 1) * 1;

		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum = sum + 31;
			}
			if (i == 2)
			{
				if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0)
				{
					sum = sum + 29;
				}
				else
				{
					sum = sum + 28;
				}
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{

				sum = sum + 30;
			}
		}
	   sum = sum + day;

		d = sum % 7;
		if (d == 0)
		{
			System.out.print("Sun.");
		}
		if (d == 1)
		{
			System.out.print("Mon.");
		}
		if (d == 2)
		{
			System.out.print("Tue.");
		}
		if (d == 3)
		{
			System.out.print("Wed.");
		}
		if (d == 4)
		{
			System.out.print("Thu.");
		}
		if (d == 5)
		{
			System.out.print("Fri.");
		}
		if (d == 6)
		{
			System.out.print("Sat.");
		}


		return 0;
	}

}

