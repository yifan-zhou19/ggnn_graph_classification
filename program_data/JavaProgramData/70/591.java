package <missing>;

public class GlobalMembers
{
	public static double dis(double a,double b,double c,double d)
	{
		double k;
		k = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
		return (k);
	}
	public static void Main()
	{
		int n;
		int j;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double max;
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
		max = dis(a[0], b[0], a[1], b[1]);
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (dis(a[i], b[i], a[j], b[j]) > max)
				{
					max = dis(a[i], b[i], a[j], b[j]);
				}
			}
		}
		System.out.printf("%.4f\n",max);
	}




}

