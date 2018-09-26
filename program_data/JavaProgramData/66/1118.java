package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int x)
	{
		int result;
		if (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int y;
		int r;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < y;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(n) != 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
		}

		sum += r;

		for (i = 1;1;i++)
		{
			if (n > 2001)
			{
				n -= 2000;
			}
			else
			{
				break;
			}
		}

		for (i = 1;i < n;i++)
		{
			if (isRunNian(i) != 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}


		switch (sum % 7)
		{
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
			break;
		default:
			System.out.print("Sun.");
			break;
		}
		return 0;
	}
}

