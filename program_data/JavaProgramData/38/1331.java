package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		double[] x = new double[100];
		double s;
		double a;
		double sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 0;j < n;j++)
		{
			s = 0;
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
			}
			for (i = 0;i < m;i++)
			{
				sum += x[i];
			}
			a = sum / m;

			for (i = 0;i < m;i++)
			{
				s += (x[i] - a) * (x[i] - a);
			}
			s = s / m;
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);

		}

	}
}

