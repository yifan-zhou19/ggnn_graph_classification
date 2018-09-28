package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		double[][] d = new double[100][100];
		double[] x = new double[100];
		double[] y = new double[100];
		double dis = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
		for (k = 0;k < n;k++)
		{
		   d[j][k] = Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]));
	   if (d[j][k] > dis)
	   {
		   dis = d[j][k];
	   }
		}
		}
		 System.out.printf("%.4f\n",dis);
		 return 0;
	}
}

