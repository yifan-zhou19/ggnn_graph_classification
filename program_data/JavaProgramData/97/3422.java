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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 100);
		b = (int)(n % 100 / 50);
		c = (int)(n % 50 / 20);
		d = (int)((n - 100 * a - 50 * b - 20 * c) / 10);
		e = (int)((n - 100 * a - 50 * b - 20 * c - d * 10) / 5);
		f = n % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);


		return 0;
	}
}

