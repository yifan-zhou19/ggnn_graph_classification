package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[100];
		int i;
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		double s;
		double r1;
		double r2;
		double r3;
		double r4;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] >= 1 && a[i] <= 18)
			{
				num1++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				num2++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				num3++;
			}
			if (a[i] > 60)
			{
				num4++;
			}
		}
		s = num1 + num2 + num3 + num4;
		r1 = num1 * 100 / s;
		r2 = num2 * 100 / s;
		r3 = num3 * 100 / s;
		r4 = num4 * 100 / s;
		System.out.printf("1-18: %.2lf%%\n",r1);
		System.out.printf("19-35: %.2lf%%\n",r2);
		System.out.printf("36-60: %.2lf%%\n",r3);
		System.out.printf("60??: %.2lf%%",r4);






	}
}

