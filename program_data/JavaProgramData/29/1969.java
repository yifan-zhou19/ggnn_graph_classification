package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		double[] a = new double[1000];
		double[] b = new double[1000];
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a[0] = 2;
			a[1] = 3;
			b[0] = 1;
			b[1] = 2;
			for (i = 0;i < n;i++)
			{
				a[i + 2] = a[i] + a[i + 1];
				b[i + 2] = b[i] + b[i + 1];
			}
			for (i = 0;i < n;i++)
			{
				s = s + a[i] / b[i];
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}

}

