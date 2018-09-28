package <missing>;

public class GlobalMembers
{
	///#include <math.h>




	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;

		a = (int)n / 100;
		b = (int)(n - 100 * a) / 50;
		c = (int)(n - 100 * a - 50 * b) / 20;
		d = (int)(n - 100 * a - 50 * b - 20 * c) / 10;
		e = (int)(n - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
		f = (int)(n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e);

		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);




		return 0;
	}


}

