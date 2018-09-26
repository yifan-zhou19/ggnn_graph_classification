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
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		i = n / 100;
		System.out.printf("%d\n",i);
		a = n - i * 100;
		m = a / 50;

			System.out.printf("%d\n",m);
			b = (a - 50 * m) / 20;
			System.out.printf("%d\n",b);
			c = (a - 50 * m - b * 20) / 10;
			System.out.printf("%d\n",c);
			d = a - a / 10 * 10;
			e = d / 5;
			System.out.printf("%d\n",e);
			f = d - 5 * e;
			System.out.printf("%d\n",f);



		return 0;


	}
}

