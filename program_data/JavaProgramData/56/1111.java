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
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		e = n % 10;
		d = ((n - e) % 100) / 10;
		c = ((n - e-10 * d) % 1000) / 100;
		b = ((n - e-10 * d - 100 * c) % 10000) / 1000;
		a = (n - e-10 * d - 100 * c - 1000 * b) / 10000;
		if (a == 0 && b == 0 && c == 0 && d != 0 && e != 0)
		{
			k = 10 * e + d;
			System.out.printf("%d",k);
		}
		if (a == 0 && b == 0 && c != 0 && d != 0 && e != 0)
		{
			k = 100 * e+10 * d + c;
			System.out.printf("%d",k);
		}
		if (a == 0 && b != 0 && c != 0 && d != 0 && e != 0)
		{
			k = 1000 * e+100 * d + 10 * c + b;
			System.out.printf("%d",k);
		}
		if (a != 0 && b != 0 && c != 0 && d != 0 && e != 0)
		{
			k = 10000 * e+1000 * d + 100 * c + 10 * b + a;
			System.out.printf("%d",k);
		}
		return 0;
	}




}

