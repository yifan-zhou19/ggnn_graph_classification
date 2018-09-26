package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
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
			s = Integer.parseInt(tempVar);
		}
		a = s / 100;
		b = (s - 100 * a) / 10;
		c = s - 100 * a - 10 * b;
		d = b / 5;
		e = (b - 5 * d) / 2;
		f = b - 5 * d - 2 * e;
		g = c / 5;
		h = c - 5 * g;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,d,e,f,g,h);
		return 0;
	}
}

