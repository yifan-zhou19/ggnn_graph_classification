package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		while (a >= 2800)
		{
			a = a - 2800;
		}
		d = a - 1;
		e = d * 365 + (d / 4 + d / 400 - d / 100);
		if (b == 1)
		{
			f = 0;
		}
		else if (b == 2)
		{
			f = 31;
		}
		else if (b == 3)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 60;
			}
			else
			{
				f = 59;
			}
		}
		else if (b == 4)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 91;
			}
			else
			{
				f = 90;
			}
		}
		else if (b == 5)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 121;
			}
			else
			{
				f = 120;
			}
		}
		else if (b == 6)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 152;
			}
			else
			{
				f = 151;
			}
		}
		else if (b == 7)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 182;
			}
			else
			{
				f = 181;
			}
		}
		else if (b == 8)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 213;
			}
			else
			{
				f = 212;
			}
		}
		else if (b == 9)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 244;
			}
			else
			{
				f = 243;
			}
		}
		else if (b == 10)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 274;
			}
			else
			{
				f = 273;
			}
		}
		else if (b == 11)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 305;
			}
			else
			{
				f = 304;
			}
		}
		else if (b == 12)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
				f = 335;
			}
			else
			{
				f = 334;
			}
		}
		g = e + f + c;
		h = g % 7;
		if (h == 1)
		{
			System.out.print("Mon.");
		}
		else if (h == 2)
		{
			System.out.print("Tue.");
		}
		else if (h == 3)
		{
			System.out.print("Wed.");
		}
		else if (h == 4)
		{
			System.out.print("Thu.");
		}
		else if (h == 5)
		{
			System.out.print("Fri.");
		}
		else if (h == 6)
		{
			System.out.print("Sat.");
		}
		else if (h == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

