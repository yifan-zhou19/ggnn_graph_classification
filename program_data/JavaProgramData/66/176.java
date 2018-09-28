package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int n,year,mon,day,m,u;
	  int n;
	  int year;
	  int mon;
	  int day;
	  int m;
	  int u;
	int[] month = new int[12];
	month[0] = 31,month[1] = 28,month[2] = 31,month[3] = 30,month[4] = 31,month[5] = 30,month[6] = 31,month[7] = 31,month[8] = 30,month[9] = 31,month[10] = 30,month[11] = 31;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		year = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		mon = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		day = Integer.parseInt(tempVar3);
	}
	n = 0;
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	{
	month[1] = 29;
	}
	else
	{
		month[1] = 28;
	}
	for (m = 0;m < (mon - 1);m++)
	{
		n = n + month[m];

	}

	n = n + day;
	n = n % 7;
	n += (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

	u = n % 7;
	switch (u)
	{
		case 1:
			System.out.print("Mon.\n");
			break;
	case 2:
		System.out.print("Tue.\n");
		break;
	case 3:
		System.out.print("Wed.\n");
		break;
	case 4:
		System.out.print("Thu.\n");
		break;
	case 5:
		System.out.print("Fri.\n");
		break;
	case 6:
		System.out.print("Sat.\n");
		break;
	case 0:
		System.out.print("Sun.\n");
		break;
	}
	return 0;
	}

}

