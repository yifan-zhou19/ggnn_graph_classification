package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] X = new int[120];
		int[] Y = new int[120];
		int[] Z = new int[120];
		int[] I = new int[1020];
		int[] J = new int[1020];
		double[] R2 = new double[1020];
		double mid;
		int n;
		int i;
		int x;
		int y;
		int z;
		int a;
		int b;
		int pai;
		int mi;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			X[i] = x;
			Y[i] = y;
			Z[i] = z;

		}
		int r = 1;
		for (a = 1; a <= n; a++)
		{
			for (b = 2; b <= n; b++)
			{
				if (b <= a)
				{
					continue;
				}
				I[r] = a;
				J[r] = b;
				R2[r] = (X[a] - X[b]) * (X[a] - X[b]) + (Y[a] - Y[b]) * (Y[a] - Y[b]) + (Z[a] - Z[b]) * (Z[a] - Z[b]);
				r++;
			}
		}

		pai = n * (n - 1) / 2 + 1;
		while (pai-- != 0)
		{
			for (i = 1; i < r - 1; i++)
			{
				if (R2[i] < R2[i + 1])
				{
					mid = R2[i];
					R2[i] = R2[i + 1];
					R2[i + 1] = mid;
					mi = J[i];
					J[i] = J[i + 1];
					J[i + 1] = mi;
					mi = I[i];
					I[i] = I[i + 1];
					I[i + 1] = mi;
				}

			}
		}

		for (i = 1; i <= n * (n - 1) / 2; i++)
		{
			R2[i] = Math.sqrt(R2[i]);

			System.out.print("(");
			System.out.print(X[I[i]]);
			System.out.print(",");
			System.out.print(Y[I[i]]);
			System.out.print(",");
			System.out.print(Z[I[i]]);
			System.out.print(")-(");
			System.out.print(X[J[i]]);
			System.out.print(",");
			System.out.print(Y[J[i]]);
			System.out.print(",");
			System.out.print(Z[J[i]]);
			System.out.print(")=");
			System.out.printf("%.2f", R2[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

