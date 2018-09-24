package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int t = 0;
		double[] a = new double[300];
		double[] b = new double[300];
		double sum = 0.0;
		double ave;
		double max = 0.0;
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
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		ave = sum / (double)n;
		for (i = 0;i < n;i++)
		{
			if (ave > a[i])
			{
				b[i] = ave - a[i];
			}
			else
			{
				b[i] = a[i] - ave;
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				if (t == 0)
				{
					System.out.printf("%.0lf",a[i]);
					t++;
				}
				else
				{
					System.out.printf(",%.0lf",a[i]);
				}
			}
		}
	}



}

