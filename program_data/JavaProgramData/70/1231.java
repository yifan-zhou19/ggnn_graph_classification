package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  double[] x = new double[100];
	  double[] y = new double[100];
	  double[] dis = new double[10000];
	  for (int i = 0;i < n;i++)
	  {
		x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	  }
	  int count = 0;
	  for (int i = 0;i < n - 1;i++)
	  {
		  for (int j = i + 1;j < n;j++)
		  {
			  dis[count++] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		  }
	  }
	  double max = 0;
	  for (int start = 0;start < count;start++)
	  {
		if (dis[start] > max)
		{
			max = dis[start];
		}
	  }
	  System.out.print(max);
	  System.out.printf("%.4f", "\n");

	  return 0;
	}
}

