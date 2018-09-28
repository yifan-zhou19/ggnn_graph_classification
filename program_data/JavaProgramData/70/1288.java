package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[100];
		double[] y = new double[100];
		double s = 0;
		for (int i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (Math.pow((x[i] - x[j]),2) + Math.pow((y[i] - y[j]),2) > s)
				{
					s = Math.pow((x[i] - x[j]),2) + Math.pow((y[i] - y[j]),2);
				}
			}
		}
		System.out.printf("%.4f", Math.sqrt(s));
		System.out.printf("%.4f", "\n");
		return 0;
	}

}

