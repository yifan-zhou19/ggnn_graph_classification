package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] x1 = new int[45];
		int[] y1 = new int[45];
		int[] z1 = new int[45];
		int[] x2 = new int[45];
		int[] y2 = new int[45];
		int[] z2 = new int[45];
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int h;
		double[] s = new double[45];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		l = 0;
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				x1[l] = x[j];
				y1[l] = y[j];
				z1[l] = z[j];
				x2[l] = x[k];
				y2[l] = y[k];
				z2[l] = z[k];
				s[l] = Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]) + (z[j] - z[k]) * (z[j] - z[k]));
				l++;
			}

		}
		for (j = 1;j <= m;j++)
		{
			for (k = 0;k < m - j;k++)
			{
				if (s[k] < s[k + 1])
				{
					e = s[k];
					s[k] = s[k + 1];
					s[k + 1] = e;
					h = x1[k];
					x1[k] = x1[k + 1];
					x1[k + 1] = h;
					h = y1[k];
					y1[k] = y1[k + 1];
					y1[k + 1] = h;
					h = z1[k];
					z1[k] = z1[k + 1];
					z1[k + 1] = h;
					h = x2[k];
					x2[k] = x2[k + 1];
					x2[k + 1] = h;
					h = y2[k];
					y2[k] = y2[k + 1];
					y2[k + 1] = h;
					h = z2[k];
					z2[k] = z2[k + 1];
					z2[k + 1] = h;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x1[i],y1[i],z1[i],x2[i],y2[i],z2[i],s[i]);
		}
		return 0;
	}
}

