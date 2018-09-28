package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		if (n / 100 > 0)
		{
			a = n / 100;
		}
		if ((n / 50 - a * 2) > 0)
		{
			b = n / 50 - a * 2;
		}
		if (((n - b * 50) / 20 - a * 5) > 0)
		{
			c = (n - b * 50) / 20 - a * 5;
		}
		if ((n / 10 - a * 10 - b * 5 - c * 2) > 0)
		{
			d = n / 10 - a * 10 - b * 5 - c * 2;
		}
		if ((n / 5 - 20 * a - 10 * b - c * 4 - d * 2) > 0)
		{
			e = n / 5 - 20 * a - 10 * b - c * 4 - d * 2;
		}
		if ((n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e) > 0)
		{
			f = n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
		}
		 System.out.printf("%d\n",a);
		  System.out.printf("%d\n",b);
		   System.out.printf("%d\n",c);
			 System.out.printf("%d\n",d);
			   System.out.printf("%d\n",e);
				  System.out.printf("%d\n",f);



	return 0;
	}
}

