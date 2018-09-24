package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w = 0;
		int i;
		int a;
		int b;
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
		a = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		for (i = 100000;i <= a;i += 100000)
		{
			w = (w + 36600000) % 7;
		}
		w = (w + a % 100000 * 366) % 7;
		b = y - 1 - a;
		for (i = 100000;i <= b;i += 100000)
		{
			w = (w + 36500000) % 7;
		}
		w = (w + b % 100000 * 365) % 7;
		for (i = 1;i < m;i++)
		{
			if (i == 2)
			{
				if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
				{
					w = (w + 1) % 7;
				}
			}
			else
			{
				w = (w + days[i - 1]) % 7;
			}
		}
		w = (w + d) % 7;
		switch (w)
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
		default:
			System.out.print("Sun.\n");
		}
		return 0;
	}
}

