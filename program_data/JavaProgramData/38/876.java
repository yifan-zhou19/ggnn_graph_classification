package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double a = 0.0;
		double c = 0.0;
		double d;
		double b;
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
			}
			for (j = 0;j < n;j++)
			{
				a = a + x[j];
			}
			b = 1.0 * a / n;
			for (j = 0;j < n;j++)
			{
				c = Math.pow(x[j] - b,2) + c;
			}
			d = Math.sqrt(1.0 * c / n);
			System.out.printf("%.5lf\n",d);
			a = 0.0;
			c = 0.0;
		}
		return 0;
	}




}

