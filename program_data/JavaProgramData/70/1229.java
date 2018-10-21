package <missing>;

public class GlobalMembers
{
	public static double d(double x1,double y1,double x2,double y2)
	{
		double k;
		k = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return k;
	}

	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  double x;
		  double y;
		  double[] a = new double[100];
		  double[] b = new double[100];
		  double[] c = new double[100];
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
							  a[i] = Double.parseDouble(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b[i] = Double.parseDouble(tempVar3);
						  }
		  }
		  int h = 0;
		  for (i = 0;i < n;i++)
		  {
						for (j = n - 1;j != i;j--)
						{
								  c[h] = d(a[i], b[i], a[j], b[j]);

								  h++;
						}
		  }
		  double max = 0;
		  for (i = 0;i < h;i++)
		  {
						  if (c[i] > max)
						  {
						  max = c[i];
						  }
		  }
		  System.out.printf("%.4f\n",max);


	}

}

