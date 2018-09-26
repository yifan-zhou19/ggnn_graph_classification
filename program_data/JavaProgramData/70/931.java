package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????
		int i = 0;
		int j = 0;
		double L = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[n];
		double[] y = new double[n];
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (Math.pow(Math.pow(x[j] - x[i],2.0) + Math.pow(y[j] - y[i],2.0),0.5) > L)
				{
					L = Math.pow(Math.pow(x[j] - x[i],2.0) + Math.pow(y[j] - y[i],2.0),0.5);
				}
			}
		}
		System.out.printf("%.4f\n",L); //???????
		return 0;
	}

}

