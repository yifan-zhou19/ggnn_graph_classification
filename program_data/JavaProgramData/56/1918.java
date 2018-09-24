package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		a = num / 10000;
		b = num / 1000 - a * 10;
		c = num / 100 - 100 * a - 10 * b;
		d = num / 10 - 1000 * a - 100 * b - 10 * c;
		e = num - a * 10000 - b * 1000 - c * 100 - d * 10;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (b != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (c != 0)
		{
			System.out.printf("%d%d%d",e,d,c);
		}
		else if (d != 0)
		{
			System.out.printf("%d%d",e,d);
		}
		else if (e != 0)
		{
			System.out.printf("%d",e);
		}
		else
		{
			System.out.print("0");
		}
	}
}

