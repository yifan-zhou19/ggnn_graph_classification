package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		g = Math.log10(h) + 1;
		f = h / 10000;
		e = (h - 10000 * f) / 1000;
		c = (h - 10000 * f - 1000 * e) / 100;
		b = (h - 10000 * f - 1000 * e-100 * c) / 10;
		a = h - 10000 * f - 1000 * e-100 * c - 10 * b;
		switch (g)
		{
		case 5:
			System.out.printf("%d%d%d%d%d",a,b,c,e,f);
			break;
		case 4:
			System.out.printf("%d%d%d%d",a,b,c,e);
			break;
		case 3:
			System.out.printf("%d%d%d",a,b,c);
			break;
		case 2:
			System.out.printf("%d%xd",a,b);
			break;
		case 1:
			System.out.printf("%d",a);
		}
	}

}

