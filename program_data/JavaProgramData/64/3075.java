package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[80];
		int[] b = new int[80];
		int k = 0;
		int m;
		int code1;
		int code2;
		double[] x = new double[13];
		double[] y = new double[13];
		double[] z = new double[13];
		double[] S = new double[80];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++) //????Cn2
			{
				S[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])); //???
				a[k] = i;
				b[k] = j;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--) //?????
			{
				if (S[j] > S[j - 1])
				{
					t = S[j];
					S[j] = S[j - 1];
					S[j - 1] = t; //????
					m = a[j];
					a[j] = a[j - 1];
					a[j - 1] = m; //???????
					m = b[j];
					b[j] = b[j - 1];
					b[j - 1] = m; //???????
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			code1 = a[i];
			code2 = b[i];
			System.out.print("(");
			System.out.print((int)x[code1]);
			System.out.print(",");
			System.out.print((int)y[code1]);
			System.out.print(",");
			System.out.print((int)z[code1]);
			System.out.print(")-(");
			System.out.print((int)x[code2]);
			System.out.print(",");
			System.out.print((int)y[code2]);
			System.out.print(",");
			System.out.print((int)z[code2]);
			System.out.print(")=");
			System.out.printf("%.2f", S[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

