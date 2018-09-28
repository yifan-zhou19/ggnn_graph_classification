package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[] a = new double[10];
		double[] b = new double[10];
		double[] c = new double[50];
		double sum;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < 50;i++)
		{
				c[i] = 0;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				c[k] = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]);
				k++;
			}
		}

		sum = c[0];
		for (i = 0;i < 50;i++)
		{
				if (sum < c[i])
				{
					sum = c[i];
				}
		}
		System.out.printf("%.4f\n",Math.sqrt(sum));
	}
}

