package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum = 0;
		int i;
		int er;
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
		if (y > 2800)
		{
			y = y - y / 2800 * 2800;
		}
		for (i = 1;i < y;i++)
		{
			if (i % 4 == 0)
			{
				if (i % 100 == 0)
				{
					if (i % 400 == 0)
					{
						sum += 366;
					}
					else
					{
						sum += 365;
					}
				}
				else
				{
					sum += 366;
				}
			}
			else
			{
				sum += 365;
			}
		}
		if (i % 4 == 0)
		{
			if (i % 100 == 0)
			{
				if (i % 400 == 0)
				{
					er = 29;
				}
				else
				{
					er = 28;
				}
			}
			else
			{
				er = 29;
			}
		}
		else
		{
			er = 28;
		}
		switch (m)
		{
		case 1:
			sum += d;
			break;
		case 2:
			sum += 31 + d;
			break;
		case 3:
			sum += 31 + er + d;
			break;
		case 4:
			sum += 31 + er + 31 + d;
			break;
		case 5:
			sum += 31 + er + 31 + 30 + d;
			break;
		case 6:
			sum += 31 * 3 + 30 + er + d;
			break;
		case 7:
			sum += 31 * 3 + 30 * 2 + er + d;
			break;
		case 8:
			sum += 31 * 4 + 30 * 2 + er + d;
			break;
		case 9:
			sum += 31 * 5 + 30 * 2 + er + d;
			break;
		case 10:
			sum += 31 * 5 + 30 * 3 + er + d;
			break;
		case 11:
			sum += 31 * 6 + 30 * 3 + er + d;
			break;
		case 12:
			sum += 31 * 6 + 30 * 4 + er + d;
			break;
		}
		if (sum % 7 == 0)
		{
			System.out.print("Sun.");
		}
		if (sum % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (sum % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (sum % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (sum % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (sum % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (sum % 7 == 6)
		{
			System.out.print("Sat.");
		}
		return 0;
	}



}

