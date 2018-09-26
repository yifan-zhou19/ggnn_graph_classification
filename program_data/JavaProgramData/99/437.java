package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] y = new int[101];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double A;
		double B;
		double C;
		double D;
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
				y[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] <= 18)
			{
				a++;
			}
			if (y[i] > 18 && y[i] <= 35)
			{
				b++;
			}
			if (y[i] > 35 && y[i] <= 60)
			{
				c++;
			}
			if (y[i] > 60)
			{
				d++;
			}
		}
		A = (double)a / (double)n * 100;
		B = (double)b / (double)n * 100;
		C = (double)c / (double)n * 100;
		D = (double)d / (double)n * 100;
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("60??: %.2lf%%\n",D);
		return 0;
	}

}

