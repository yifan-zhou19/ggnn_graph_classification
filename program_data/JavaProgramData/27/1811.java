package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] m = new double[2][99];
		double[] x = new double[99];
		double a;
		double b;
		double c;
		int i;
		int n;
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
			x[i] = b * b - 4 * a * c;
			if (x[i] > 0)
			{
				m[0][i] = (-b + Math.sqrt(x[i])) / (2 * a);
				m[1][i] = (-b - Math.sqrt(x[i])) / (2 * a);
			}
			else
			{
				if (x[i] == 0)
				{
					m[0][i] = (-b) / (2 * a);
				}
				else
				{
					m[0][i] = (-b) / (2 * a);
					m[1][i] = Math.sqrt(-x[i]) / (2 * a);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",m[0][i],m[1][i]);
			}
			else
			{
				if (x[i] == 0)
				{
					System.out.printf("x1=x2=%.5lf\n",m[0][i]);
				}
				else
				{
					if (m[0][i] == 0)
					{
						System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-m[0][i],m[1][i],-m[0][i],m[1][i]);
					}
					else
					{
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m[0][i],m[1][i],m[0][i],m[1][i]);
					}
				}
			}
		}
		return 0;
	}
}

