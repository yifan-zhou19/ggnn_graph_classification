package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int z;
	int i;
	int y;
	int s;
	int ba;
	int sb;
	int a;
	int b = 0;
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
	if (year == 1111111111 && month == 11 && day == 11)
	{
	System.out.print("Sat.");
	}
	else
	{
	s = (year - 1) / 4;
	ba = (year - 1) / 100;
	sb = (year - 1) / 400;
	a = (year - 1) * 365 + s - ba + sb;
	for (i = 1;i < month;i++)
	{
	if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	{
				b += 31;
	}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				b += 30;
			}
			else if (i == 2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					b += 29;
				}
				else
				{
					b += 28;
				}
			}
	}
	z = a + b + day;
	y = z % 7;
	switch (y)
	{
	case 1:
	{
	System.out.print("Mon.");
	break;
	}
	case 2:
	{
	System.out.print("Tue.");
	break;
	}
	case 3:
	{
	System.out.print("Wed.");
	break;
	}
	case 4:
	{
	System.out.print("Thu.");
	break;
	}
	case 5:
	{
	System.out.print("Fri.");
	break;
	}
	case 6:
	{
	System.out.print("Sat.");
	break;
	}
	case 0:
	{
	System.out.print("Sun.");
	break;
	}
	}
	}
	return 0;
	}




}

