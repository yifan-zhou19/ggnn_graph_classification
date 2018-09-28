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
	   point[] p = tangible.Arrays.initializeWithDefaultpointInstances(20);
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int i;
	   int j;
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p[i].x = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 p[i].y = Double.parseDouble(tempVar3);
		 }
	   }
		  double[] dis = new double[400];
		  double t;
		  int k = 0;
		  for (i = 0;i < n - 1;i++)
		  {
			 for (j = i + 1;j < n;j++)
			 {
				t = (p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y);
				dis[k] = Math.sqrt(t);
				k++;
			 }
		  }
		double max = dis [0];
		for (i = 1;dis[i] != '\0';i++)
		{
			  if (dis [i] > max)
			  {
				max = dis [i];
			  }

		}

			System.out.printf("%.4lf\n",max);


	System.in.read();
	System.in.read();



	}

}

