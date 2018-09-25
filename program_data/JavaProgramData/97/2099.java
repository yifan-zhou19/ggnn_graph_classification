package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 100;
		b = (a - b) / 100;
		a = a - 100 * b;
		System.out.printf("%d\n",b);
		c = a % 50;
		c = (a - c) / 50;
		a = a - 50 * c;
		System.out.printf("%d\n",c);
		d = a % 20;
		d = (a - d) / 20;
		a = a - 20 * d;
		System.out.printf("%d\n",d);
		e = a % 10;
		e = (a - e) / 10;
		a = a - 10 * e;
		System.out.printf("%d\n",e);
		f = a % 5;
		f = (a - f) / 5;
		a = a - 5 * f;
		System.out.printf("%d\n",f);
		System.out.printf("%d\n",a);
	}

}

