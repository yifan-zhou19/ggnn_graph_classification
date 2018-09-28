package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
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

		a = m / 100;
		b = (m - a * 100) / 50;
		c = (m - a * 100 - b * 50) / 20;
		d = (m - a * 100 - b * 50 - c * 20) / 10;
		e = (m - a * 100 - b * 50 - c * 20 - d * 10) / 5;
		f = (m - a * 100 - b * 50 - c * 20 - d * 10 - e * 5);
			System.out.printf("%d\n",a);
			System.out.printf("%d\n",b);
			System.out.printf("%d\n",c);
			System.out.printf("%d\n",d);
			System.out.printf("%d\n",e);
			System.out.printf("%d\n",f);
	return 0;
	}

}

