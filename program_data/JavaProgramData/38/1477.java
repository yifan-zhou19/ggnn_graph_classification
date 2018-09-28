package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			double[] x = new double[1005];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double s = 0;
			double average = 0;
			for (int i = 0; i < n; ++i)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x + i = tempVar3;
				}
				average += x[i];
			}
			average /= n;
			for (int i = 0; i < n; ++i)
			{
				s += (x[i] - average) * (x[i] - average);
			}
			System.out.printf("%.5lf\n", Math.sqrt(s / n));
		}
		return 0;
	}
}

