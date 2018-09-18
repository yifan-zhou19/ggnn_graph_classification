package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int n;
		double p;
		double[] b = new double[300];
		double max;
		double[] a = new double[300];
		double sum = 0;
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
			sum = sum + a[i];
		}
		p = sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= p)
			{
				b[i] = a[i] - p;
			}
			else
			{
				b[i] = p - a[i];
			}
		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];

			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				System.out.printf("%.0lf",a[i]);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			if (b[j] == max)
			{
				System.out.printf(",%.0lf",a[j]);
			}
		}
		System.out.print("\n");
	}

}

