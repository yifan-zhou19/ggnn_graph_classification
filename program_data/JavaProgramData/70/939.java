package <missing>;

public class GlobalMembers
{
	//????
	//2010?11?13?
	//1000012753 ???
	public static int Main()
	{
		int i;
		int j;
		int n;
		double[] x = new double[200];
		double[] y = new double[200];
		double[][] l = new double[200][200];
		double max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				l[i][j] = Math.pow(Math.abs(x[i] - x[j]), 2) + Math.pow(Math.abs(y[i] - y[j]), 2);
			}
		}
		max = l[0][1];
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (max < l[i][j])
				{
					max = l[i][j];
				}
			}
		}
		System.out.print(Math.sqrt(max));
		System.out.print("\n");
		return 0;
	}


}

