package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int n;
		int g;
		int l;
		int p;
		int a;
		int b;
		int c;
		double e;
		double[] dst = new double[45];
		int[] xz = new int[10];
		int[] yz = new int[10];
		int[] zz = new int[10];
		int[] dx = new int[45];
		int[] dy = new int[45];
		int[] dz = new int[45];
		int[] sx = new int[45];
		int[] sy = new int[45];
		int[] sz = new int[45];

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
				(xz[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(yz[i]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(zz[i]) = Integer.parseInt(tempVar4);
			}
		}
		g = 0;

		for (i = 0;i < n - 1;i++)
		{
			for (x = i + 1;x < n;x++)
			{
					a = ((xz[i]) - (xz[x])) * ((xz[i]) - (xz[x]));
					b = ((yz[i]) - (yz[x])) * ((yz[i]) - (yz[x]));
					c = ((zz[i]) - (zz[x])) * ((zz[i]) - (zz[x]));
					dst[g] = Math.pow((double)(a + b + c),0.5);
				dx[g] = xz[i];
				dy[g] = yz[i];
				dz[g] = zz[i];
				sx[g] = xz[x];
				sy[g] = yz[x];
				sz[g] = zz[x];
				g = g + 1;
			}
		}
		for (i = 0;i < g;i++)
		{
			for (x = 0;x < g - i - 1;x++)
			{
				if (dst[x] < dst[x + 1])
				{
					e = dst[x + 1];
					dst[x + 1] = dst[x];
					dst[x] = e;

					l = dx[x + 1];
					dx[x + 1] = dx[x];
					dx[x] = l;

					l = dy[x + 1];
					dy[x + 1] = dy[x];
					dy[x] = l;

					l = dz[x + 1];
					dz[x + 1] = dz[x];
					dz[x] = l;

					l = sx[x + 1];
					sx[x + 1] = sx[x];
					sx[x] = l;

					l = sy[x + 1];
					sy[x + 1] = sy[x];
					sy[x] = l;

					l = sz[x + 1];
					sz[x + 1] = sz[x];
					sz[x] = l;
				}
			}
		}
		for (i = 0;i < g;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n\n",dx[i],dy[i],dz[i],sx[i],sy[i],sz[i],dst[i]);
		}
	return 0;
	}
}

