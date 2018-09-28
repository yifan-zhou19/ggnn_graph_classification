package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int r;
		int g;
		int o;
		int l;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int[] q = new int[100];
		int[] w = new int[100];
		double[] s = new double[450];
		double e;
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
		for (k = 0;k < n - 1;k++)
		{
			for (i = k + 1;i < n;i++)
			{
				s[j] = 1.0 * Math.pow((x[k] - x[i]),2) + Math.pow((y[k] - y[i]),2) + Math.pow((z[k] - z[i]),2);
				s[j] = Math.sqrt(s[j]);
				q[j] = k;
				w[j] = i;
				j++;
			}
		}
		for (g = 1;g <= j;g++)
		{
			for (r = 0;r < j - g;r++)
			{
				if (s[r] < s[r + 1])
				{
					e = s[r + 1];
					s[r + 1] = s[r];
					s[r] = e;
					o = q[r + 1];
					q[r + 1] = q[r];
					q[r] = o;
					l = w[r + 1];
					w[r + 1] = w[r];
					w[r] = l;
				}
			}
		}
		for (r = 0;r <= j - 1;r++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[q[r]],y[q[r]],z[q[r]],x[w[r]],y[w[r]],z[w[r]],s[r]);
		}
		return 0;
	}
}

