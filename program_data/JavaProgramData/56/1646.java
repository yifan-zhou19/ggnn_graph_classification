package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int x;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x <= 9)
		{
			System.out.printf("%d",x);
		}
		else if (x <= 99)
		{
		int a;
		int b;
		a = x / 10;
		b = x - 10 * a;
		System.out.printf("%d%d\n",b,a);
		}
		else if (x <= 999)
		{
			int a;
			int b;
			int c;
			a = x / 100;
			b = (x - 100 * a) / 10;
			c = x - 100 * a - 10 * b;
		System.out.printf("%d%d%d\n",c,b,a);
		}
		else if (x <= 9999)
		{
			int a;
			int b;
			int c;
			int d;
			a = x / 1000;
			b = (x - 1000 * a) / 100;
			c = (x - 1000 * a - 100 * b) / 10;
			d = x - 1000 * a - 100 * b - 10 * c;
		System.out.printf("%d%d%d%d\n",d,c,b,a);
		}
		else if (x <= 99999)
		{
			int a;
			int b;
			int c;
			int d;
			int e;
			a = x / 10000;
			b = (x - 10000 * a) / 1000;
			c = (x - 10000 * a - 1000 * b) / 100;
			d = (x - 10000 * a - 1000 * b - 100 * c) / 10;
			e = (x - 10000 * a - 1000 * b - 100 * c - 10 * d);
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
	}
}

