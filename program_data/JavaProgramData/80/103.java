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
		int t = new int(int l,int m);
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
		n = 365 * (d - a) + h + t(a, b) - t(d, e) - j + k - c + f;
		System.out.printf("%d\n",n);
	}
	public static int t(int l,int m)
	{
		int i = 0;
		if (l % 400 == 0 || (l % 4 == 0 && l % 100 != 0) && (m == 1 || m == 2))
		{
		i = 1;
		}
		return (i);
	}
}

