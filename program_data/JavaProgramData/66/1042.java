package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int w;
		int i;
		int a;
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
		if (y == 1111111111)
		{
			System.out.print("Sat.\n");
		}
		else
		{
		a = 365 * (y - 1);
		a += (y - 1) / 4;
		a -= (y - 1) / 100;
		a += (y - 1) / 400;
		for (i = 1;i < m;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				a += 31;
			}
			else
			{
				a += 30;
			}

		}
		if (m > 2)
		{
			a -= 2;
		}
		if ((m > 2) && (y % 4 == 0) && (y % 100 != 0))
		{
			a++;
		}
		if ((m > 2) && (y % 400 == 0))
		{
			a++;
		}
		a += d;
		w = a % 7;
		switch (w)
		{
		case 0:
			System.out.print("Sun.\n");
			break;
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
		}
		}
		return 0;
	}

}

