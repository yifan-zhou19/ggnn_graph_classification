package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int t;
		int o;
		int p;
		int q = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int[] one = new int[100];
		int[] two = new int[100];
		double e;
		double[] sz = new double[100];
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
		 for (i = 0;i < n - 1;i++)
		 {
			 for (p = i + 1;p < n;p++)
			 {
				 sz[q] = Math.sqrt((x[i] - x[p]) * (x[i] - x[p]) + (y[i] - y[p]) * (y[i] - y[p]) + (z[i] - z[p]) * (z[i] - z[p]));
				 one[q] = i;
				 two[q] = p;
				 q++;
			 }
		 }
			 for (k = 1;k < q + 1;k++)
			 {
			for (i = 0;i < q - k;i++)
			{
				if (sz[i] < sz[i + 1])
				{
					e = sz[i + 1];
					t = one[i + 1];
					o = two[i + 1];
					sz[i + 1] = sz[i];
					one[i + 1] = one[i];
					two[i + 1] = two[i];
					sz[i] = e;
					one[i] = t;
					two[i] = o;
				}
			}
			 }
			for (i = 0;i < q;i++)
			{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[(one[i])],y[(one[i])],z[(one[i])],x[(two[i])],y[(two[i])],z[(two[i])],sz[i]);
			}
		return 0;
	}
}

