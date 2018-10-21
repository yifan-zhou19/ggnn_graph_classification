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
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 100;
		a -= 100 * b;
		c = a / 50;
		a -= 50 * c;
		d = a / 20;
		a -= 20 * d;
		e = a / 10;
		a -= 10 * e;
		f = a / 5;
		a -= 5 * f;
		g = a / 1;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,g);

		return 0;
	}
}

