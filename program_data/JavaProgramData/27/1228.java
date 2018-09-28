package <missing>;

public class GlobalMembers
{
	//********************************
	//*????6.cpp   **
	//*?????? 1300012966 **
	//*???2013.  **
	//*????????????  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double d;
		double x1;
		double x2;
		double e;
		double f;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		} //????
		for (i = 1; i <= n; i++)
		{
			d = b[i] * b[i] - 4 * a[i] * c[i]; //?????
			if (d > 0)
			{
				x1 = (- b[i] + Math.sqrt(d)) / (2 * a[i]);
				x2 = (- b[i] - Math.sqrt(d)) / (2 * a[i]);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f\n", x2);
			} //?????????
			if (d == 0)
			{
				x1 = - b[i] / (2 * a[i]);
				if (x1 == 0)
				{
					x1 = 0;
				}
				System.out.print("x1=x2=");
				System.out.printf("%.5f\n", x1);
			} //?????????
			if (d < 0)
			{
				e = - b[i] / (2 * a[i]);
				if (e == 0)
				{
					e = 0;
				}
				f = Math.sqrt(- d) / (2 * a[i]);
				System.out.print("x1=");
				System.out.printf("%.5f", e);
				System.out.print("+");
				System.out.printf("%.5f", f);
				System.out.print("i");
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f", e);
				System.out.print("-");
				System.out.printf("%.5f", f);
				System.out.print("i");
				System.out.print("\n");
			} //???????
		}
		return 0;
	}

}

