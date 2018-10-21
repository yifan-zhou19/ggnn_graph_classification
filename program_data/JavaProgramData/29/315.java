package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int[] n = new int[100];
		int i;
		int j;
		int k;
		int[] fm = new int[100];
		int[] fz = new int[100];
		double[] h = new double[100];
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
				n[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 1)
			{
				h[i] = 2.000;
			}
			else if (n[i] == 2)
			{
				h[i] = 3.500;
			}
			else
			{
				fz[0] = 2,fz[1] = 3;
				fm[0] = 1,fm[1] = 2;
				h[i] = 3.500;
				for (k = 2;k < n[i];k++)
				{
					fm[k] = fm[k - 1] + fm[k - 2];
					fz[k] = fz[k - 1] + fz[k - 2];
					h[i] += (fz[k] * 1.000 / fm[k] * 1.000);
				}
			}
			System.out.printf("%.3lf\n",h[i]);
		}
	}
}

