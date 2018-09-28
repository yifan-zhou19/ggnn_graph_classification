package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  double max = new double(double x[],int q);
	  int n;
	  int i;
	  int j;
	  int k;
	  double[][] dot = new double[100][2];
	  double[] d = new double[10000];
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
			  dot[i][0] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  dot[i][1] = Double.parseDouble(tempVar3);
		  }
	  }
	  k = 0;
	  for (i = 0;i < n - 1;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
		  d[k] = Math.sqrt((dot[i][0] - dot[j][0]) * (dot[i][0] - dot[j][0]) + (dot[i][1] - dot[j][1]) * (dot[i][1] - dot[j][1]));
		  k = k + 1;
		  }
	  }
	  System.out.printf("%.4f\n",max(d, k));
	}
	public static double max(double[] x, int q)
	{
		double bi = x[0];
		int i;
		for (i = 1;i < q;i++)
		{
			if (x[i] > bi)
			{
			bi = x[i];
			}
		}
		return (bi);
	}


}

