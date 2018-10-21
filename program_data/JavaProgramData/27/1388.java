package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		double x1;
		double x2;
		double m;
		double p;
		double q;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
				for (i = 0;i < n;i++)
				{
			m = b[i] * b[i] - 4 * a[i] * c[i];
			if (m > 0)
			{
				x1 = (-b[i] + Math.sqrt(m)) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(m)) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
				else if (m == 0)
				{
				x1 = -b[i] / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",x1);
				}
					else if (m < 0)
					{
					p = -b[i] / (2 * a[i]);
					q = Math.sqrt(-m) / (2 * a[i]);
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
					}
				}
		return 0;
	}

}

