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
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x == 0)
		{
			System.out.print("0");
		}
		n = (int)Math.log10((double)x);
		a = x / 10000;
		x = x - a * 10000;
		b = x / 1000;
		x = x - b * 1000;
		c = x / 100;
		x = x - c * 100;
		d = x / 10;
		e = x - d * 10;

		switch (n)
		{
			case 0:
				System.out.printf("%d",e);
				break;
			case 1:
				System.out.printf("%d%d",e,d);
				break;
			case 2:
				System.out.printf("%d%d%d",e,d,c);
				break;
			case 3:
				System.out.printf("%d%d%d%d",e,d,c,b);
				break;
			case 4:
				System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}

		return 0;
	}

}

