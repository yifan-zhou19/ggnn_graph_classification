package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int n1;
		int i;
		int j;
		double[] a = new double[1000];
		double sum = 0.0;
		double tmp = 0.0;
		double eve;
		double out;
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
				n1 = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum += a[j];
			}
			eve = (double)sum / n1;
			for (j = 0;j < n1;j++)
			{
				tmp += (a[j] - eve) * (a[j] - eve);
			}
			out = Math.sqrt(tmp / n1);
			System.out.printf("%.5lf\n",out);
			out = 0.0;
			tmp = 0.0;
			eve = 0.0;
			sum = 0.0;
		}
	}
}

