package <missing>;

public class GlobalMembers
{
	public static double distance(double x1, double y1, double x2, double y2)

	{

		double m = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		return m;

	}



	public static int Main()

	{
		int i;
		int n;
		int j;
		int k = 0;

		double[][] a = new double[100][2];
		double dis;
		double t;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)

		{

			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		}

		dis = distance(a[0][0], a[0][1], a[1][0], a[1][1]);

		while (k != n * (n - 1) / 2)

		{

			for (i = 0; i < n; i++)

			{
				for (j = i + 1; j < n; j++)

				{

					t = distance(a[i][0], a[i][1], a[j][0], a[j][1]);

					dis = (t > dis) ? t : dis;

					k++;



				}

			}

		}

		System.out.printf("%.4f\n", dis);

		return 0;

	}
}

