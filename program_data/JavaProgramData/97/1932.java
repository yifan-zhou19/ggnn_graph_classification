package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = (int)Math.ceil(x / 100);
		b = (int)Math.ceil((x - a * 100) / 50);
		c = (int)Math.ceil((x - a * 100 - b * 50) / 20);
		d = (int)Math.ceil((x - a * 100 - b * 50 - c * 20) / 10);
		e = (int)Math.ceil((x - a * 100 - b * 50 - c * 20 - d * 10) / 5);
		f = (int)Math.ceil((x - a * 100 - b * 50 - c * 20 - d * 10 - e * 5) / 1);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

