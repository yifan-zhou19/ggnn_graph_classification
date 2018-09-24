package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

			 final int max = 100;
			 double[] a = new double[max];
			 double[] b = new double[max];
			 double[] c = new double[max];
			 double x1;
			 double x2;
			 double delta;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		for (i = 1;i <= n;i++)
		{
			delta = b[i] * b[i] - 4 * a[i] * c[i];
			if (delta > 0)
			{
				x1 = (-b[i] + Math.sqrt(delta)) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(delta)) / (2 * a[i]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (delta == 0)
			{
				System.out.printf("x1=x2=%.5f\n",-b[i] / (2 * a[i]));
			}
			else
			{
				x1 = -b[i] / (2 * a[i]);
				x2 = Math.sqrt(-delta) / (2 * a[i]);
				if (x2 < 0)
				{
					x2 = -x2;
				}
								if (x1 == 0)
								{
									x1 = 0;
								}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
			}
		}
		return 0;
	}

}

