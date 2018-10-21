package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[N];
		double s = 0.0;
		double sum = 0;
		double[] a = new double[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			for (j = 0;j < n;j++)
			{
				s += (x[j] - sum / n) * (x[j] - sum / n);
			}
			a[i] = Math.sqrt(s / n);
			s = 0.0;
			sum = 0.0;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",a[i]);
		}

	}

}

