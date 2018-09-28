package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i = 1;
	double[] a = new double[100];
	double[] b = new double[100];
	double[] c = new double[100];
	double x1;
	double x2;
	double realpart;
	double imagpart;
	double disc;
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
		i += 1;
	}
	i = 1;
	while (i <= n)
	{
		disc = b[i] * b[i] - 4 * a[i] * c[i];
		if (disc > 0)
		{
			x1 = (-b[i] + Math.sqrt(disc)) / (2 * a[i]), x2 = (-b[i] - Math.sqrt(disc)) / (2 * a[i]);
			if (Math.abs(x1) < 1e-5)
			{
				x1 = 0;
			}
			if (Math.abs(x2) < 1e-5)
			{
				x2 = 0;
			}
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
		}
		else
		{
			if (disc == 0)
			{
					x1 = (-b[i]) / (2 * a[i]);
					if (Math.abs(x1) < 1e-5)
					{
						x1 = 0;
					}
					System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				realpart = (-b[i]) / (2 * a[i]);
				imagpart = Math.sqrt(-disc) / (2 * a[i]);
				if (Math.abs(realpart) < 1e-5)
				{
					realpart = 0;
				}
				if (Math.abs(imagpart) < 1e-5)
				{
					imagpart = 0;
				}

				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", realpart,imagpart, realpart,imagpart);
			}
		}
		 i += 1;
	}
	}
}

