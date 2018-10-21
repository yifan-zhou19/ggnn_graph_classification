package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 6.cpp
	// Author      :
	// Version     :
	// Copyright   : Your copyright notice
	// Description :
	//============================================================================


	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[1000];
		double[] b = new double[1000];
		double[] c = new double[1000];

		double[] d = new double[1000];
		for (int j = 0;j < n;j++)
		{
			a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d[j] = b[j] * b[j] - 4 * a[j] * c[j];
		}
		for (int i = 0;i < n;i++)
		{
			if (d[i] > 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f",(-b[i] + Math.sqrt(d[i])) / (2 * a[i]));
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f",(-b[i] - Math.sqrt(d[i])) / (2 * a[i]));
				System.out.print("\n");
			}
			else if (d[i] == 0)
			{
				if (b[i] == 0)
				{
					System.out.print("x1=x2=0.00000");
				}
				else
				{
					System.out.print("x1=x2=");
					System.out.printf("%.5f",(-b[i]) / (2 * a[i]));
					System.out.print("\n");
				}
			}
			else
			{
				if (b[i] == 0)
				{
						System.out.print("x1=0.00000+");
						System.out.printf("%.5f",Math.sqrt(c[i] / a[i]));
						System.out.print("i;x2=0.00000");
						System.out.printf("%.5f",-Math.sqrt(c[i] / a[i]));
						System.out.print("i");
						System.out.print("\n");
				}
				if (b[i] != 0)
				{
					System.out.print("x1=");
					System.out.printf("%.5f",(-b[i]) / (2 * a[i]));
					System.out.print("+");
					System.out.printf("%.5f",(Math.sqrt(-d[i])) / (2 * a[i]));
					System.out.print("i");
					System.out.print(";");
					System.out.print("x2=");
					System.out.printf("%.5f",(-b[i]) / (2 * a[i]));
					System.out.print("-");
					System.out.printf("%.5f",(Math.sqrt(-d[i])) / (2 * a[i]));
					System.out.print("i");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

