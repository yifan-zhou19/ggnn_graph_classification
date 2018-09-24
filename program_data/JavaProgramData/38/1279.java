package <missing>;

public class GlobalMembers
{
	// cg.cpp : Defines the entry point for the console application.
	//

	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[] sz = new double[1000];
		double sum = 0;
		double a;
		double b;
		double fj = 0;
		double c;
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
					sz[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				sum += sz[j];
			}
			a = sum / n * 1.0;
			for (j = 0;j < n;j++)
			{
				b = (sz[j] - a) * (sz[j] - a);
				fj += b;
			}
			c = Math.sqrt(fj / n);
		System.out.printf("%.5f\n",c);
		sum = 0;
		fj = 0;
		c = 0;
		a = 0;
		b = 0;
		}
		return 0;
	}


}

