package <missing>;

public class GlobalMembers
{
	public static void CWD(int y, int m, int d)
	{
		if (m == 1 || m == 2)
		{
			m = m + 12;
			y--;
		}
		int iWeek = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
		switch (iWeek)
		{
		case 0:
			System.out.print("Mon.");
			break;
		case 1:
			System.out.print("Tue.");
			break;
		case 2:
			System.out.print("Wed.");
			break;
		case 3:
			System.out.print("Thu.");
			break;
		case 4:
			System.out.print("Fri.");
			break;
		case 5:
			System.out.print("Sat.");
			break;
		case 6:
			System.out.print("Sun.");
			break;
		}
	}
	public static int Main()
	{
		int year = 0;
		int month = 0;
		int day = 0;
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
		CWD(year, month, day);
	}

}

