package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double max = 0;
	  int n;
	  double[] x = new double[10000];
	  double[] y = new double[10000];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i != n;i++)
	  {
		  x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  if (i >= 1)
		  {
			  for (int j = 0;j != i;j++)
			  {
				  if (Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])) > max)
				  {
					  max = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				  }
			  }
		  }
	  }
	  System.out.printf("%.4f\n", max);

	  return 0;
	}

}

