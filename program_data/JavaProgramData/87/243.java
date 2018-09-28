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
		int g = 25;
		int h = 25;
		int i = 25;
		int j = 25;
		int k = 25;
		int l = 25;
		int n;
	while (!(g == 0 && h == 0 && i == 0 && j == 0 && k == 0 && l == 0))
	{
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
	n = 3600 * (d + 12 - a) + e * 60 + f - b * 60 - c;

	if (n != 43200)
	{
	System.out.printf("%d\n",n);
	}
	g = a;
	h = b;
	i = c;
	j = d;
	k = e;
	l = f;
	}
	return 0;
	}

}

