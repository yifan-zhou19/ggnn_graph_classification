package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int m;
		  int n;
		  double[] x = new double[1000];
		  double[] y = new double[1000];
		  double[][] z = new double[500][500];
		  double k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
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
		  for (i = 0;i < n;i++)
		  {
		  for (j = i + 1;j < n;j++)
		  {
		  z[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
						  if (z[i][j] > k)
						  {
						  k = z[i][j];
						  }
		  }
		  }
						  System.out.printf("%.4f",k);

	}
}

