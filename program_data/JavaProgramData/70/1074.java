public class point
{
	   public double x;
	   public double y;
}

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
		  point[] p;
		  p = tangible.Arrays.initializeWithDefaultpointInstances(n);
		  int i;
		  int j;
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  p[i].x = Double.parseDouble(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  p[i].y = Double.parseDouble(tempVar3);
						  }
		  }
		  double[] d = new double[(n - 1)];
		  for (i = 0;i < n - 1;i++)
		  {
			  d[i] = 0.0;
		  }
		  double c;
		  for (i = 0;i < n - 1;i++)
		  {
							for (j = i + 1;j < n;j++)
							{
											  c = Math.sqrt(((p[i].x - p[j].x) * (p[i].x - p[j].x)) + ((p[i].y - p[j].y) * (p[i].y - p[j].y)));
											  if (c > d[i])
											  {
											  d[i] = c;
											  }
							}
		  }
		  double max = 0.0;
		  for (i = 0;i < n - 1;i++)
		  {
							if (d[i] > max)
							{
							max = d[i];
							}
		  }
		  System.out.printf("%.4lf\n",max);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}




}

