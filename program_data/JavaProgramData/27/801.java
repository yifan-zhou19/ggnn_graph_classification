package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double p = 0.00;
		double q = 0.00;
		double m = 0.00;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[k] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[k] = Double.parseDouble(tempVar4);
			}
		}
		for (j = 0;j < n;j++)
		{
			m = b[j] * b[j] - 4 * a[j] * c[j];
			p = -b[j] / (2 * a[j]);
		   if (p == -0)
		   {
			p = 0.00000;
		   }
			if (m < 0)
			{
			q = Math.sqrt(-m) / (2 * a[j]);
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5f-%.5fi\n",p,q,p,q);
			}
			if (m == 0)
			{
			System.out.printf("x1=x2=%.5f\n",p);
			}
			if (m > 0)
			{
				q = Math.sqrt(m) / (2 * a[j]);
			 System.out.printf("x1=%.5f;x2=%.5f\n",p + q,p - q);
			}
		}
		return 0;
	}


}

