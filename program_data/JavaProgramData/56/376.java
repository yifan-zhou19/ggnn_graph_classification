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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 100)
		{
			b = a % 10;
			c = (int)(a / 10);
			d = 10 * b + c;
			System.out.printf("%d\n",d);
		}
		else if (a > 100 && a < 1000)
		{
			b = (int)(a / 100);
			c = (int)(a / 10) - 10 * b;
			d = a - 100 * b - 10 * c;
			e = 100 * d + 10 * c + b;
			System.out.printf("%d",e);
		}
		else if (a > 1000 && a < 10000)
		{
			b = (int)(a / 1000);
			c = ((a % 100) - (a % 10)) / 10;
			d = ((a % 1000) - (a % 100)) / 100;
			e = a % 10;
			f = 1000 * e+100 * c + 10 * d + b;
			System.out.printf("%d",f);
		}
		else
		{
			b = (int)(a / 10000);
			c = ((a % 100) - (a % 10)) / 10;
			d = ((a % 1000) - (a % 100)) / 100;
			g = ((a % 10000) - (a % 1000)) / 1000;
			e = a % 10;
			f = 10000 * e+1000 * c + 100 * d + 10 * g + b;
			System.out.printf("%d",f);
		}
		return 0;
	}
}

