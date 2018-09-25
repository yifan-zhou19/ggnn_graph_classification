package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] x = new double[100];
		double[] y = new double[100];
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2)) > max)
				{
					max = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2));
				}
			}
		}
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
		return 0;
	}












}

