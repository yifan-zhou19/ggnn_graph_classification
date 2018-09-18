package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		y = Math.log10(x);
		a = x / 10000;
		b = (x - a * 10000) / 1000;
		c = (x - a * 10000 - b * 1000) / 100;
		d = (x - a * 10000 - b * 1000 - c * 100) / 10;
		e = x - a * 10000 - b * 1000 - c * 100 - d * 10;
		switch (y)
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
			break;
			  default:
				  System.out.print("0");
		}
		return 0;
	}

}

