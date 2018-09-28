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
		int h;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		b = n / 10;
		c = b % 10;
		d = b / 10;
		e = d % 10;
		f = d / 10;
		g = f % 10;
		h = f / 10;
		switch ((b > 0) + (d > 0) + (f > 0) + (h > 0))
		{
		case 0:
			System.out.printf("%d\n",a);
			break;
		case 1:
			System.out.printf("%d\n",a * 10 + c);
			break;
		case 2:
			System.out.printf("%d\n",a * 100 + c * 10 + e);
			break;
		case 3:
			System.out.printf("%d\n",a * 1000 + c * 100 + e * 10 + g);
			break;
		case 4:
			System.out.printf("%d\n",a * 10000 + c * 1000 + e * 100 + g * 10 + h);
		}
	}

}

