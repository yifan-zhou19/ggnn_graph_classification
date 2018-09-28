package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
	 double max;
	 double m;
	 double[][] a = new double[100][2];
	 double d = new double(float x1,float y1,float x2,float y2);

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
			 a[i][0] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i][1] = Double.parseDouble(tempVar3);
		 }
	 }

			max = 0.0;
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = i + 1;j < n;j++)
			  {
				  m = d(a[i][0], a[i][1], a[j][0], a[j][1]);
				 if (m > max)
				 {
					 max = m;
				 }
			  }
		  }
		  System.out.printf("%.4f\n",max);
		  return 0;
	}

	public static double d(float x1,float y1,float x2,float y2)
	{
		double k;
		double p;
		p = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		k = Math.sqrt(p);
		return k;
	}
}

