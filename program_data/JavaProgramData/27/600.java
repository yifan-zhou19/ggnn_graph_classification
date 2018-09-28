package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[101];
		double[] b = new double[101];
		double[] c = new double[101];
		double d;
		double x1;
		double x2;
		int j;
		int n;
		a[0] = 0,b[0] = 0,c[0] = 0,d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j = j + 1)
		{
			a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b[j] * b[j] - a[j] * c[j] * 4 > 0)
			{
				x1 = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				x2 = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print(";x2=");
				System.out.printf("%.5f",x2);
				System.out.print("\n");
			}
			else if (b[j] * b[j] - a[j] * c[j] * 4 == 0)
			{
				x1 = (-b[j]) / (2 * a[j]);
				System.out.print("x1=x2=");
				System.out.printf("%.5f",x1);
				System.out.print("\n");

			}
				else if (b[j] * b[j] - a[j] * c[j] * 4 < 0)
				{
				x1 = (-b[j]) / (2 * a[j]);
				if (x1 > -0.00001 && x1 < 0.00001)
				{
					x1 = 0;
				}
				d = (Math.sqrt(4 * a[j] * c[j] - b[j] * b[j])) / (2 * a[j]);
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print("+");
				System.out.printf("%.5f",d);
				System.out.print("i;x2=");
				System.out.printf("%.5f",x1);
				System.out.print("-");
				System.out.printf("%.5f",d);
				System.out.print("i");
				System.out.print("\n");
				}

			x1 = 0;
			x2 = 0;
			d = 0;



		}
	return 0;


	}

}

