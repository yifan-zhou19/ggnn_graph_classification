package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b)
	{
		double z;
		z = Math.sqrt(a * a + b * b);
		return (z);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double max = 0;
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
		for (i = 0;i < n - 1;i++)
		{
			c[i] = 0;
			for (j = i + 1;j < n;j++)
			{
				if (f(a[j] - a[i], b[j] - b[i]) > c[i])
				{
					c[i] = f(a[j] - a[i], b[j] - b[i]);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%.4f",max);
	}





}

