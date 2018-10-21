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
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] re = new double[100];
		double[] im = new double[100];
		double[] dlta = new double[100];
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
			dlta[i] = b[i] * b[i] - 4 * a[i] * c[i];
			if (dlta[i] == 0)
			{
				x1[i] = -b[i] / a[i] / 2;
				System.out.printf("x1=x2=%.5lf\n",x1[i]);
			}
			else if (dlta[i] < 0)
			{
				im[i] = Math.sqrt(0 - dlta[i]) / 2 / a[i];
				re[i] = -b[i] / a[i] / 2;
				if (re[i] == 0)
				{
					re[i] = 0;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",re[i],im[i],re[i],im[i]);
			}
			else
			{
				x1[i] = (-b[i] + Math.sqrt(dlta[i])) / 2 / a[i];
				x2[i] = (-b[i] - Math.sqrt(dlta[i])) / 2 / a[i];
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
		}
	}
}

