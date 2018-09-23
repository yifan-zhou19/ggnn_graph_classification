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
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i = 1 + Math.log10(a);
		b = a / 10000;
		a = a % 10000;
		c = a / 1000;
		a = a % 1000;
		d = a / 100;
		a = a % 100;
		e = a / 10;
		a = a % 10;
		f = a;
		System.out.printf("%d",f);
		if (i > 1)
		{
			System.out.printf("%d",e);
		}
		if (i > 2)
		{
			System.out.printf("%d",d);
		}
		if (i > 3)
		{
			System.out.printf("%d",c);
		}
		if (i > 4)
		{
			System.out.printf("%d",b);
		}
		return 0;
	}
}

