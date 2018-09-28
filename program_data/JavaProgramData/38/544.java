package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] x = new double[1000];
		double[] r = new double[1000];
		for (i = 0;i < k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double sum = 0.00;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			double ave = 0.00;
			double total = 0.00;
			ave += sum / n;
			for (j = 0;j < n;j++)
			{
				r[j] = (x[j] - ave) * (x[j] - ave);
				total += r[j];
			}
			total /= n;
			double o = 0.00;
			o = Math.sqrt(total);
			System.out.printf("%.5lf\n", o);
		}
		return 0;
	}
}

