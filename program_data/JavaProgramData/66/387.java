package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y;
	int m;
	int d;
	int hh;
	int pn;
	int rn;
	int sum;
	int a;
	int b;
	int c;
	int nianq;
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
	a = (y - 1) / 4;
	b = (y - 1) / 100;
	c = (y - 1) / 400;
	rn = a - b + c;
	pn = (y - 1) - rn;
	nianq = rn * 2 + pn * 1;
	if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
	{
		if (m == 1)
		{
			hh = d;
		}
		if (m == 2)
		{
			hh = 31 + d;
		}
		if (m == 3)
		{
			hh = 60 + d;
		}
		if (m == 4)
		{
			hh = 91 + d;
		}
		if (m == 5)
		{
			hh = 121 + d;
		}
		if (m == 6)
		{
			hh = 152 + d;
		}
		if (m == 7)
		{
			hh = 182 + d;
		}
		if (m == 8)
		{
			hh = 213 + d;
		}
		if (m == 9)
		{
			hh = 244 + d;
		}
		if (m == 10)
		{
			hh = 274 + d;
		}
		if (m == 11)
		{
			hh = 305 + d;
		}
		if (m == 12)
		{
			hh = 335 + d;
		}
	}
	else
	{
		if (m == 1)
		{
			hh = d;
		}
		if (m == 2)
		{
			hh = 31 + d;
		}
		if (m == 3)
		{
			hh = 59 + d;
		}
		if (m == 4)
		{
			hh = 90 + d;
		}
		if (m == 5)
		{
			hh = 120 + d;
		}
		if (m == 6)
		{
			hh = 151 + d;
		}
		if (m == 7)
		{
			hh = 181 + d;
		}
		if (m == 8)
		{
			hh = 212 + d;
		}
		if (m == 9)
		{
			hh = 243 + d;
		}
		if (m == 10)
		{
			hh = 273 + d;
		}
		if (m == 11)
		{
			hh = 304 + d;
		}
		if (m == 12)
		{
			hh = 334 + d;
		}
	}
	sum = (hh + nianq) % 7;
	if (sum == 0)
	{
		System.out.print("Sun.");
	}
	if (sum == 1)
	{
		System.out.print("Mon.");
	}
	if (sum == 2)
	{
		System.out.print("Tue.");
	}
	if (sum == 3)
	{
		System.out.print("Wed.");
	}
	if (sum == 4)
	{
		System.out.print("Thu.");
	}
	if (sum == 5)
	{
		System.out.print("Fri.");
	}
	if (sum == 6)
	{
		System.out.print("Sat.");
	}
	return 0;
	}

}

