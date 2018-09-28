package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i = 0;
	   int a;
	   int m = 0;
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
			a = Integer.parseInt(tempVar2);
		}
		double[] sz = new double[100];
		double sum = 0;
		double q;
		double w = 0;
		double e;
		 for (m = 0;m < a;m++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[m] = Double.parseDouble(tempVar3);
			}
		 sum += sz[m];
		 }
		q = sum / a;
		for (m = 0;m < a;m++)
		{
			w += (sz[m] - q) * (sz[m] - q);
		}
		e = Math.sqrt(w / a);
		System.out.printf("%.5lf\n",e);
	   }
	return 0;
	}

}

