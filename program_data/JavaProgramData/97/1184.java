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
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		int d1 = 0;
		int e1 = 0;
		int f1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		a1 = n % 100;
		b = a1 / 50;
		b1 = a1 % 50;
		c = b1 / 20;
		c1 = b1 % 20;
		d = c1 / 10;
		d1 = c1 % 10;
		e = d1 / 5;
		e1 = d1 % 5;
		f = e1;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}

}

