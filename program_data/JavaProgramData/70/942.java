package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] a = new double[10000][2];
		int i = 0;
		int j = 0;
		for (i = 0 ; i <= n - 1 ; i++)
		{
		a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double Max = 0.0;
		double temp = 0.0;
		for (i = 0 ; i <= n - 1 ; i++)
		{
			 for (j = 0 ; j <= n - 1 ; j++)
			 {
				  temp = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				  if (temp > Max)
				  {
				  Max = temp;
				  }
			 }
		}
		System.out.printf("%.4f\n", Max);
	return 0;
	}
}

