package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[10];
		double[] b = new double[10];
		double c;
		double max = 0.0;
		int n;
		int i = 0;
		int j = 0;
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
			for (j = i + 1;j < n;j++)
			{
				c = Math.sqrt(Math.pow(a[j] - a[i],2) + Math.pow(b[i] - b[j],2));
				if (c > max)
				{
					max = c;
				}
			}
		}
		System.out.printf("%.4lf",max);
		return 0;
	}
}

