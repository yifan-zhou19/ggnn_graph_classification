package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int d = 0;


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


	switch (month)
	{
		case 1:
			d = 0;
			break;
	case 2:
		d = 31;
		break;

	case 3:
		d = 59;
		break;

	case 4:
		d = 90;
		break;

	case 5:
		d = 120;
		break;

	case 6:
		d = 151;
		break;

	case 7:
		d = 181;
		break;

	case 8:
		d = 212;
		break;

	case 9:
		d = 243;
		break;

	case 10:
		d = 273;
		break;

	case 11:
		d = 304;
		break;

	case 12:
		d = 334;
		break;

	}
	if ((month > 2) && (year % 400 == 0))
	{
		d = d + 1 + day;
	}
	else if ((month > 2) && (year % 100 != 0) && (year % 4 == 0))
	{
		d = d + 1 + day;
	}

	else
	{
		d = d + day;
	}

	System.out.printf("%d\n",d);

	return 0;
	}


}

