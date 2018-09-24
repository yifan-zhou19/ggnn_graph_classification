package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int l = 0;
		int h = 0;
		int sum = 0;
		int leap;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
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
		if ((y % 400) != 0)
		{
			y = y % 400;
		}
		else
		{
			y = 400;
		}
		for (i = 1;i <= y - 1;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				l = l + 2;
			}
			else
			{
				h++;
			}
		}
		switch (m)
		{
		case 1:
			sum = 0;
			break;
		case 2:
			sum = 31;
			break;
		case 3:
			sum = 59;
			break;
		case 4:
			sum = 90;
			break;
		case 5:
			sum = 120;
			break;
		case 6:
			sum = 151;
			break;
		case 7:
			sum = 181;
			break;
		case 8:
			sum = 212;
			break;
		case 9:
			sum = 243;
			break;
		case 10:
			sum = 273;
			break;
		case 11:
			sum = 304;
			break;
		case 12:
			sum = 334;
			break;
		default:
			System.out.print("data error");
			break;
		}
		sum = sum + d;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			leap = 1;
		}
		else
		{
			leap = 0;
		}
		if (leap == 1 && m > 2)
		{
			sum++;
		}
		s = sum + l + h;
		if (s % 7 == 0)
		{
			System.out.print("Sun.");
		}
		if (s % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (s % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (s % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (s % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (s % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (s % 7 == 6)
		{
			System.out.print("Sat.");
		}
		return 0;
	}



}

