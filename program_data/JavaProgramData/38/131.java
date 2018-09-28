package <missing>;

public class GlobalMembers
{
	public static double f(tangible.RefObject<Double> a, int n)
	{
		double sum = 0;
		double p;
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			sum += *(a.argValue + i);
		}
		p = sum / n;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += (*(a.argValue + i) - p) * (*(a.argValue + i) - p);
		}
		sum = sum / n;
		sum = Math.sqrt(sum);
		return sum;
	}
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int n;
		double[] a = new double[150];
		double s;
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
					a[j] = Double.parseDouble(tempVar3);
				}
			}
		tangible.RefObject<Double> tempRef_a = new tangible.RefObject<Double>(a);
			s = f(tempRef_a, n);
			a = tempRef_a.argValue;
			System.out.printf("%.5lf\n",s);
		}
	}

}

