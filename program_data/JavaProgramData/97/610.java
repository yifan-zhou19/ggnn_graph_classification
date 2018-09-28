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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		System.out.printf("%d\n",a);
		n = n - 100 * a;
		b = n / 50;
		System.out.printf("%d\n",b);
		n = n - 50 * b;
		c = n / 20;
		System.out.printf("%d\n",c);
		n = n - 20 * c;
		d = n / 10;
		System.out.printf("%d\n",d);
		n = n - 10 * d;
		e = n / 5;
		System.out.printf("%d\n",e);
		n = n - 5 * e;
		System.out.printf("%d\n",n);
		return 0;
	}

}

