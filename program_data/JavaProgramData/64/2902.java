package <missing>;

public class GlobalMembers
{
	public static double f(int[] a, int[] b)
	{
		int sum;
		int c;
		double result;
		sum = 0;
		c = a[0] - b[0];
		sum += c * c;
		c = a[1] - b[1];
		sum += c * c;
		c = a[2] - b[2];
		sum += c * c;
		result = Math.sqrt(sum);
		return result;
	}
	public static int Main()
	{
		int n;
		int[][] zb = new int[M][3];
		int[][] dw = new int[N][2];
		int i;
		int k;
		double[] jl = new double[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 3;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					zb[i][k] = Integer.parseInt(tempVar2);
				}
			}
		}
		int count = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				jl[count] = f(zb[i], zb[k]);
				dw[count][0] = i;
				dw[count][1] = k;
				count++;
			}
		}
		double e0;
		int e;
		for (k = 1;k < count;k++)
		{
			for (i = 0;i < count - k;i++)
			{
				if (jl[i] < jl[i + 1])
				{
					e0 = jl[i];
					jl[i] = jl[i + 1];
					jl[i + 1] = e0;
					e = dw[i][0];
					dw[i][0] = dw[i + 1][0];
					dw[i + 1][0] = e;
					e = dw[i][1];
					dw[i][1] = dw[i + 1][1];
					dw[i + 1][1] = e;
				}
			}
		}
		int x;
		int y;
		for (i = 0;i < count;i++)
		{
			x = dw[i][0];
			y = dw[i][1];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",zb[x][0], zb[x][1],zb[x][2],zb[y][0],zb[y][1],zb[y][2],jl[i]);
		}
		return 0;
	}
}

