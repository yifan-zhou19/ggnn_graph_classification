package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if ((i >= 10) && (i < 100))
		{
			a = i / 1000;
		b = i % 10;
		g = 10 * b + a;
	System.out.printf("%d",b);
	System.out.printf("%d",a);
		}
		if ((i > 0) && (i < 10))
		{
			g = i;
	System.out.printf("%d",i);
		}
		if ((i >= 100) && (i < 1000))
		{
			a = i / 100;
			b = (i / 10) % 10;
			c = i % 10;
			g = 100 * c + 10 * b + a;
	System.out.printf("%d",c);
	System.out.printf("%d",b);
	System.out.printf("%d",a);
		}
		if ((i >= 1000) && (i < 10000))
		{

			a = i / 1000;
			b = (i / 100) % 10;
			c = (i / 10) % 10;
			d = i % 10;
			System.out.printf("%d",d);
	System.out.printf("%d",c);
	System.out.printf("%d",b);
	System.out.printf("%d",a);
		}


		return 0;
	}






}

