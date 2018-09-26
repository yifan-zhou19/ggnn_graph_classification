package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y = 0;
		int m = 0;
		int d = 0;
		int x = 0;
		int z = 0;
		int u = 0;
		int i = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		y = y % 2000000;
		x = (y - 1) / 100;
		z = (y - 1) / 4;
		for (i = 1;i <= x;i++)
		{
			if (i % 4 != 0)
			{
				z = z - 1;
			}
		}
		s = z * 366 + (y - z - 1) * 365;

		switch (m)
		{
		case 1:
			s = s;
			break;
		case 2:
			s = s + 31;
			break;
		case 3:
			s = s + 60;
			break;
		case 4:
			s = s + 91;
			break;
		case 5:
			s = s + 121;
			break;
		case 6:
			s = s + 152;
			break;
		case 7:
			s = s + 182;
			break;
		case 8:
			s = s + 213;
			break;
		case 9:
			s = s + 244;
			break;
		case 10:
			s = s + 274;
			break;
		case 11:
			s = s + 305;
			break;
		case 12:
			s = s + 335;
		}
		if (y % 400 != 0 && (y % 4 != 0 || y % 100 == 0))
		{
			s = s - 1;
		}
		s = s + d;
		u = s % 7;
		switch (u)
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
			System.out.print("Wen.");
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
	}

}

