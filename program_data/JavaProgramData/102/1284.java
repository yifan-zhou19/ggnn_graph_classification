package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int n;
		int m;
		int o;
		int i;
		int j;

		double[] a = new double[81];

		char[][] b = new char[41][7];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++)

		{

			b[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		}

		m = 1;

		o = 0;

		for (i = 1;i <= n;i++)

		{

			if (b[i][0] == 'm')

			{

				a[m + n] = a[i];

				m++;

			}

			if (b[i][0] == 'f')

			{
				a[2 * n - o] = a[i];

				o++;

			}

		}

		double x;

		for (i = 1 + n;i <= m + n - 1;i++)

		{

			for (j = m + n - 1;j > i;j--)

			{

				if (a[j] < a[j - 1])

				{

					x = a[j];

					a[j] = a[j - 1];

					a[j - 1] = x;

				}

			}

		}

		for (i = m + n;i <= 2 * n;i++)

		{

			for (j = 2 * n;j > i;j--)

			{

				if (a[j] > a[j - 1])

				{

					x = a[j];

					a[j] = a[j - 1];

					a[j - 1] = x;

				}

			}

		}

		for (i = n + 1;i < 2 * n;i++)

		{


			System.out.printf("%.2f", a[i]);
			System.out.printf("%.2f", " ");

		}


		System.out.printf("%.2f", a[2 * n]);

		return 0;
	}

}

