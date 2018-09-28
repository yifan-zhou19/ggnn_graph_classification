package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int n = 0;
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
		f = n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;

		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);

		return 0;
	}

}

