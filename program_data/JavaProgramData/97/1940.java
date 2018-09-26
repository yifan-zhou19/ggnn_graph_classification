package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int m;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m >= 100)
		{
			m = m - 100;
			a = a + 1;
		}
		while (m >= 50)
		{
			m = m - 50;
			b = b + 1;
		}
		while (m >= 20)
		{
			m = m - 20;
			c = c + 1;
		}
		while (m >= 10)
		{
			m = m - 10;
			d = d + 1;
		}
		while (m >= 5)
		{
			m = m - 5;
			e = e+1;
		}
		while (m >= 1)
		{
			m = m - 1;
			f = f + 1;
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
		return 0;
	}
}

