package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int z;
		double[] x = new double[100];
		double[] m1 = new double[100];
		double a = 0;
		double e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (z = 0;z < k;z++)
		{
			e = 0;
			a = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				a += x[i];
			}
			a = a / n;
			for (i = 0;i < n;i++)
			{
				e += (x[i] - a) * (x[i] - a);
			}
			e = e / n;
			m1[z] = Math.pow(e,0.5);

		}
		for (z = 0;z < k;z++)
		{
			System.out.printf("%.5lf\n",m1[z]);
		}


		return 0;
	}
}

