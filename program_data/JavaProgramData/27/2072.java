package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[32768];
		double[] b = new double[32768];
		double[] c = new double[32768];
		int n;
		int i;
		double d;
		double x1;
		double x2;
		double e;
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
			if (Math.abs(a[i]) < 1e-16)
			{
				System.out.print("Wrong\n");
			}
			else
			{
				d = b[i] * b[i] - 4 * a[i] * c[i];
				if (Math.abs(d) < 1e-16)
				{
						 x1 = -b[i] / (2 * a[i]);
						 x2 = -b[i] / (2 * a[i]);
					if (Math.abs(x1) < 5e-6)
					{
						x1 = 0;
					}
					if (Math.abs(x2) < 5e-6)
					{
						x2 = 0;
					}
					System.out.printf("x1=x2=%.5f\n",x1);
				}
				else if (d >= 1e-16)
				{
					x1 = (-b[i] + Math.sqrt(d)) / (2 * a[i]);
					x2 = (-b[i] - Math.sqrt(d)) / (2 * a[i]);
										 if (Math.abs(x1) < 5e-6)
										 {
											 x1 = 0;
										 }
					if (Math.abs(x2) < 5e-6)
					{
						x2 = 0;
					}
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
				else
				{
					x1 = -b[i] / (2 * a[i]);
						 x2 = -b[i] / (2 * a[i]);
					if (Math.abs(x1) < 5e-6)
					{
						x1 = 0;
					}
					if (Math.abs(x2) < 5e-6)
					{
						x2 = 0;
					}
					e = Math.sqrt(-d) / (2 * a[i]);
					if (Math.abs(e) < 5e-6)
					{
						System.out.printf("x1=x2=%.5f\n",x1);
					}
					else
					{
						System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,e,x2,e);
					}
				}
			}
		}
	}
}

