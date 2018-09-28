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
		int[] sz1 = new int[9];
		double c = 0;
		double GPA;
		double[] sz2 = new double[9];
		double[] sz = new double[9];
		int i;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz1[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		sum += sz1[i];
		}
		for (i = 0;i < n;i++)
		{
		sz[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz2[i] = Double.parseDouble(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{

		if (90 <= sz2[i] != 0 && sz2[i] <= 100)
		{
			sz[i] = 4.0;
		}
		if (89 >= sz2[i] != 0 && sz2[i] >= 85)
		{
		sz[i] = 3.7;
		}
		if (84 >= sz2[i] != 0 && sz2[i] >= 82)
		{
			sz[i] = 3.3;
		}
		if (81 >= sz2[i] != 0 && sz2[i] >= 78)
		{
			sz[i] = 3.0;
		}
		if (77 >= sz2[i] != 0 && sz2[i] >= 75)
		{
			sz[i] = 2.7;
		}
		if (74 >= sz2[i] != 0 && sz2[i] >= 72)
		{
			sz[i] = 2.3;
		}
		if (71 >= sz2[i] != 0 && sz2[i] >= 68)
		{
			sz[i] = 2.0;
		}
		if (67 >= sz2[i] != 0 && sz2[i] >= 64)
		{
			sz[i] = 1.5;
		}
		if (63 >= sz2[i] != 0 && sz2[i] >= 60)
		{
			sz[i] = 1.0;
		}
		if (sz2[i] < 60)
		{
			sz[i] = 0.0;
		}
		}
		for (i = 0;i < n;i++)
		{
			c += sz1[i] * sz[i];
		}
		GPA = c / sum;
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

