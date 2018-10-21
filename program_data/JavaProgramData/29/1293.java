package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] fz = new int[100];
		int[] fm = new int[100];
		int m;
		int[] sm = new int[100];
		int i;
		int j;
		int k;
		int l;
		double a;
		double sum;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
			for (i = 0;i < m;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sm[i] = Integer.parseInt(tempVar2);
				}
			}
			fz[0] = 2;
			fm[0] = 1;

		for (i = 0;i < m;i++)
		{
			sum = 2;
			for (k = 1;k < sm[i];k++)
			{
				fz[k] = fz[k - 1] + fm[k - 1];
				fm[k] = fz[k - 1];
				a = 1.0 * fz[k] / fm[k];
				sum += a;

			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}

}

