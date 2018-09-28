package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		double[] a = new double[1001];
		double mean;
		double sum;
		double result;
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
			for (sum = 0,j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			mean = sum / m;
			a[m] = -1;
			for (sum = 0,j = 0;j < m;j++)
			{
				sum = sum + (a[j] - mean) * (a[j] - mean);
			}
			result = sum / m;
			result = Math.sqrt(result);
			System.out.printf("%.5lf\n",result);
		}
	}

}

