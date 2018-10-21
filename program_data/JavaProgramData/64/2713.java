package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[20];
		int[] y = new int[20];
		int[] z = new int[20];
		int[] ju = new int[200];
		int[] xx = new int[200];
		int[] yy = new int[200];
		int[] zz = new int[200];
		int[] xxx = new int[200];
		int[] yyy = new int[200];
		int[] zzz = new int[200];
		int i;
		int j;
		int k = 0;
		int m;
		double[] l = new double[200];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				ju[k] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				l[k] = Math.sqrt(ju[k]);
				xx[k] = x[i];
				xxx[k] = x[j];
				yy[k] = y[i];
				yyy[k] = y[j];
				zz[k] = z[i];
				zzz[k] = z[j];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - 1;j++)
			{
				if (l[j] < l[j + 1])
				{
					double t = l[j + 1];
					l[j + 1] = l[j];
					l[j] = t;
				m = xx[j + 1];
				xx[j + 1] = xx[j];
				xx[j] = m;
				m = yy[j + 1];
				yy[j + 1] = yy[j];
				yy[j] = m;
				m = zz[j + 1];
				zz[j + 1] = zz[j];
				zz[j] = m;
				m = xxx[j + 1];
				xxx[j + 1] = xxx[j];
				xxx[j] = m;
				m = yyy[j + 1];
				yyy[j + 1] = yyy[j];
				yyy[j] = m;
				m = zzz[j + 1];
				zzz[j + 1] = zzz[j];
				zzz[j] = m;
				}
				else
				{
					continue;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", xx[i], yy[i], zz[i], xxx[i], yyy[i], zzz[i], l[i]);
		}
		return 0;
	}
}

