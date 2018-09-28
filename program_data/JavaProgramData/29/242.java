package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int j;
		int[] fz = new int[1000];
		int[] fm = new int[1000];
		double[] fs = new double[1000];
		double zh = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		fz[0] = 2;
		fz[1] = 3;
		fm[0] = 1;
		fm[1] = 2;
		fs[0] = (double)fz[0] / fm[0];
		fs[1] = (double)fz[1] / fm[1];
		zh = fs[0] + fs[1];
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1)
			{
				System.out.print("2.000\n");
				continue;
			}
			else if (a > 1)
			{
				for (i = 2;i < a;i++)
				{
					fz[i] = fz[i - 1] + fz[i - 2];
					fm[i] = fm[i - 1] + fm[i - 2];
					fs[i] = (double)fz[i] / fm[i];
					zh = zh + fs[i];
				}
				System.out.printf("%.3lf\n",zh);
				zh = fs[0] + fs[1];
			}
		}
	  return 0;
	}



}

