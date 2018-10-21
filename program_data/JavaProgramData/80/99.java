package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int j;
		int k;
		int n;
		h = 0;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		for (g = a + 1;g <= d;g++)
		{
			if (g % 400 == 0 || (g % 4 == 0 && g % 100 != 0))
			{
				h += 1;
			}
		}
		int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		j = days[b - 1];
		k = days[e-1];
		n = 365 * (d - a);
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0) && (b == 1 || b == 2))
		{
			h += 1;
		}
		if (d % 400 == 0 || (d % 4 == 0 && d % 100 != 0) && (e == 1 || e == 2))
		{
			h -= 1;
		}
		n = n + h - j + k - c + f;
		System.out.printf("%d\n",n);
	}
}

