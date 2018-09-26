package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		double[] y = new double[100];
		double[] a = new double[1000];
		double t = 0.0;
		double result = 0.0;
		int n;
		int j;
		int i;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
				x[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				y[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j < n - 1;j++)
			{
				for (i = j + 1;i < n;i++,k++)
				{
			a[k] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				}
			}
		   for (k = 0;k < n * (n - 1) / 2;k++)
		   {
			   if (a[k] > t)
			   {
				   t = a[k];
			   }
		   }
			  result = Math.pow(t,0.50);
		   System.out.printf("%.4f\n",result);
		   return 0;
	}
}

