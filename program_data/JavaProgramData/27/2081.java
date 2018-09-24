package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] u = new double[100];
		double[] s = new double[100];
		double[] delta = new double[100];
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			delta[i] = Math.pow(b[i],2) - 4 * a[i] * c[i];
			if (delta[i] > 0)
			{
				x1[i] = ((0 - b[i]) + Math.sqrt(delta[i])) / (2 * a[i]);
				x2[i] = ((0 - b[i]) - Math.sqrt(delta[i])) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
			else if (delta[i] == 0)
			{
				x1[i] = (0 - b[i]) / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",x1[i]);
			}
			else if (delta[i] < 0)
			{
				u[i] = (0 - b[i]) / (2 * a[i]);
				s[i] = Math.sqrt(0 - delta[i]) / (2 * a[i]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",u[i],s[i],u[i],s[i]);
			}
		}
		return 0;
	}
}

