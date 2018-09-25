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
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - 10000 * a) / 1000;
		c = (n - 10000 * a - 1000 * b) / 100;
		d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
		e = n - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a != 0)
		{
			System.out.printf("%d",e);
				  System.out.printf("%d",d);
				  System.out.printf("%d",c);
				  System.out.printf("%d",b);
				  System.out.printf("%d",a);
		}
			else if (b != 0)
			{
				System.out.printf("%d",e);
				  System.out.printf("%d",d);
				  System.out.printf("%d",c);
				  System.out.printf("%d",b);
			}
			else if (c != 0)
			{
				System.out.printf("%d",e);
				  System.out.printf("%d",d);
				  System.out.printf("%d",c);
			}
			else if (d != 0)
			{
				System.out.printf("%d",e);
				  System.out.printf("%d",d);
			}
			else
			{
				System.out.printf("%d",e);
			}
		return 0;
	}

}

