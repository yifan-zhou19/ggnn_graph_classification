package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		int[] sz = new int[10];
		int[] xf = new int[10];
		double[] js = new double[10];
		double j;
		double z;
		x = 0;
		j = 0.0;
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
				(xf[i]) = Integer.parseInt(tempVar2);
			}
			x += xf[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
			if (sz[i] < 60)
			{
				js[i] = 0.0;
			}
			else if (sz[i] < 64 && sz[i]>59)
			{
				js[i] = 1.0;
			}
			else if (sz[i] < 68 && sz[i]>63)
			{
				js[i] = 1.5;
			}
			else if (sz[i] < 72 && sz[i]>67)
			{
				js[i] = 2.0;
			}
			else if (sz[i] < 75 && sz[i]>71)
			{
				js[i] = 2.3;
			}
			else if (sz[i] < 78 && sz[i]>74)
			{
				js[i] = 2.7;
			}
			else if (sz[i] < 82 && sz[i]>77)
			{
				js[i] = 3.0;
			}
			else if (sz[i] < 85 && sz[i]>81)
			{
				js[i] = 3.3;
			}
			else if (sz[i] < 90 && sz[i]>84)
			{
				js[i] = 3.7;
			}
			else
			{
				js[i] = 4.0;
			}
			j += 1.0 * (js[i] * xf[i]);
		}
		z = 1.0 * j / x;
		System.out.printf("%.2lf\n",z);
		return 0;
	}

}

