package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		a = (int)n / 100;
		System.out.printf("%d\n",a);
		l = n - a * 100;
		int b;
		b = (int)l / 50;
		System.out.printf("%d\n",b);
		l = l - b * 50;
		int c;
		c = (int)l / 20;
		System.out.printf("%d\n",c);
		l = l - c * 20;
		int d;
		d = (int)l / 10;
		System.out.printf("%d\n",d);
		l = l - d * 10;
		int e;
		e = (int)l / 5;
		System.out.printf("%d\n",e);
		l = l - 5 * e;
		int f;
		f = (int)l / 1;
		System.out.printf("%d\n",f);
		return 0;
	}

}

