package <missing>;

public class GlobalMembers
{
	//****************************************
	//*????                   **
	//*??? 1100012927              **
	//*2011.11.29                     **
	//****************************************

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int z = 0;
		double[][] dis = new double[50][7];
		double[][] zb = new double[10][3];
		double temp;
		double[] p = new double[7];
		p = dis;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			zb[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			zb[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			zb[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				for (k = 0; k < 3; k++)
				{
					*(p[z] + k) = zb[i][k];
					*(p[z] + k + 3) = zb[j][k];
				}
				*(p[z] + 6) = Math.sqrt(Math.pow((*(p[z] + 0) - *(p[z] + 3)), 2) + Math.pow((*(p[z] + 1) - *(p[z] + 4)), 2) + Math.pow((*(p[z] + 2) - *(p[z] + 5)), 2));
				z++;
			}
		}
		for (i = 0; i < z - 1; i++)
		{
			for (j = 0; j < z - i - 1; j++)
			{
				if (Math.abs(*(p[j] + 6) - *(p[j + 1] + 6)) < 1e-3)
				{
					continue;
				}
				else if (*(p[j] + 6) < *(p[j + 1] + 6))
				{
					for (k = 0; k < 7; k++)
					{
						temp = (p[j] + k);
						*(p[j] + k) = *(p[j + 1] + k);
						*(p[j + 1] + k) = temp;
					}
				}
			}
		}
		for (i = 0; i < n * (n - 1) / 2; i++)
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", (p[i] + 0));
			System.out.printf("%f", ",");
			System.out.printf("%f", (p[i] + 1));
			System.out.printf("%f", ",");
			System.out.printf("%f", (p[i] + 2));
			System.out.printf("%f", ")-(");
			System.out.printf("%f", (p[i] + 3));
			System.out.printf("%f", ",");
			System.out.printf("%f", (p[i] + 4));
			System.out.printf("%f", ",");
			System.out.printf("%f", (p[i] + 5));
			System.out.printf("%f", ")=");
			System.out.printf("%.2f", (p[i] + 6));
			System.out.printf("%.2f", "\n");
		}

		return 0;
	}
}

