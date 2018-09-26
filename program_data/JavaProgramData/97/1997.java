package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 1.0 * n / 100;
		int a1 = (int)a;
		b = 1.0 * (n - 100 * a1) / 50;
		int b1 = (int)b;
		c = 1.0 * (n - 100 * a1 - 50 * b1) / 20;
		int c1 = (int)c;
		d = 1.0 * (n - 100 * a1 - 50 * b1 - 20 * c1) / 10;
		int d1 = (int)d;
		e = 1.0 * (n - 100 * a1 - 50 * b1 - 20 * c1 - 10 * d1) / 5;
		int e1 = (int)e;
		f = 1.0 * (n - 100 * a1 - 50 * b1 - 20 * c1 - 10 * d1 - 5 * e1) / 1;
		int f1 = (int)f;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a1,b1,c1,d1,e1,f1);
	return 0;
	}

}

