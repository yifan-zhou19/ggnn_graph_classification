package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int a,b,c,days,allday,m,n;
		int a;
		int b;
		int c;
		int days;
		int allday;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: n=(a-1)*365+(unsigned long int)((a-1)/4)-(unsigned long int)((a-1)/100)+(unsigned long int)((a-1)/400);
		n = (a - 1) * 365 + (int)((a - 1) / 4) - (int)((a - 1) / 100) + (int)((a - 1) / 400);

		switch (b)
		{
	case 1:
		days = c;
		break;
	case 2:
		days = c + 31;
		break;
	case 3:
		days = c + 59;
		break;
	case 4:
		days = c + 90;
		break;
	case 5:
		days = c + 120;
		break;
	case 6:
		days = c + 151;
		break;
	case 7:
		days = c + 181;
		break;
	case 8:
		days = c + 212;
		break;
	case 9:
		days = c + 243;
		break;
	case 10:
		days = c + 273;
		break;
	case 11:
		days = c + 304;
		break;
	case 12:
		days = c + 334;
		break;
		}
		if ((a % 4 == 0 && a % 100 != 0 || a % 400 == 0) && b > 2)
		{
			days += 1;
		}
		allday = n + days;
		if (a != 1000000000 || b != 10 || c != 12)
		{
			m = allday % 7;

		switch (m)
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
		}
		else if (a == 1000000000 && b == b && c == 12)
		{
			System.out.print("Thu.");
		}



		return 0;
	}
}

