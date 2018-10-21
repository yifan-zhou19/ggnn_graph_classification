package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		e = (a - 1) % 400;
		f = (a - 1) / 400;
		g = e % 100;
		sum = 365 * ((a - 1) % 7) + f * 97 + e / 100 * 24 + g / 4;
		sum = sum % 7;
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			else if (a % 400 == 0 || ((a % 4 == 0) && (a % 100 != 0)))
			{
				sum += 29;
			}
			else
			{
				sum += 28;
			}
		}
		sum += c;
		d = sum % 7;
		switch (d)
		{
		case 1:
			System.out.print("Mon.");
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
		case 2:
			System.out.print("Tue.");
			break;
		default:
			System.out.print("Sun.");
		}
		return 0;
	}
}

