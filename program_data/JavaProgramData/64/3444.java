package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		int[] a3 = new int[100];
		int n;
		int[] z = new int[100];
		int i;
		int j;
		int k = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		double o;
		double m;
		double[] x = new double[100];
		double[] y = new double[100];
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
				a1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a2[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a3[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				x[k] = (a1[i] - a1[j]) * (a1[i] - a1[j]) + (a2[i] - a2[j]) * (a2[i] - a2[j]) + (a3[i] - a3[j]) * (a3[i] - a3[j]);
				y[k] = Math.sqrt(x[k]);
				a[k] = i;
				b[k] = j;
				k = k + 1;
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (y[j] < y[j + 1])
				{
					m = y[j];
					y[j] = y[j + 1];
					y[j + 1] = m;

					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;

					m = b[j];
					b[j] = b[j + 1];
					b[j + 1] = m;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a1[a[i]],a2[a[i]],a3[a[i]],a1[b[i]],a2[b[i]],a3[b[i]],y[i]);
		}
	}


}

