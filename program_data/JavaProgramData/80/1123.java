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
		int sum = 0;
		int i;
		int g = 0;
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		i = a + 1;
		while (i < d)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum++;
			}
			i++;
		}
		i = b - 1;
		while (i <= 11)
		{
			g += m[i];
			i++;
		}
		g = g - c;
		i = 0;
		while (i < e-1)
		{
			g += m[i];
			i++;
		}
		g = g + f;
		g = g + sum;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			if (b <= 2)
			{
				g++;
			}
		}
		if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
		{
			if (e >= 3)
			{
				g++;
			}
		}
		if (d > a)
		{
			g = g + (d - a - 1) * 365;
		}
		else if (a == d)
		{
			if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
			{
				g = g - 366;
			}
			else
			{
				g = g - 365;
			}
		}
		System.out.printf("%d\n",g);
		return 0;
	}

























}

