package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[20];
	public static int[] y = new int[20];
	public static int[] z = new int[20];
	public static int[] p = new int[1100];
	public static int Main()
	{
		int i;
		int n;
		int j;
		int plen;
		for (plen = 0, scanf("%d", n), i = n - 1; i >= 0; i--)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i] = Integer.parseInt(tempVar3);
			}
			for (j = n - 1; j > i; j--, plen++)
			{
				p[plen] = ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])) * 1000 + i * 20 + j;
			}
		}
		for (i = 0;i < plen;i++)
		{
			for (j = i + 1;j < plen;j++)
			{
				if (p[i] < p[j])
				{
					n = p[i];
					p[i] = p[j];
					p[j] = n;
				}
			}
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", x[p[i] % 20],y[p[i] % 20],z[p[i] % 20], x[(p[i] % 1000) / 20],y[(p[i] % 1000) / 20],z[(p[i] % 1000) / 20],Math.sqrt(p[i] / 1000));
		}
	}

}

