package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int ws;
		int es;
		int s;
		int w;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n / 100;
		ws = (n % 100) / 50;
		es = (n % 50) / 20;
		s = (n - 100 * b - 50 * ws - 20 * es) / 10;
		w = (n % 10) / 5;
		y = n % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,ws,es,s,w,y);
		return 0;
	}

}

