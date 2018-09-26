package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p;
		int i;

		double[] sz = new double[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (p = 0;p < m;p++)
		{
			   double sum = 2;
					sz[0] = 1,sz[1] = 2;
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   n = Integer.parseInt(tempVar2);
				   }
				   if (n == 1)
				   {
					   System.out.printf("%.3lf\n",sum);
				   }
					else
					{

						 for (i = 2;i <= n;i++)
						 {
										 sz[i] = sz[i - 1] + sz[i - 2];
										 sum += (sz[i] / sz[i - 1]);
						 }
						 System.out.printf("%.3lf\n",sum);
					}
		}

	   return 0;
	}

}

