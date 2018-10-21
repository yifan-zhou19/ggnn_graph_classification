package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = b = c = d = e = f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		a = n / 100;
		b = (n - 100 * a) / 50;
		c = (n - 100 * a - 50 * b) / 20;
		d = (n - 100 * a - 50 * b - 20 * c) / 10;
		e = (n - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
		f = (n - 100 * a - 50 * b - 20 * c - 10 * d - e * 5);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);
		return 0;
	}
}

