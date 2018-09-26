package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double x1;
		double x2;
		double f;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			c[i] = Double.parseDouble(tempVar4);
		}
		}
		for (i = 0;i < n;i++)
		{
			f = -(b[i] / 2 / a[i]);
			double j = Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i]) / (2 * a[i]);
			if (b[i] != 0)
			{
				if (b[i] * b[i] - 4 * a[i] * c[i] > 0)
				{
					x1 = f + j;
					x2 = f - j;
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}
				if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
				{
					k = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",f,k,f,k);
				}
				if (b[i] * b[i] - 4 * a[i] * c[i] == 0)
				{
					x1 = f;
					x2 = f;
					System.out.printf("x1=x2=%.5lf\n",f,f);
				}
			}
			if (b[i] == 0)
			{
				if (b[i] * b[i] - 4 * a[i] * c[i] > 0)
				{
					x1 = j;
					x2 = -j;
					System.out.printf("x1=0.00000+%.5lf;x2=0.00000+%.5lf\n",x1,x2);
				}
				if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
				{
					k = Math.sqrt(4 * a[i] * c[i]) / (2 * a[i]);
					System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",k,k);
				}
					if (-4 * a[i] * c[i] == 0)
					{
					x1 = f;
					x2 = f;
					System.out.print("x1=x2=0.00000\n");
					}
			}
		}
	}

}

