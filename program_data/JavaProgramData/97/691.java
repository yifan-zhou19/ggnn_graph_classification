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
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 100);
		x = n - 100 * a;
		if (x >= 50)
		{
			b = 1;
			x -= 50;
		}
		else
		{
			b = 0;
		}
		c = (int)(x / 20);
		x -= c * 20;
		d = (int)(x / 10);
		x -= d * 10;
		if (x >= 5)
		{
			e = 1;
			x -= 5;
		}
		else
		{
			e = 0;
		}
		f = x;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);
		return 0;
	}
}

