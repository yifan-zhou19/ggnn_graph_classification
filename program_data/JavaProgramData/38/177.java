package <missing>;

public class GlobalMembers
{
	public static void f(double[] num, int n, double sum)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			num[i] = (num[i] - sum) * (num[i] - sum);
		}
	}
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] num = new double[100];
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Double.parseDouble(tempVar3);
				}
				sum += num[j];
			}
			sum = sum / n;
			f(num, n, sum);
			sum = 0;
			for (j = 0;j < n;j++)
			{
				sum += num[j];
			}
			sum = sum / n;
			sum = Math.sqrt(sum);
			System.out.printf("%.5lf\n",sum);
		}
		return 0;
	}

}

