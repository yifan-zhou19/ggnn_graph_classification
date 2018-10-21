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
		int z;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10)
		{
			System.out.printf("%d",a);
		}
		else if (a < 100)
		{
			b = a / 10;
			c = a % 10;
			System.out.printf("%d%d",c,b);
		}
		else if (a < 1000)
		{
			b = a / 100;
			z = a % 100;
			c = z / 10;
			d = z % 10;
			System.out.printf("%d%d%d",d,c,b);
		}
		else if (a < 10000)
		{
			b = a / 1000;
			z = a % 1000;
			c = z / 100;
			y = z % 100;
			d = y / 10;
			e = y % 10;
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else
		{
			System.out.print("00001");
		}
		return 0;
	}

}

