package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int nn;
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int[][] x = new int[46][3];
		int[][] y = new int[46][3];
		int[] xx = new int[46];
		int[] yy = new int[46];
		int px;
		int py;
		int pz;
		double[] jl = new double[46];
		double m;
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
		int d = 0;
		for (int w = 0;w < n;w++)
		{
			for (int j = w + 1;j < n;j++)
			{
				jl[d] = Math.sqrt(1.0 * (a[w] - a[j]) * (a[w] - a[j]) + (b[w] - b[j]) * (b[w] - b[j]) + (c[w] - c[j]) * (c[w] - c[j]));
				x[d][0] = a[w];
				x[d][1] = b[w];
				x[d][2] = c[w];
				y[d][0] = a[j];
				y[d][1] = b[j];
				y[d][2] = c[j];
				xx[d] = w;
				yy[d] = j;
				d++;
			}
		}

		for (int k = 1;k <= n * (n - 1) / 2;k++)
		{
			for (int j = 0;j < n * (n - 1) / 2 - k;j++)
			{
				if (jl[j] > jl[j + 1] || (xx[j] < xx[j + 1] && jl[j] == jl[j + 1]) || (yy[j] < yy[j + 1] && xx[j] == xx[j + 1] && jl[j] == jl[j + 1]))
				{
					m = jl[j + 1];

					jl[j + 1] = jl[j];
					jl[j] = m;

					nn = xx[j + 1];

					xx[j + 1] = xx[j];
					xx[j] = nn;
					nn = yy[j + 1];

					yy[j + 1] = yy[j];
					yy[j] = nn;

					px = x[j + 1][0];
					py = x[j + 1][1];
					pz = x[j + 1][2];
					x[j + 1][0] = x[j][0];
					x[j + 1][1] = x[j][1];
					x[j + 1][2] = x[j][2];
					x[j][0] = px;
					x[j][1] = py;
					x[j][2] = pz;

					px = y[j + 1][0];
					py = y[j + 1][1];
					pz = y[j + 1][2];
					y[j + 1][0] = y[j][0];
					y[j + 1][1] = y[j][1];
					y[j + 1][2] = y[j][2];
					y[j][0] = px;
					y[j][1] = py;
					y[j][2] = pz;


				}
			}
		}

		for (int j = n * (n - 1) / 2 - 1;j >= 0;j--)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[j][0],x[j][1],x[j][2],y[j][0],y[j][1],y[j][2],jl[j]);
		}

	}

}

