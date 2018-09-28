package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a++;
			}
			if (sz[i] >= 19 && sz[i] <= 35)
			{
				b++;
			}
			if (sz[i] >= 36 && sz[i] <= 60)
			{
				c++;
			}

			if (sz[i] >= 61)
			{
				d++;
			}
		}
	double a1;
	double b1;
	double c1;
	double d1;
			  a1 = (double)100 * a / (a + b + c + d);
			  b1 = (double)100 * b / (a + b + c + d);
			  c1 = (double)100 * c / (a + b + c + d);
			  d1 = (double)100 * d / (a + b + c + d);





	System.out.printf("1-18: %.2lf%%\n",a1);
	System.out.printf("19-35: %.2lf%%\n",b1);
	System.out.printf("36-60: %.2lf%%\n",c1);
	System.out.printf("60??: %.2lf%%\n",d1);
	return 0;

	}
}

