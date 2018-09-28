package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (n - n % 100) / 100;
		n = n - 100 * a;
		b = (n - n % 50) / 50;
		n = n - 50 * b;
		c = (n - n % 20) / 20;
		n = n - 20 * c;
		d = (n - n % 10) / 10;
		n = n - 10 * d;
		e = (n - n % 5) / 5;
		n = n - 5 * e;
		f = n;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
		return 0;
	}
}

