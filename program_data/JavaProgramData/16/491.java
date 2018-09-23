package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b1;
		int b;
		int c1;
		int c;
		int d1;
		int d;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x % 10;
		b1 = x % 100;
		b = b1 / 10;
		c1 = x % 1000;
		c = c1 / 100;
		d1 = x;
		d = d1 / 1000;
		if (d != 0)
		{
			y = a * 1000 + b * 100 + c * 10 + d;
			System.out.printf("%04d\n",y);
		}
		else if ((d == 0) && (c != 0))
		{
			y = a * 100 + b * 10 + c;
			System.out.printf("%03d\n",y);
		}
		else if ((c == 0) && (b != 0))
		{
			y = a * 10 + b;
			System.out.printf("%02d\n",y);
		}
		else
		{
			y = a;
			System.out.printf("%d\n",y);
		}
	}
}

