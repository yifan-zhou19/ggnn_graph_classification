package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 2)
		{
		 return 0;
		}
		double[] x = new double[n]; //?????? ?????????
		double[] y = new double[n];
		double m;
		for (int i = 0;i < n;i++)
		{
		x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		m = Math.sqrt((x[1] - x[2]) * (x[1] - x[2]) + (y[1] - y[2]) * (y[1] - y[2]));
		for (int i = 0;i < n;i++)
		{
		  for (int j = 0;j < n;j++)
		  {
			  if (m < Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])))
			  {
				m = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			  }
		  }
		}
		System.out.print(m);

		return 0;
	}

}

