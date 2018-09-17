package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		   char xb[7];
	//		   double sg;
	//	}
	//	xs[50];
		final String s1 = "male";
		final String s2 = "female";
		int n;
		int i;
		int j1;
		int j2;
		int m1;
		int m2;
		int k1;
		int k2;
		double[] m = new double[50];
		double[] w = new double[50];
		double t;
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
							 xs[i].xb = tempVar2;
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 xs[i].sg = tempVar3;
						 }
		}
		for (i = 0,j1 = 0;i < n;i++)
		{
							 if (strcmp(xs[i].xb,s1) == 0)
							 {
												  m[j1] = xs[i].sg;
												  j1++;
							 }
		}
		for (i = 0,j2 = 0;i < n;i++)
		{
							  if (strcmp(xs[i].xb,s2) == 0)
							  {
												  w[j2] = xs[i].sg;
												  j2++;
							  }
		}
		for (m1 = 1;m1 < j1;m1++)
		{
							   for (k1 = j1 - 1;k1 > m1 - 1;k1--)
							   {
													 if (m[k1 - 1] > m[k1])
													 {
																	 t = m[k1 - 1];
																	 m[k1 - 1] = m[k1];
																	 m[k1] = t;
													 }
							   }
		}
		for (m2 = 1;m2 < j2;m2++)
		{
							   for (k2 = j2 - 1;k2 > m2 - 1;k2--)
							   {
													 if (w[k2 - 1] < w[k2])
													 {
																	 t = w[k2 - 1];
																	 w[k2 - 1] = w[k2];
																	 w[k2] = t;
													 }
							   }
		}
		for (i = 0;i < j1;i++)
		{
							System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < j2 - 1;i++)
		{
							System.out.printf("%.2lf ",w[i]);
		}
		System.out.printf("%.2lf",w[j2 - 1]);
		return 0;
	}
}

