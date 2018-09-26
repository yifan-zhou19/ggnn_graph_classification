package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double maxx = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[(n + 1)];
		double[] y = new double[(n + 1)];


		for (int i = 0 ; i < n ; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 0 ; i < n ; i++)
		{
		   for (int j = 0 ; j < n ; j++)
		   {
			   double temp = Math.sqrt(sqr(x[i] - x[j]) + sqr(y[i] - y[j]));
			   if (temp > maxx)
			   {
					maxx = temp;
			   }

		   }

		}

		System.out.print(maxx);
		System.out.print("\n");

	return 0;
	}
}

