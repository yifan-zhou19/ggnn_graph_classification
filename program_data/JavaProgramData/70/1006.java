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
		  double[][] a = new double[n][2];
		  for (int i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i][0] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i][1] = Double.parseDouble(tempVar3);
		  }
		  }
		  double[][] b = new double[n][n];
		  for (int j = 0;j < n;j++)
		  {
				  for (int k = j + 1;k < n;k++)
				  {
				  b[j][k] = (a[j][0] - a[k][0]) * (a[j][0] - a[k][0]) + (a[j][1] - a[k][1]) * (a[j][1] - a[k][1]);
				  }

		  }

		  double m = 0.0;
		  for (int j = 0;j < n;j++)
		  {
				  for (int k = j + 1;k < n;k++)
				  {
					  if (b[j][k] > m)
					  {
				  m = b[j][k];
					  }
				  }
		  }
		  double p = Math.sqrt(m);
		  System.out.printf("%.4lf",p);

	}

}

