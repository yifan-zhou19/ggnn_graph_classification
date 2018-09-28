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
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		x = n % 100;
		b = x / 50;
		x = x - b * 50;
		c = x / 20;
		x = x - 20 * c;
		d = x / 10;
		x = x - 10 * d;
		e = x / 5;
		x = x - 5 * e;
		f = x;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d",f);
		return 0;

	}
}

