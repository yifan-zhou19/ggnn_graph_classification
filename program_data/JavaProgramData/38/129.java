package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double[] a = new double[1100];
		double sum = 0;
		double ave;
		double s = 0;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			ave = sum / m;
			for (j = 1;j <= m;j++)
			{
				s = s + (a[j] - ave) * (a[j] - ave);
			}
			s = s / m;
			x = Math.sqrt(s);
			System.out.printf("%.5f\n",x);
			for (j = 1;j <= m;j++)
			{
				a[j] = 0;
			}
			sum = 0;
			s = 0;
		}
	}
}

