package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 100;
		a1 = x % 100;
		b = a1 / 50;
		b1 = a1 % 50;
		c = b1 / 20;
		c1 = b1 % 20;
		d = c1 / 10;
		d1 = c1 % 10;
		e = d1 / 5;
		e1 = d1 % 5;
		f = e1;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
		return 0;
	}

}

