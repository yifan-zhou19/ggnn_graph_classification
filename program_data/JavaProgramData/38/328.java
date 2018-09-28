package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int i;
		int j;
		double[] x = new double[1000];
		double c;
		double d;
		double e;
		double f;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			c = 0.0;
			d = 0.0;
			e = 0.0;
			f = 0.0;
			s = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				c = c + x[j];
			}
			   d = c / b;
			for (j = 0;j < b;j++)
			{
				e = e + (x[j] - d) * (x[j] - d);
			}
			f = e / b;
			s = Math.sqrt(f);
			System.out.printf("%.5lf\n",s);

		}

	}
}

