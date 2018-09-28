package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int s = 0;
		int m = 0;
		double[] an = new double[100];
		double sum;
		double jz;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = jz = 0.0;
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
					an[j] = Double.parseDouble(tempVar3);
				}
				sum += an[j];
			}
			sum /= m;
			for (j = 0;j < m;j++)
			{
				jz += (an[j] - sum) * (an[j] - sum);
			}
			jz = jz / m;
			System.out.printf("%.5lf\n",Math.sqrt(jz));
		}
		return 0;
	}
}

