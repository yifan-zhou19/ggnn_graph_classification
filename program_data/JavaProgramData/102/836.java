package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 1;
		int p = 1;
		double[] a = new double[50];
		double[] b = new double[50];
		double[] c = new double[50];
		double t1;
		double t2;
		char[][] s = new char[50][10];
		final String w = "male";
		final String f = "female";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(s[i],w) == 0)
			{
				b[m++] = a[i];
			}
			else
			{
				c[p++] = a[i];
			}
		}
		for (int i = 1; i <= m - 1; i++)
		{
			for (int j = 1; j <= m - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					t1 = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t1;

				}
			}

		}
		for (int i = 1; i <= p - 1; i++)
		{
				for (int j = 1; j <= p - i; j++)
				{
					if (c[j] < c[j + 1])
					{
						t2 = c[j];
						c[j] = c[j + 1];
						c[j + 1] = t2;

					}
				}

		}
		for (int i = 2; i <= m; i++)
		{
			System.out.printf("%.2f", b[i]);
			System.out.printf("%.2f", " ");
		}
		for (int j = 1; j <= p - 1; j++)
		{
			System.out.printf("%.2f", c[j]);
			if (j != p - 1)
			{
				System.out.printf("%.2f", " ");
			}
		}
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

