package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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
		a = (int)(n / 100);
		n -= a * 100;
		b = (int)(n / 50);
		n -= b * 50;
		c = (int)(n / 20);
		n -= c * 20;
		d = (int)(n / 10);
		n -= d * 10;
		e = (int)(n / 5);
		n -= e * 5;
		f = n;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a, b, c, d, e, f);
	}
}

