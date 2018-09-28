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

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		System.out.printf("%d\n",a);
		n = n % 100;
		b = n / 50;
		System.out.printf("%d\n",b);
		n = n % 50;
		c = n / 20;
		System.out.printf("%d\n",c);
		n = n % 20;
		d = n / 10;
		System.out.printf("%d\n",d);
		n = n % 10;
		e = n / 5;
		System.out.printf("%d\n",e);
		n = n % 5;
		f = n / 1;
		System.out.printf("%d\n",f);
		n = n % 1;
		return 0;
	}


}

