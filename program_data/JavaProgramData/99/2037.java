package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[4];
		int a;
		double[] d = new double[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[0] = s[1] = s[2] = s[3] = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a >= 1 && a <= 18)
			{
				s[0]++;
			}
			if (a >= 19 && a <= 35)
			{
				s[1]++;
			}
			if (a >= 36 && a <= 60)
			{
				s[2]++;
			}
			if (a >= 61)
			{
				s[3]++;
			}
		}
		for (i = 0;i < 4;i++)
		{
			d[i] = (double)s[i] / n * 100;
		}
		System.out.printf("1-18: %.2lf%%\n",d[0]);
		System.out.printf("19-35: %.2lf%%\n",d[1]);
		System.out.printf("36-60: %.2lf%%\n",d[2]);
		System.out.printf("60??: %.2lf%%\n",d[3]);
		return 0;
	}

}

