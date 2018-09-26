package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l = 0;
		int[] x = new int[101];
		int[] y = new int[101];
		int[] z = new int[101];
		int[] a = new int[101];
		int[] b = new int[101];
		int i;
		double[] m = new double[101];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
			}
			for (int k = 0;k < n - 1;k++)
			{
				for (i = k + 1;i < n;i++)
				{
			m[l] = Math.sqrt(1.0 * (x[k] - x[i]) * (x[k] - x[i]) + 1.0 * (y[k] - y[i]) * (y[k] - y[i]) + 1.0 * (z[k] - z[i]) * (z[k] - z[i]));

			a[l] = k;
			b[l] = i;
			l++;
				}
			}
			for (int k = 1;k <= l;k++)
			{
			   double e;
			   for (i = 0;i < l - k;i++)
			   {
				   if (m[i] < m[i + 1])
				   {
				   e = m[i + 1];
				   m[i + 1] = m[i];
				   m[i] = e;

				   e = a[i + 1];
				   a[i + 1] = a[i];
				   a[i] = e;

				   e = b[i + 1];
				   b[i + 1] = b[i];
				   b[i] = e;
				   }
			   }
			}
			for (i = 0;i < l;i++)
			{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],m[i]);
			}
			return 0;

	}
}

