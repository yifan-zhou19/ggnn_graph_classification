package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double s;
		double t;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[100];
		for (i = 0;i < 3 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		for (k = 0;k < 3 * n;k++)
		{
			if (k % 3 == 0)
			{
				m = a[k + 1] * a[k + 1] - 4 * a[k] * a[k + 2];
				if (m > 0)
				{
				   s = (-a[k + 1] + Math.sqrt(m)) / (2 * a[k]);
				   t = (-a[k + 1] - Math.sqrt(m)) / (2 * a[k]);
				   System.out.printf("x1=%.5lf;x2=%.5lf\n",s,t);
				}
				if (m == 0)
				{
					s = (-a[k + 1]) / (2 * a[k]);
					System.out.printf("x1=x2=%.5lf\n",s);
				}
				if (m < 0)
				{
					s = (-a[k + 1]) / (2 * a[k]);
					t = (Math.sqrt(-m)) / (2 * a[k]);
					if (s == 0)
					{
						System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",t,t);
					}
					else
					{
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",s,t,s,t);
					}
				}
			}
			else
			{
				continue;
			}
		}
		return 0;
	}


}

