package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		 double s = 0;
		int[] sz = new int[1000];
		sz[0] = 1;
		sz[1] = 2;
		for (int i = 2;i < 1000;i++)
		{
			sz[i] = sz[i - 1] + sz[i - 2];
		}
		double[] qh = new double[1000];
		for (int g = 1;g < 1000;g++)
		{
			qh[g] = 1.0 * sz[g] / sz[g - 1];
		}
		for (int r = 1;r <= m;r++)
		{

			s += qh[r];
		}
		 System.out.printf("%.3lf\n",s);

		}
		return 0;
	}


}

