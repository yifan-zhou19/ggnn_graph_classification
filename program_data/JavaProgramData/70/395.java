package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		double m = 0;
		double k = 0;
		double[] x = new double[50];
		double[] y = new double[50];
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (j >= n)
				{
					break;
				}
				m = Math.pow((x[i] - x[j]),2) + Math.pow((y[i] - y[j]),2);
				if (m > k)
				{
					k = m;
				}
			}
		}
		System.out.printf("%.4f\n",Math.sqrt(k));
		return 0;
	}

}

