package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] weizhi = new int[200];
		int t;
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		double[] juli = new double[200];
		double m;
		double[] pingfanghe = new double[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;

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
				pingfanghe[k] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				juli[k] = Math.sqrt(pingfanghe[k]);
				weizhi[k] = i * 10 + j;
				k++;
			}
		}
		k--;
		for (i = k;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (juli[j] < juli[j + 1])
				{
					m = juli[j];
					juli[j] = juli[j + 1];
					juli[j + 1] = m;
					t = weizhi[j];
					weizhi[j] = weizhi[j + 1];
					weizhi[j + 1] = t;
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			a = weizhi[i] / 10;
			b = weizhi[i] % 10;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a],y[a],z[a],x[b],y[b],z[b],juli[i]);
		}
		return 0;
	}


}

