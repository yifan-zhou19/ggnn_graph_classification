package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int ws;
		int e;
		int s;
		int w;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = (n - n % 100) / 100;
		n = n - b * 100;
		ws = (n - n % 50) / 50;
		n = n - 50 * ws;
		e = (n - n % 20) / 20;
		n = n - 20 * e;
		s = (n - n % 10) / 10;
		n = n - 10 * s;
		w = (n - n % 5) / 5;
		y = n - 5 * w;
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",ws);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",s);
		System.out.printf("%d\n",w);
		System.out.printf("%d\n",y);


		return 0;
	}
}

