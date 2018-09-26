package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
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
		if (x < 10)
		{
			System.out.printf("%d\n",x);
		}
		else if (x < 100)
		{
			System.out.printf("%d%d\n",x % 10,x / 10);
		}
		else if (x < 1000)
		{
			a = x % 10;
			b = (x / 10) % 10;
			c = x / 100;
			System.out.printf("%d%d%d\n",a,b,c);
		}
		else if (x < 10000)
		{
			a = x % 10;
			b = (x / 10) % 10;
			c = (x / 100) % 10;
			d = x / 1000;
			System.out.printf("%d%d%d%d",a,b,c,d);
		}
		else
		{
			a = x % 10;
			b = (x / 10) % 10;
			c = (x / 100) % 10;
			d = (x / 1000) % 10;
			e = x / 10000;
			System.out.printf("%d%d%d%d%d\n",a,b,c,d,e);
		}
	}

}

