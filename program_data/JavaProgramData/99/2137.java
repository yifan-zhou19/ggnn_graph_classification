package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[100];
		double s1 = 0;
		double s2 = 0;
		double s3 = 0;
		double s4 = 0;
		double s5 = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			if (a[i] <= 18)
			{
				s1++;
			}
			if (a[i] > 18 && a[i] <= 35)
			{
				s2++;
			}
			if (a[i] > 35 && a[i] <= 60)
			{
				s3++;
			}
			if (a[i] > 60)
			{
				s4++;
			}
			s5++;
		}
		System.out.printf("1-18: %.2lf%%\n",s1 / s5 * 100);
		System.out.printf("19-35: %.2lf%%\n",s2 / s5 * 100);
		System.out.printf("36-60: %.2lf%%\n",s3 / s5 * 100);
		System.out.printf("60??: %.2lf%%\n",s4 / s5 * 100);
		return 0;
	}
}

