package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] sz = new double[100];
			double sum = 0;
			double a;
			for (int r = 0;r < n;r++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[r] = Double.parseDouble(tempVar3);
				}
				sum += sz[r];
			}
			a = sum / n;
			sum = 0;
			for (int b = 0;b < n;b++)
			{
				sz[b] = (sz[b] - a) * (sz[b] - a);
				sum += sz[b];
			}
			double result;
			result = Math.pow(sum / n,0.5);
			System.out.printf("%.5lf\n",result);
		}
		return 0;
	}
}

