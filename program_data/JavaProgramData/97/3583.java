package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		a = z / 100;
		if (z - 100 * a > 0)
		{
					 b = (z - 100 * a) / 50;
		}
		if (z - 100 * a - 50 * b > 0)
		{
						  c = (z - 100 * a - 50 * b) / 20;
		}
		if (z - 100 * a - 50 * b - 20 * c > 0)
		{
							   d = (z - 100 * a - 50 * b - 20 * c) / 10;
		}
		if (z - 100 * a - 50 * b - 20 * c - 10 * d > 0)
		{
								  e = (z - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
		}
		if (z - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e > 0)
		{
										f = z - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
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

