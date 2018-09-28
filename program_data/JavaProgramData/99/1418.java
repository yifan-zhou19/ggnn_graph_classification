package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] p = new int[101];
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
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] <= 18)
			{
				a++;
			}
			if (p[i] > 18 && p[i] < 36)
			{
				b++;
			}
			if (p[i] > 35 && p[i] < 61)
			{
				c++;
			}
			if (p[i] > 60)
			{
				d++;
			}
		}
		A = (double)a / n * 100;
		B = (double)b / n * 100;
		C = (double)c / n * 100;
		D = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("60??: %.2lf%%\n",D);
	}

}

