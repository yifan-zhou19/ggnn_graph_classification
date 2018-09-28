package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double[] x = new double[2011];
		  double[] y = new double[2011];
		  double k;
		  double l;
		  double max;
		  int n;
		  int j;
		  int i;
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
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  y[i] = Double.parseDouble(tempVar3);
			  }
		  }
		  max = 0;
		  for (i = 0;i < n - 1;i++)
		  {
			 for (j = i + 1;j < n;j++)
			 {
				 k = x[i] - x[j];
				 l = y[i] - y[j];
				 k = Math.sqrt(k * k + l * l);
				 if (k > max)
				 {
					 max = k;
				 }
			 }
		  }
		  System.out.printf("%.4lf\n",max);
		  //getchar();
		  //getchar();
	}

}

