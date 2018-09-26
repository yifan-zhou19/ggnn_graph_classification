package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int n;
		double[] x = new double[100];
		double s;
		double a = 0;
		double b = 0;
		double[] c = new double[100];
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			a = 0;
			b = 0;
			d = 0;
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
				b = (double)x[j] / n;
				a += b;
			}
			for (j = 0;j < n;j++)
			{
				c[j] = x[j] - a;
				d = d + Math.pow(c[j],2);
				s = (double)Math.sqrt(d / n);
			}
			System.out.printf("%.5lf\n",s);
		}
	}
}

