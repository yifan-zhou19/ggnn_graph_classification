package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[1000];
		int k;
		int f0 = 1;
		int f1 = 2;
		int f2;
		double[] q = new double[1000];
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
			   m[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < n;i++)
		{
	f0 = 1,f1 = 2;
			for (k = 0;k < m[i];k++)
			{
				q[i] += 1.0 * f1 / f0;
				f2 = f1 + f0;
				f0 = f1;
				f1 = f2;
			}
		}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%.3lf\n",q[i]);
	}
			   return 0;
	}
}

