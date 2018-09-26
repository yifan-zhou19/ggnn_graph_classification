package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int xc;
		int yc;
		int zc;
		int k = 0;
		int[] x1s = new int[55];
		int[] y1s = new int[55];
		int[] z1s = new int[55];
		int[] x2s = new int[55];
		int[] y2s = new int[55];
		int[] z2s = new int[55];
		double e;
		double[] s = new double[55];
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				xc = x[i] - x[j];
				yc = y[i] - y[j];
				zc = z[i] - z[j];
				s[k] = Math.sqrt(xc * xc + yc * yc + zc * zc);
				x1s[k] = x[i];
				x2s[k] = x[j];
				y1s[k] = y[i];
				y2s[k] = y[j];
				z1s[k] = z[i];
				z2s[k] = z[j];
				k++;
			}
		}
		for (j = n * (n - 1) / 2 - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (s[i] < s[i + 1])
				{
					e = s[i];
					s[i] = s[i + 1];
					s[i + 1] = e;
					e = x1s[i];
					x1s[i] = x1s[i + 1];
					x1s[i + 1] = e;
					e = y1s[i];
					y1s[i] = y1s[i + 1];
					y1s[i + 1] = e;
					e = z1s[i];
					z1s[i] = z1s[i + 1];
					z1s[i + 1] = e;
					e = x2s[i];
					x2s[i] = x2s[i + 1];
					x2s[i + 1] = e;
					e = y2s[i];
					y2s[i] = y2s[i + 1];
					y2s[i + 1] = e;
					e = z2s[i];
					z2s[i] = z2s[i + 1];
					z2s[i + 1] = e;
				}
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x1s[k],y1s[k],z1s[k],x2s[k],y2s[k],z2s[k],s[k]);
		}
		return 0;
	}



}

