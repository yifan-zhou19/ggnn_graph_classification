package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int i;
		int p;
		int f;
		int g;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		p = 1;
		f = (n - 1);
		g = n;
		for (i = 1;i < n - 1;i++)
		{
			f *= n - 1;
		}
		for (i = 1;i < n;i++)
		{
			g *= n;
		}
		while ((n * (p + k)) % f != 0)
		{
			p++;
		}
		m = g * ((p + k) / f) - (n - 1) * k;
		System.out.printf("%ld",m);
	}

}

