package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
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
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			e = 29;
		}
		else
		{
			e = 28;
		}
		int m;
		int n;
		n = a / 400;
		m = a % 400;
		if (m == 0)
		{
			n = n - 1;
		}
		int i;
		int f = 0;
		for (i = 1 + n * 400;i < a;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				d = 366;
			}
			else
			{
				d = 365;
			}
			f = (f + d) % 7;
		}
		switch (b)
		{
		case 1:
				f = c + f;
				break;
		case 2:
				f = 31 + c + f;
				break;
		case 3:
				f = 31 + e + c + f;
				break;
		case 4:
				f = 62 + e + c + f;
				break;
		case 5:
				f = 92 + e + c + f;
				break;
		case 6:
				f = 123 + e + c + f;
				break;
		case 7:
				f = 153 + e + c + f;
				break;
		case 8:
				f = 184 + e + c + f;
				break;
		case 9:
				f = 215 + e + c + f;
				break;
		case 10:
				f = 245 + e + c + f;
				break;
		case 11:
				f = 276 + e + c + f;
				break;
		case 12:
				f = 306 + e + c + f;
				break;
		}
		f = f % 7;
		switch (f)
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
			break;
		}
	}

}

