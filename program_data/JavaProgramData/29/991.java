package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] geshu = new int[1000];
		for (int k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(geshu[k]) = Integer.parseInt(tempVar2);
			}
		}
		double[] sz = new double[1000];
		double sum = 0;
		double a = 1;
		double b = 2;
		double e;
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < geshu[i];j++)
			{
				sz[j] = 1.0 * b / a;
				sum += sz[j];
				e = b;
				b = a + b;
				a = e;

			}
				System.out.printf("%.3lf\n",sum);
				sum = 0;
				b = 2;
				a = 1;
		}

	}
}

