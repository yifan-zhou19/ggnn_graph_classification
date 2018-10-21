package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a,b,c,d;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long run;
		int run;
		a -= 1;
		run = a / 400 * 97 + a % 400 / 100 * 24 + a % 400 % 100 / 4;
		a += 1;
		d = run * (366 % 7) + (a - 1 - run) * (365 % 7);
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			switch (b)
			{
			case 12:
				d += 30;
			case 11:
				d += 31;
			case 10:
				d += 30;
			case 9:
				d += 31;
			case 8:
				d += 31;
			case 7:
				d += 30;
			case 6:
				d += 31;
			case 5:
				d += 30;
			case 4:
				d += 31;
			case 3:
				d += 29;
			case 2:
				d += 31;
			case 1:
				d += 0;
			}
			d += c;
		}
		else
		{
			switch (b)
			{
			case 12:
				d += 30;
			case 11:
				d += 31;
			case 10:
				d += 30;
			case 9:
				d += 31;
			case 8:
				d += 31;
			case 7:
				d += 30;
			case 6:
				d += 31;
			case 5:
				d += 30;
			case 4:
				d += 31;
			case 3:
				d += 28;
			case 2:
				d += 31;
			case 1:
				d += 0;
			}
			d += c;
		}

	switch (d % 7)
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

