package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int n;
		int total = 0;
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
		if (y % 400 == 0)
		{
			y = y - (y / 400 - 1) * 400;
		}
		else if (y / 400 >= 1)
		{
			y = y - y / 400 * 400;
		}
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < m;i++)
		{
			total += md[i - 1];
		}
		for (i = 1;i < y;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				total += 366 % 7;
			}
			else
			{
				total += 365 % 7;
			}
		}
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			if (m > 2)
			{
				total += 1;
			}
		}
		total += d;
		n = total % 7;
		switch (n)
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
		return 0;
	}




}

