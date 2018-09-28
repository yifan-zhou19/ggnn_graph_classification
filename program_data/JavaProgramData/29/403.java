package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double[] num = new double[100];
		int m;
		int i;
		int j;
		double p;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			sum = 0;
			 p = 1;
			for (j = 0;j < num[i];j++)
			{
			  p = (double)(p + 1) / p;
			  sum += p;

			}
			System.out.printf("%.3lf\n",sum);
		}

	}
}

