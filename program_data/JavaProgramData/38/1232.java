package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
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
				m = Integer.parseInt(tempVar2);
			}
			double[] a = new double[100];
			double s = 0;
			double ave;
			double s1 = 0;
			double s2 = 0;
			double[] p = a;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = tempVar3;
				}
				s = s + a[j];
			}
			ave = s / m;
			for (j = 0;j < m;j++)
			{
				s2 = s2 + (p[j] - ave) * (p[j] - ave);
			}
			s1 = Math.sqrt(s2 / m);
			System.out.printf("%.5lf\n",s1);
		}
		return 0;
	}
}

