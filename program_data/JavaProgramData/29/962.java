package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shang = new int[1000];
		int[] xia = new int[1000];
		double[] c = new double[1000];
	double[] he = new double[500];
		int i;
		int m;
		int p;
		int q;
		int[] n = new int[50];
		shang[0] = 2;
		xia[0] = 1;
		c[0] = 2;
		for (i = 1;i < 1000;i++)
		{
			shang[i] = shang[i - 1] + xia[i - 1];
			xia[i] = shang[i - 1];
			c[i] = 1.0 * shang[i] / xia[i];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (p = 0;p < m;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[p] = Integer.parseInt(tempVar2);
			}
		}
		for (p = 0;p < m;p++)
		{
			he[p] = 0;
			for (q = 0;q < n[p];q++)
			{
				he[p] += c[q];
			}
		}
		for (p = 0;p < m;p++)
		{
			System.out.printf("%.3lf\n",he[p]);
		}
				return 0;
	}

}

