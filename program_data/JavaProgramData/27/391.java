package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?? ?????????                  **
	//*?????? 1100013020       **
	//*???2011.9.23                          **
	//****************************************



	public static int Main()
	{
		int i;
		int n;
		double[] a = new double[100]; //???????????
		double[] b = new double[100];
		double[] c = new double[100];
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] k = new double[100];
		double[] l = new double[100];
		double[] p = new double[100];
		i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;i <= n;) //????
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b[i] * b[i] - 4 * a[i] * c[i] >= 0) //??
			{
				x1[i] = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				x2[i] = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				if (x1[i] < 0 || x1[i]>0)
				{
					x1[i] = x1[i];
				}
				else
				{
					x1[i] = 0.00000;
				}
				if (x2[i] < 0 || x2[i]>0)
				{
					x2[i] = x2[i];
				}
				else
				{
					x2[i] = 0.00000;
				}

			}
			else //???
			{
				k[i] = -b[i] / (2 * a[i]);
				l[i] = Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]);
				p[i] = i;
				if (k[i] < 0 || k[i]>0)
				{
					k[i] = k[i];
				}
				else
				{
					k[i] = 0.00000; //??-0???
				}
				if (l[i] < 0 || l[i]>0)
				{
					l[i] = l[i];
				}
				else
				{
					l[i] = 0.00000; //??-0???
				}
			}
			i = i + 1; //??
		}
		i = 1;
		for (;i <= n;)
		{
			if (i < p[i] || i> p[i])
			{
				if (x1[i] < x2[i] || x1[i]> x2[i])
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1[i]);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", x2[i]);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1[i]);
					System.out.printf("%.5f", "\n");
				}
			}
			else
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", k[i]);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", l[i]);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", k[i]);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", l[i]);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			i = i + 1;
		}
		return 0;
	}
}

