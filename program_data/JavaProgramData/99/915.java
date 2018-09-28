package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum;
		int young = 0;
		int mid = 0;
		int old = 0;
		int oldest = 0;
		double ap;
		double mp;
		double op;
		double oep;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		int[] age = new int[101];
		for (i = 1;i <= sum;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(age[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= sum;i++)
		{
			if ((age[i]) >= 1 && (age[i]) <= 18)
			{
				young++;
			}
			if ((age[i]) >= 19 && (age[i]) <= 35)
			{
				mid++;
			}
			if ((age[i]) >= 36 && (age[i]) <= 60)
			{
				old++;
			}
			if ((age[i]) >= 61)
			{
				oldest++;
			};
		}
		ap = 1.0 * young / sum * 100;
		mp = 1.0 * mid / sum * 100;
		op = 1.0 * old / sum * 100;
		oep = 100.0 - ap - mp - op;
		System.out.printf("1-18: %.2lf",ap);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",mp);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",op);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",oep);
		System.out.print("%%\n");


	return 0;
	}
}

