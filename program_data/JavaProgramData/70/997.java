package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double dis = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n;j++)
			{
				temp = Math.sqrt(Math.pow(x[i] - x[j],2.0) + Math.pow(y[i] - y[j],2.0));
				if (temp > dis)
				{
					dis = temp;
				}
			}
		}
		System.out.printf("%.4f\n", dis);
		return 0;
	}
}

