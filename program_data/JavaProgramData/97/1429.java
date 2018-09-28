package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int n;
		int[] sz = new int[101];
		int b = 0;
		int c = 0;
		int d = 0;
		int zong = 0;
		int e = 0;
		int f = 0;
		int g;
		double aa;
		double bb;
		double cc;
		double dd;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		g = n - a * 100;
		b = g / 50;
		g = g - b * 50;
		c = g / 20;
		g = g - c * 20;
		d = g / 10;
		g = g - d * 10;
		e = g / 5;
		g = g - e * 5;
		f = g;
		System.out.printf("%d\n",a);
		 System.out.printf("%d\n",b);
		  System.out.printf("%d\n",c);
		   System.out.printf("%d\n",d);
			System.out.printf("%d\n",e);
			 System.out.printf("%d\n",f);
										  return 0;
	}
}

