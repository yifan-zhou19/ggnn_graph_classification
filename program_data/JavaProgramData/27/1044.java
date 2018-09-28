package <missing>;

public class GlobalMembers
{
	/*
	 * hw20130925(7.cpp
	 *
	 *  Created on: 2013-9-28
	 *      Author: KyLin
	 */
	public static int Main()
	{
		int n1; //???????
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = n1;
		int t;
		double deta;
		double[] a = new double[n]; //a,b,c????x1?x2???real????imag???,deta????
		double[] b = new double[n];
		double[] c = new double[n];
		double[] x1 = new double[n];
		double[] x2 = new double[n];
		double[] real = new double[n];
		double[] imag = new double[n];
		for (t = 0;t < n;++t)
		{
			a[t] = b[t] = c[t] = x1[t] = x2[t] = real[t] = imag[t] = 0; //??????
		}
		for (t = 0;t < n;++t)
		{
			a[t] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[t] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[t] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (t = 0;t < n;++t)
		{
			deta = b[t] * b[t] - 4 * a[t] * c[t];
			if (deta > 0) //????deta??????
			{
				x1[t] = (-b[t] + Math.sqrt(deta)) / (2 * a[t]);
				x2[t] = (-b[t] - Math.sqrt(deta)) / (2 * a[t]);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1[t]);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2[t]);
				System.out.printf("%.5f", "\n");
			}
			if (deta == 0)
			{
				x1[t] = (-b[t]) / (2 * a[t]);
				x2[t] = x1[t];
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1[t]);
				System.out.printf("%.5f", "\n");
			}
			if (deta < 0)
			{
				real[t] = (-b[t]) / (2 * a[t]);
				imag[t] = Math.sqrt(Math.abs(deta)) / (2 * a[t]);
				if (real[t] == 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", Math.abs(real[t]));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", imag[t]);
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", Math.abs(real[t]));
					System.out.printf("%.5f", -imag[t]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", real[t]);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", imag[t]);
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", real[t]);
					System.out.printf("%.5f", -imag[t]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}

}

