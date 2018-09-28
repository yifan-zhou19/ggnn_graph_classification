package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
	  double[] x = new double[100];
	  double[] y = new double[100];
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  double max = 0;
	  for (int i = 0;i < n;i++) //??????a?b?????
	  {
		   x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   for (int j = 0;j < i;j++)
		   {
			   double d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			   if (max < d)
			   {
			   max = d;
			   }

		   }
	  }
	  System.out.printf("%.4f\n",max); //????
	  return 0; //?????
	}

}

