package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double d;
		  double max = 0;
		  double[] x = new double[n];
		  double[] y = new double[n];
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  x[i] = Double.parseDouble(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  y[i] = Double.parseDouble(tempVar3);
				  }
		  }
		  for (int j = 0;j < n;j++)
		  {
				  for (int k = j + 1;k < n;k++)
				  {
						d = Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]));
						if (d > max)
						{
						max = d;
						}
				  }
		  }
		  System.out.printf("%.4lf",max);
		  System.in.read();
		  System.in.read();
	}

}

