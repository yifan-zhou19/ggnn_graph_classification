package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] fm = new int[100];
		int[] fz = new int[100];
		double sun = 0;
		int i;
		int j;
		double[] fs = new double[100];
		fm[0] = 1;
		fm[1] = 2;
		fz[0] = 2;
		fz[1] = 3;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= m - 1;j++)
		{
			sun = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			for (i = 2;i <= n - 1;i++)
			{
				fm[i] = fm[i - 1] + fm[i - 2];
				fz[i] = fz[i - 1] + fz[i - 2];
			}
			for (i = 0;i <= n - 1;i++)
			{

				fs[i] = fz[i] * 1.0 / fm[i];
				sun += fs[i];
			}
			System.out.printf("%.3lf",sun);
			System.out.print("\n");
		}




		return 0;
	}


}

