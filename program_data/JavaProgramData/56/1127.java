package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int e;
		a = n % 10;
		b = (n - a) % 100 / 10;
		c = (n - a - b * 10) % 1000 / 100;
		d = (n - a - b * 10 - c * 100) % 10000 / 1000;
		e = n / 10000;
		if (e != 0)
		{
			System.out.printf("%d",e + d * 10 + c * 100 + b * 1000 + a * 10000);
		}
		if (e == 0 && d != 0)
		{
			System.out.printf("%d",d + c * 10 + b * 100 + a * 1000);
		}
		if (e == 0 && d == 0 && c != 0)
		{
			System.out.printf("%d",c + b * 10 + a * 100);
		}
		if (e == 0 && d == 0 && c == 0 && b != 0)
		{
			System.out.printf("%d",b + a * 10);
		}
		if (e == 0 && d == 9 && c == 0 && b == 0)
		{
			System.out.printf("%d",a);
		}
	}


}

