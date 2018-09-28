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
		int i;
		double[] sz = new double[n];
		for (i = 0;i < n;i++)
		{
						 int n1;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 n1 = Integer.parseInt(tempVar2);
						 }
						 int j;
						 double[] sz1 = new double[n1];
						 double num = 0;
						 for (j = 0;j < n1;j++)
						 {
										   String tempVar3 = ConsoleInput.scanfRead();
										   if (tempVar3 != null)
										   {
											   (sz1[j]) = Double.parseDouble(tempVar3);
										   }
										   num += sz1[j] / n1;
						 }
						 double s = 0;
						 for (j = 0;j < n1;j++)
						 {
										   s += (sz1[j] - num) * (sz1[j] - num) / n1;
						 }
						 double s1 = Math.sqrt(s);
						 sz[i] = s1;
		}
		 for (i = 0;i < n;i++)
		 {
						  System.out.printf("%.5lf\n",sz[i]);
		 }

						  return 0;
	}
}

