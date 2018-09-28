package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum;
		int[] x = new int[100];
		int a;
		int b;
		int c;
		int d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		double a1;
		double b1;
		double c1;
		double d1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			if (x[i] <= 18)
			{
				a = a + 1;
			}
			if (x[i] >= 19 && x[i] <= 35)
			{
				b = b + 1;
			}
			if (x[i] >= 36 && x[i] <= 60)
			{
				c = c + 1;
			}
			if (x[i] > 60)
			{
				d = d + 1;
			}
		}

		sum = a + b + c + d;
		a1 = 100 * (double)a / sum;
		b1 = 100 * (double)b / sum;
		c1 = 100 * (double)c / sum;
		d1 = 100 * (double)d / sum;

		System.out.printf("1-18: %.2lf%%\n",a1);
		System.out.printf("19-35: %.2lf%%\n",b1);
		System.out.printf("36-60: %.2lf%%\n",c1);
		System.out.printf("60??: %.2lf%%\n",d1);


	}
}

