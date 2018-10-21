package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	  double[] a = new double[n];
	  double[] b = new double[n];
	  double[][] distance = new double[n][n];
	  for (i = 1;i <= n;i++)
	  {
	   a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	  }

					for (j = 1;j <= n;j++)
					{
						 for (i = 1;i <= n;i++)
						 {
						 distance[j][i] = Math.sqrt((double)(a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
						 }
					}
										double longest = 0.0;
										for (j = 1;j <= n;j++)
										{
										   for (i = 1;i <= n;i++)
										   {
											   if (distance[j][i] > longest)
											   {
											   longest = distance[j][i];
											   }
										   }
										}
			  System.out.printf("%.4f\n", longest);

	return 0;
	}
}

