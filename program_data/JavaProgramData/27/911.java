package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] y1 = new double[100];
		double[] y2 = new double[100];
		double[] d = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d[i] = b[i] * b[i] - 4 * a[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			if (d[i] > 0)
			{
				x1[i] = (-b[i] + Math.sqrt(d[i])) / (2 * a[i]);
				x2[i] = (-b[i] - Math.sqrt(d[i])) / (2 * a[i]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1[i],x2[i]);
			}
			else if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
			{
				x1[i] = (-b[i] / (2 * a[i])),y1[i] = Math.sqrt(-d[i]) / (2 * a[i]);
				x2[i] = (-b[i] / (2 * a[i])),y2[i] = -Math.sqrt(-d[i]) / (2 * a[i]);
				if (b[i] != 0)
				{
					if (a[i] > 0)
					{
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f%.5fi\n",x1[i],y1[i],x2[i],y2[i]);
					}
					else
					{
					System.out.printf("x1=%.5f%.5fi;x2=%.5f+%.5f\n",x1[i],y1[i],x2[i],y2[i]);
					}
				}
				else
				{
					if (a[i] > 0)
					{
					System.out.printf("x1=0.00000+%.5fi;x2=0.00000%.5fi\n",y1[i],y2[i]);
					}
					else if (a[i] < 0)
					{
					System.out.printf("x1=0.00000%.5fi;x2=0.00000+%.5fi\n",y1[i],y2[i]);
					}
				}



			}
			else
			{
				x1[i] = -b[i] / (2 * a[i]);
				x2[i] = x1[i];
				System.out.printf("x1=x2=%.5f\n",x1[i]);
			}
		}
		return 0;
	}

}

