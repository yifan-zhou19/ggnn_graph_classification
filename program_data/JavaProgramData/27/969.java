package <missing>;

public class GlobalMembers
{
	/*????
	x1 = (-b + sqrt(b*b-4*a*c))/(2*a)
	x2 = (-b - sqrt(b*b-4*a*c))/(2*a)
	??????? ax2 + bx + c = 0 ?????a???0?
	
	????
	???????????n?
	??n?????????a, b, c??????????????????ax2 + bx + c =0???
	
	????
	????n????????????
	???????????x1=...;x2 = ...
	????????????x1=x2=...
	???????????x1=??+??i; x2=??-??i
	
	???????????????5?????????????*/
	public static int Main()
	{
		double q;
		double p;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		for (i = 1;i <= n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] * b[i] - 4 * a[i] * c[i] > 0)
			{
				p = -b[i] / (2 * a[i]);
				q = Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i]) / (2 * a[i]);
				if (p == -0)
				{
					p = 0;
				}
				if (q == -0)
				{
					q = 0;
				}
				System.out.print("x1=");
				System.out.printf("%.5f", p + q);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", p - q);
				System.out.printf("%.5f", "\n");
			}
			if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
			{
				p = -b[i] / (2 * a[i]);
				q = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
				 if (p == -0)
				 {
					 p = 0;
				 }
							if (q == -0)
							{
								q = 0;
							}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", q);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", q);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			if (b[i] * b[i] - 4 * a[i] * c[i] == 0)
			{
				p = -b[i] / (2 * a[i]);
				 if (p == -0)
				 {
					 p = 0;
				 }
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "\n");
			}

		}
		return 0;

	}
}

