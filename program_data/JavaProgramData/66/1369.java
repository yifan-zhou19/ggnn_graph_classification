package <missing>;

public class GlobalMembers
{
	public static int t = 0;
	public static int year(int y)
	{
		int d;
		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
		{
			d = 366;
		}
		else
		{
			d = 365;
		}
		return d;
	}
	public static int month(int y,int m)
	{
		int d;
		if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12))
		{
			d = 31;
		}
		if ((m == 4) || (m == 6) || (m == 9) || (m == 11))
		{
			d = 30;
		}
		if (m == 2)
		{
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
			{
				d = 29;
			}
			else
			{
				d = 28;
			}
		}
		return d;
	}
	public static int Main()
	{
		int a;
		int m;
		int b;
		int c;
		int i;
		int w;
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
		m = (a - 1) % 400;
		for (i = 1;i <= m;i++)
		{
			t = t + year(i);
		}
		for (i = 1;i < b;i++)
		{
			t = t + month(a, i);
		}
		t = t + c;
		w = t % 7;
		switch (w)
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
		return 0;
	}

}

