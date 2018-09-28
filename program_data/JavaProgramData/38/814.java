package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int n;
	//		double x[100];
	//		double S;
	//	}
	//	sz[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i].n = tempVar2;
			}
			for (j = 0;j < sz[i].n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i].x[j] = tempVar3;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			double a = 0;
			for (j = 0;j < sz[i].n;j++)
			{
				a += sz[i].x[j] * 1.0;
			}
			a /= sz[i].n;
			sz[i].S = 0;
			for (j = 0;j < sz[i].n;j++)
			{
				sz[i].S = (sz[i].x[j] - a) * (sz[i].x[j] - a) + sz[i].S;
			}
			sz[i].S = sz[i].S / sz[i].n;
			sz[i].S = Math.sqrt(sz[i].S);
			System.out.printf("%.5lf\n",sz[i].S);


		}
		return 0;
	}
}

