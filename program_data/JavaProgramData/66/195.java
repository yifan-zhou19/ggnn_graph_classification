package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int a;
		int b;
		int c;
		int d = 0;
		int e;
		int f;
		int g;
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
		f = a % 2000;
		g = a / 2000;

		if (g == 0)
		{
			for (i = 1;i < a;i++)
			{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				d = d + 366;
			}
			else
			{
				d = d + 365;
			}
			}
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				d = d + 31;
			}
			else if (((a % 100 != 0 && a % 4 == 0) || (a % 400 == 0)) && i == 2)
			{
				d = d + 29;
			}
			else if (i == 2)
			{
				d = d + 28;
			}
			else
			{
				d = d + 30;
			}
		}
		d = d + c;
		}
		else
		{
			for (i = g * 2000;i < a;i++)
			{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				d = d + 366;
			}
			else
			{
				d = d + 365;
			}
			}
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				d = d + 31;
			}
			else if (((a % 100 != 0 && a % 4 == 0) || (a % 400 == 0)) && i == 2)
			{
				d = d + 29;
			}
			else if (i == 2)
			{
				d = d + 28;
			}
			else
			{
				d = d + 30;
			}
		}
		d = d + c - 2;
		}

		e = d % 7;
		switch (e)
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
		case 0:
			System.out.print("Sun.");
			break;
		}
	}


}

