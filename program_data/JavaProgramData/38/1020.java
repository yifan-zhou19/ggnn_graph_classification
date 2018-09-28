package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		double[] sz = new double[2000];
		int i;
		int j;
		double average;
		double sum = 0;
		double count = 0;
		double fangcha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			average = 0;
			fangcha = 0;
			count = 0;
			for (j = 0;j < m;j++)
			{
				sz[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + sz[j];
			}
			average = sum / m;
			for (j = 0;j < m;j++)
			{
				count = count + (sz[j] - average) * (sz[j] - average);
			}
			fangcha = count / m;
			fangcha = Math.sqrt(fangcha);
			System.out.printf("%.5lf\n",fangcha);
		}
		return 0;
	}
}

