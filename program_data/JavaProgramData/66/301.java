package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int d;
		int w;
		int D;
		int y;
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
		y--;
		D = 365 * (y % 280000) + (y % 280000) / 4 - y / 100 + y / 400 + d;
		switch (m)
		{
		case 2:
			D = D + 31;
			break;
		case 3:
			D = D + 31 + 28;
			break;
		case 4:
			D = D + 31 + 28 + 31;
			break;
		case 5:
			D = D + 31 + 28 + 31 + 30;
			break;
		case 6:
			D = D + 31 + 28 + 31 + 30 + 31;
			break;
		case 7:
			D = D + 31 + 28 + 31 + 30 + 31 + 30;
			break;
		case 8:
			D = D + 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			D = D + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			D = D + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			D = D + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			D = D + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		y++;
		if (y % 400 == 0)
		{
			if (m > 2)
			{
				D++;
			}
		}
		else if (y % 4 == 0 && y % 100 != 0)
		{
			if (m > 2)
			{
				D++;
			}
		}
		w = D % 7;
		switch (w)
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
		}
		return 0;
	}



}

