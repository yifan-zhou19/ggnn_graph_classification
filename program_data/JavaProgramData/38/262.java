package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int b;
		double[] a = new double[1000];
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			double c = 0;
			double p = 0;
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
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < b;j++)
			{
				c = c + a[j];

			}
			c = c / b;
			for (j = 0;j < b;j++)
			{
				p = p + (a[j] - c) * (a[j] - c);

			}
			s = Math.sqrt(p / b);
				System.out.printf("%.5lf\n",s);
		}
		return 0;
	}


}

