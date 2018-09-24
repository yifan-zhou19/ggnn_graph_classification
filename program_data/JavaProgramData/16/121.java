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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		if (n > 999)
		{
			a = n / 1000;
		b = n - a * 1000;
		c = b / 100;
		d = b - c * 100;
		e = d / 10;
		f = d - e * 10;

	 System.out.printf("%d",f);
	  System.out.printf("%d",e);
	   System.out.printf("%d",c);
	   System.out.printf("%d",a);
		}

		if ((n<1000 & n>99) != 0)
		{
			a = n / 100;
		b = n - a * 100;
		c = b / 10;
		d = b - c * 10;

	  System.out.printf("%d",d);
	   System.out.printf("%d",c);
	   System.out.printf("%d",a);
		}

		if ((n<100 & n>9) != 0)
		{
			a = n / 10;
		b = n - a * 10;

	System.out.printf("%d",b);
	   System.out.printf("%d",a);
		}

		if (n < 10)
		{
			a = n / 10;

	System.out.printf("%d",n);
		}

		return 0;
	}

}

