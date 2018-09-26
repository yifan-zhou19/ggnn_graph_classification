package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double[] x = new double[100];
		double s = 0;
		double r = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
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
					x[j] = Double.parseDouble(tempVar3);
				}
				s += x[j] / (double)n;
			}

			for (j = 0;j < n;j++)
			{
				r += (x[j] - s) * (x[j] - s) / (double)n;
			}
			System.out.printf("%.5lf\n",Math.sqrt(r));
			s = 0;
			r = 0;
		}
		return 0;
	}





}

