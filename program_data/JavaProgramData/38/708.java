package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int n1;
		int j;
		double s = 0;
		double sum = 0;
		double av;
		double[] fc = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[100];
		for (i = 0;i < n;i++)
		{
			sum = 0;
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n1 = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				sum += x[j];
			}
			av = sum / n1;
			for (j = 0;j < n1;j++)
			{
				s += (x[j] - av) * (x[j] - av);
			}
			fc[i] = Math.sqrt(1.0 * s / n1);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",fc[i]);
		}
		return 0;
	}

}

