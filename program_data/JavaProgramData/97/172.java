package <missing>;

public class GlobalMembers
{
	public static void Main()
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
			b = (n - a * 100) / 50;
			c = (n - a * 100 - b * 50) / 20;
			d = (n - a * 100 - b * 50 - 20 * c) / 10;
			e = (n - a * 100 - b * 50 - 20 * c - d * 10) / 5;
			f = (n - a * 100 - b * 50 - 20 * c - d * 10 - 5 * e) / 1;
		if (n = a + b + c + d + e + f)
		{
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		}
	}
}

