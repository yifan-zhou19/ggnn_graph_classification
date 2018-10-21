package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
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
			x = Integer.parseInt(tempVar);
		}
		a = x % 10;
		b = x % 100;
		c = x % 1000;
		d = x % 10000;
		e = (b - a) / 10;
		f = (c - b) / 100;
		g = (d - c) / 1000;
		if (x < 10)
		{
			System.out.printf("%d\n",a);
		}
		else if (x < 100)
		{
			System.out.printf("%d%d\n",a,e);
		}
		else if (x < 1000)
		{
			System.out.printf("%d%d%d\n",a,e,f);
		}
		else
		{
			System.out.printf("%d%d%d%d\n",a,e,f,g);
		}
		return 0;
	}
}

