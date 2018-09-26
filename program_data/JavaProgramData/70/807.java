package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;
		int i = 0;
		int a = 0;
		int b = 0;
		double d = 0;
		double s = 0;
		double[] x = new double[5000];
		double[] y = new double[5000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}


		for (a = 0;a < n - 1;a++)
		{

				 for (b = a + 1;b < n;b++)
				 {
					  s = Math.sqrt((x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]));
					  if (d < s)
					  {
						  d = s;
					  }

				 }
		}
		System.out.printf("%.4f\n",d);
	return 0;
	}
}

