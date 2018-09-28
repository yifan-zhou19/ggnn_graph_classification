package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f1 = new int(int,int,int);
		int f2 = new int(int,int);
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		s = f1(y2, m2, d2) - f1(y1, m1, d1) + f2(y1, y2);
		System.out.printf("%d",s);
	}
	public static int f1(int y,int m,int d)
	{
		int a;
		int b;
		int f;
		a = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
		b = (m > 2);
		if (m == 1)
		{
			f = d - 1;
		}
		if (m == 2)
		{
			f = d + 30;
		}
		if (m == 3)
		{
			f = d + 58;
		}
		if (m == 4)
		{
			f = d + 89;
		}
		if (m == 5)
		{
			f = d + 119;
		}
		if (m == 6)
		{
			f = d + 150;
		}
		if (m == 7)
		{
			f = d + 180;
		}
		if (m == 8)
		{
			f = d + 211;
		}
		if (m == 9)
		{
			f = d + 242;
		}
		if (m == 10)
		{
			f = d + 272;
		}
		if (m == 11)
		{
			f = d + 303;
		}
		if (m == 12)
		{
			f = d + 333;
		}
		f = f + a * b;
		return f;
	}
	public static int f2(int year1,int year2)
	{
		int f = 0;
		int i;
		for (i = year1;i < year2;i++)
		{
			f += (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
		}
		f += 365 * (year2 - year1);
		return f;
	}






}

