package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xz = new int[100];
		int[] yz = new int[100];
		int[] zz = new int[100];
		int[] xx = new int[100];
		int[] yy = new int[100];
		double[] jl = new double[100];
		double[] j = new double[100];
		int c = 0;
		int t;
		int m;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xz[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					yz[i] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					zz[i] = Integer.parseInt(tempVar4);
				}
		}
		for (int a = 0;a < n;a++)
		{
			for (int b = a + 1;b < n;b++)
			{
			jl[c] = (zz[b] - zz[a]) * (zz[b] - zz[a]) + (xz[b] - xz[a]) * (xz[b] - xz[a]) + (yz[b] - yz[a]) * (yz[b] - yz[a]);
			xx[c] = a;
			yy[c] = b;
			c = c + 1;
			}
		}
		for (int k = 1;k <= c;k++)
		{
		for (int i = 0;i < c - k;i++)
		{
			if (jl[i] < jl[i + 1])
			{
				t = jl[i];
				jl[i] = jl[i + 1];
				jl[i + 1] = t;
				m = xx[i];
				xx[i] = xx[i + 1];
				xx[i + 1] = m;
				l = yy[i];
				yy[i] = yy[i + 1];
				yy[i + 1] = l;
			}
		}
		}
		for (int w = 0;w < c;w++)
		{
			j[w] = Math.sqrt(jl[w]);
		}
		for (int s = 0;s < c;s++)
		{
		   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", xz[xx[s]], yz[xx[s]], zz[xx[s]], xz[yy[s]], yz[yy[s]], zz[yy[s]], j[s]);
		}
		return 0;
	}

}

