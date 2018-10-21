package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
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
			m = Integer.parseInt(tempVar);
		}
		a = m / 100;
		System.out.printf("%d\n",a);
		a1 = m - a * 100;
		b = a1 / 50;
		System.out.printf("%d\n",b);
		b1 = a1 - b * 50;
		c = b1 / 20;
		System.out.printf("%d\n",c);
		c1 = b1 - c * 20;
		d = c1 / 10;
		System.out.printf("%d\n",d);
		d1 = c1 - d * 10;
		e = d1 / 5;
		System.out.printf("%d\n",e);
		e1 = d1 - e * 5;
		f = e1;
		System.out.printf("%d\n",f);

	}
}

