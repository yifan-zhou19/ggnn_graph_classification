package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] fz = new double[10000];
		double[] fm = new double[10000];
		double s;
		fz[0] = 2;
		fm[0] = 1;
		s = fz[0] / fm[0];
		int n;
		int gs;
		int j;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				gs = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < gs;j++)
			{
				fz[j] = fz[j - 1] + fm[j - 1];
				fm[j] = fz[j - 1];
				s += (fz[j] / fm[j]);
			}
			System.out.printf("%.3lf\n",s);
			i++;
			s = fz[0] / fm[0];
		}
		return 0;
	}
}

