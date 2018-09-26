package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		a = n / 100;
		if (n - (100 * a) > 50)
		{
			b = 1;
		}
		else
		{
			b = 0;
		}
		c = (n - 100 * a - 50 * b) / 20;
		d = (n - 100 * a - 50 * b - 20 * c) / 10;
		e = (n - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
		f = n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	   return 0;
	}
}

