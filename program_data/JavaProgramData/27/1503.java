package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int r;
		double a;
		double b;
		double c;
		double[] x = new double[2000];
		double[] x1 = new double[2000];
		double[] x2 = new double[2000];
		double[] delta = new double[2000];
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			delta[i] = b * b - 4 * a * c;
			if (delta[i] > 0)
			{
				x1[i] = (-b + Math.sqrt(delta[i])) / (2 * a);
				x2[i] = (-b - Math.sqrt(delta[i])) / (2 * a);
			}
			else if (delta[i] == 0)
			{
				x1[i] = x2[i] = (-b) / (2 * a);
			}
			else if (delta[i] < 0)
			{
				x[i] = -b / (2 * a);
				x1[i] = Math.sqrt(-delta[i]) / (2 * a);
				x2[i] = Math.sqrt(-delta[i]) / (2 * a);
			}
			i = i + 1;
		}
		for (r = 1;r <= n;r = r + 1)
		{
			if (delta[r] > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[r],x2[r]);
			}
			else if (delta[r] == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",x1[r]);
			}
			else if (delta[r] < 0)
			{
				if (x[r] == 0)
				{
					x[r] = -x[r];
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x[r],x1[r],x[r],x2[r]);
			}
		}
		return 0;
	}
}

