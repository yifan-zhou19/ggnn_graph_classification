package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[11];
		int[] b = new int[11];
		int[] c = new int[11];
		int i;
		int j;
		int s;
		int q;
		int maxi = 0;
		int maxj = 1;
		double[][] d = new double[90][90];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]);
				d[i][j] = Math.sqrt(1.0 * s);
			}
		}
		for (q = 0;q < n * (n - 1) / 2;q++)
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (d[i][j] > d[maxi][maxj])
					{
						maxi = i;
						maxj = j;
					}
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[maxi],b[maxi],c[maxi],a[maxj],b[maxj],c[maxj],d[maxi][maxj]);
			d[maxi][maxj] = 0;
		}
		return 0;
	}
}

