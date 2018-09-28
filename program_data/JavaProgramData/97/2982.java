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
		int g;
		int h;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 100;
		b = n % 10;
		c = (n - a) / 100;
		d = a % 50;
		e = (a - d) / 50;
		f = ((a - e * 50) - (a - e * 50) % 20) / 20;
		g = (n - 100 * c - 50 * e-20 * f) % 10;
		h = (n - 100 * c - 50 * e-20 * f - g) / 10;
		i = (n - 100 * c - 50 * e-20 * f - 10 * h) % 5;
		j = (n - 100 * c - 50 * e-20 * f - 10 * h - i) / 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",c,e,f,h,j,i);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

