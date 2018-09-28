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
		double A;
		double B;
		double C;
		double D;
		int[] z = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
			if (z[i] <= 18)
			{
				a++;
			}
			else if (z[i] >= 19 && z[i] <= 35)
			{
				b++;
			}
			else if (z[i] >= 36 && z[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		A = (double)a / (double)n * 100.00;
		B = (double)b / (double)n * 100.00;
		C = (double)c / (double)n * 100.00;
		D = (double)d / (double)n * 100.00;
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("60??: %.2lf%%\n",D);
		return 0;
	}

}

