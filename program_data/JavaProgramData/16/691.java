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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 1000;
		b = n / 100 - 10 * a;
		c = n / 10 - 10 * b - 100 * a;
		d = n - 10 * c - 100 * b - 1000 * a;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.printf("%d",d);
		}
		if (a == 0 && b == 0 && c != 0)
		{
			System.out.printf("%d",d);
			System.out.printf("%d",c);
		}
		if (a == 0 && b != 0)
		{
			System.out.printf("%d",d);
			System.out.printf("%d",c);
			System.out.printf("%d",b);
		}
		if (a != 0)
		{
			System.out.printf("%d",d);
			System.out.printf("%d",c);
			System.out.printf("%d",b);
			System.out.printf("%d",a);
		}
		return 0;
	}
}

