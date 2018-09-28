package <missing>;

public class GlobalMembers
{
	public static double aver(int n, double[] x)
	{
		int i;
		double sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += x[i];
		}
		return sum / n;
	}
	public static double s(int n, double[] x)
	{
		int i;
		double avn = aver(n, x);
		double sum = 0;
		double num;
		for (i = 0;i < n;i++)
		{
			sum += Math.pow((x[i] - avn),2);
		}
		num = Math.sqrt(sum / n);
		return num;
	}

	public static void Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[100];
		double num;
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
			}
			num = s(n, x);
			System.out.printf("%.5lf\n",num);
		}
	}
}

