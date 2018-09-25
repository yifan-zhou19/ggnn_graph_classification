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
			a = 0;
			b = 0;
			c = 0;
			d = 0;
			e = 0;
			f = 0;
			g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a > 100)
		{

			b = a / 100;
			a = a - b * 100;
		}
			if (a >= 50)
			{
				a = a - 50;
				c = 1;
			}
			if (a >= 40)
			{
					d = 2;
					a = a - 40;
			}
			if ((a >= 20) && (a < 40))
			{
				d = 1;
					a = a - 20;
			}
			if (a >= 10)
			{
				e = 1;
					a = a - 10;
			}
			if (a >= 5)
			{
				f = 1;
				a = a - 5;
			}
			g = a;


		System.out.printf("%d\n",b);
			System.out.printf("%d\n",c);
			System.out.printf("%d\n",d);
			System.out.printf("%d\n",e);
			System.out.printf("%d\n",f);
			System.out.printf("%d\n",g);
	}
}

