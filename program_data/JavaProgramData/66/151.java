package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long year,month,day,i=1,s=0,a=0,n;
		int year;
		int month;
		int day;
		int i = 1;
		int s = 0;
		int a = 0;
		int n;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			m[2] = 29;
		}
		else
		{
			m[2] = 28;
		}
		while (i < month)
		{
			s = s + m[i];
			i = i + 1;
		}
		s = s + day;
		s = s % 7;
		if (year <= 400)
		{
		for (n = 1;n <= year - 1;n++)
		{
			if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
			{
				a = 2;
			}
			else
			{
				a = 1;
			}
			s = s + a;
		}
		s = s % 7;
		}
		else
		{
		year = year % 400 + 400;
		for (n = 1;n <= year - 1;n++)
		{
			if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
			{
				a = 2;
			}
			else
			{
				a = 1;
			}
			s = s + a;
		}
		s = s % 7;
		}
		switch (s)
		{
		case 0:
			System.out.print("Sun.");
			break;
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
		}

		return 0;
	}
}

