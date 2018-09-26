package <missing>;

public class GlobalMembers
{
	// xingqiji.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
	int y1;
	int y;
	int m;
	int d;
	int a;
	int x;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d = Integer.parseInt(tempVar3);
	}
	y = y1 % 400;
	a = y / 4 - y / 100 + y / 400;

	if (y % 400 == 0 || y % 100 != 0 && y % 4 == 0)
	{
		if (m < 3)
		{
			a = a - 1;
		}
	}

	switch (m)
	{
	case 1:
		x = d;
		break;
	case 2:
		x = 31 + d;
		break;
	case 3:
		x = 59 + d;
		break;
	case 4:
		x = 90 + d;
		break;
	case 5:
		x = 120 + d;
		break;
	case 6:
		x = 151 + d;
		break;
	case 7:
		x = 181 + d;
		break;
	case 8:
		x = 212 + d;
		break;
	case 9:
		x = 243 + d;
		break;
	case 10:
		x = 273 + d;
		break;
	case 11:
		x = 304 + d;
		break;
	default :
		x = 334 + d;
		break;
	}

	b = (y * 365 + x + a - 1) % 7;

	switch (b)
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
	default :
		System.out.print("Sun.");
		break;
	}


		return 0;
	}


}

