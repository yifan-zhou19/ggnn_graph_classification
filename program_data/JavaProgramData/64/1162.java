package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l = 0;
		int[] a = new int[101];
		int i;
		int j;
		int[] b = new int[101];
		int[] c = new int[101];
		int[] f = new int[50];
		int[] g = new int[50];
		int x;
		double[] e = new double[50];
		double y;
		for (i = 0;i < 50;i++)
		{
			e[i] = 0;
		}
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				e[l] = Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]) + (c[j] - c[i]) * (c[j] - c[i]));
				f[l] = j;
				g[l] = i;
				l++;
			}
		}
		for (l = 0;l < (n * (n - 1)) / 2;l++)
		{
			for (i = 0;i < (n * (n - 1) / 2 - 1);i++)
			{
				if (e[i] < e[i + 1])
				{
					y = e[i];
					e[i] = e[i + 1];
					e[i + 1] = y;
					x = f[i];
					f[i] = f[i + 1];
					f[i + 1] = x;
					x = g[i];
					g[i] = g[i + 1];
					g[i + 1] = x;
				}
			}
		}
		for (l = 0;l < n * (n - 1) / 2;l++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[f[l]],b[f[l]],c[f[l]],a[g[l]],b[g[l]],c[g[l]],e[l]);
		}
	   return 0;
	}

}

