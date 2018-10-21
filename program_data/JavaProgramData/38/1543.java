package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		double[] a = new double[1000];
		double ave1;
		double ave2;
		double sum1;
		double sum2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < (2 * n);i = i + 2)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum1 = 0;
			sum2 = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum1 += a[j];
			}
			ave1 = sum1 / m;
			for (j = 0;j < m;j++)
			{
				sum2 += Math.pow((a[j] - ave1),2);
			}
			ave2 = Math.sqrt(sum2 / m);
			System.out.printf("%.5lf\n",ave2);
		}
	}

}

