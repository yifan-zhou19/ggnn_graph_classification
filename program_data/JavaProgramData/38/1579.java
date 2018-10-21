package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int m = 0;
		int j = 0;
		double[] a = new double[1000];
		double sum = 0;
		double biaocha = 0;
		double s = 0;
		a[1000] = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 0;i < n;i++)
		{
	sum = 0;
	biaocha = 0;
	s = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < m;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[j] = Double.parseDouble(tempVar3);
	}
	sum += (double)a[j];
	}
	for (j = 0;j < m;j++)
	{
		biaocha += (double)(a[j] - sum / m) * (a[j] - sum / m);
	}

	s = (double)Math.sqrt(biaocha / m);
	System.out.printf("%.5f\n", s);
		}

		return 0;
	}


}

