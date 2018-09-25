package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double max = 0;
		double[][] ll = new double[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		  a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - 1;i++)
		{
		   for (j = i + 1;j <= n;j++)
		   {
			 ll[i][j] = Math.pow((a[i] - a[j]),2) + Math.pow((b[i] - b[j]),2);
			 if (ll[i][j] > max)
			 {
				 max = ll[i][j];
			 }
		   }
		}
		System.out.printf("%.4f\n",Math.sqrt(max));
		return 0;
	}

}

