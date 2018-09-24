package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		double[] a = new double[100];
		double c = 0;
		double s = 0;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			double sum = 0;
			double ave = 0;
			double total = 0;
			double pf = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Double.parseDouble(tempVar2);
			}
			for (i = 0;i < n;i++)
			{

				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Double.parseDouble(tempVar3);
				}
				sum += a[i];
				ave = sum / n;
			}
			for (i = 0;i < n;i++)
			{

				pf = (a[i] - ave) * (a[i] - ave);
				total += pf;
			}
			c = total / n;
			s = Math.sqrt(c);
			System.out.printf("%.5lf\n",s);

		}
		return 0;
	}

}

