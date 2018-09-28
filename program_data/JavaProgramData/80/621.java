package <missing>;

public class GlobalMembers
{
	public static int run(int a)
	{
		int c;
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return c;
	}
	public static int dijitian(int y,int m,int d)
	{
		int c;
		int p = 0;
		int i;
		c = run(y);
		for (i = 1;i < m;i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
			 p = p + 30;
			}
			else if (i == 2 && c == 1)
			{
			  p = p + 29;
			}
			else if (i == 2 && c == 0)
			{
				p = p + 28;
			}
			else
			{
				p = p + 31;
			}

		}
		p = p + d;
		return p;
	}
	public static void Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int a;
		int b;
		int c = 0;
		int result;
		int temp;
		int i;
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
		a = dijitian(y1, m1, d1);
		b = dijitian(y2, m2, d2);
		if (y1 == y2)
		{
			result = a - b;
			if (result < 0)
			{
				result = 0 - result;
			}
		}
		else
		{
			if (y1 > y2)
			{
				temp = y1;
				y1 = y2;
				y2 = temp;
				temp = m1;
				m1 = m2;
				m2 = temp;
				temp = d1;
				d1 = d2;
				d2 = temp;
			}
			if (run(y1) == 1)
			{
				a = 366 - a;
			}
			else
			{
				a = 365 - a;
			}
			for (i = y1 + 1;i < y2;i++)
			{
				if (run(i) == 1)
				{
					c = c + 366;
				}
				else
				{
					c = c + 365;
				}
			}
			result = a + b + c;
		}
		System.out.printf("%d",result);
	}
}

