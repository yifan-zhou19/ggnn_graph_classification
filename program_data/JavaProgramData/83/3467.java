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
		int[] sz = new int[10];
		int[] sz2 = new int[10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
		}
		double[] point = new double[10];
		for (i = 0;i < n;i++)
		{
			if (sz2[i] < 60)
			{
				point[i] = 0;
			}
			else if (sz2[i] < 64)
			{
				point[i] = 1.0;
			}
			else if (sz2[i] < 68)
			{
				point[i] = 1.5;
			}
			else if (sz2[i] < 72)
			{
				point[i] = 2.0;
			}
			else if (sz2[i] < 75)
			{
				point[i] = 2.3;
			}
			else if (sz2[i] < 78)
			{
				point[i] = 2.7;
			}
			else if (sz2[i] < 82)
			{
				point[i] = 3.0;
			}
			else if (sz2[i] < 85)
			{
				point[i] = 3.3;
			}
			else if (sz2[i] < 90)
			{
				point[i] = 3.7;
			}
			else if (sz2[i] <= 100)
			{
				point[i] = 4.0;
			}
		}
		double m = 0;
		double result;
		int q = 0;
		for (i = 0;i < n;i++)
		{
		   m = m + point[i] * sz[i];
		   q = q + sz[i];
		}
		result = m / q;
		System.out.printf("%.2lf",result);
	return 0;
	}

}

