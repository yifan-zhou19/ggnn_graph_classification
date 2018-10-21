package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		double[] b = new double[100];
		double c;
		double d;
		double pj;
		double s;
		c = 0;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (int k = 0;k < a;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[k] = Double.parseDouble(tempVar3);
				}
				d = d + b[k];
			}
			pj = d * 1.0 / (a * 1.0);
			for (int z = 0;z < a;z++)
			{
				c += (b[z] - pj) * (b[z] - pj);
			}
			s = Math.sqrt(c * 1.0 / (a * 1.0));
			System.out.printf("%.5lf\n",s);
			d = 0;
			c = 0;
		}
		return 0;
	}
}

