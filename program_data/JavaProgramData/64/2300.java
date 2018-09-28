package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz1 = new int[100];
	int[] sz2 = new int[100];
	int[] sz3 = new int[100];
	int n;
	int i;
	int j;
	int k = 0;
	int r;
	int[] a = new int[100];
	int[] b = new int[100];
	double[][] q = new double[10][10];
	double[][] p = new double[10][10];
	double temp;
	double[] m = new double[72];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz1[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz2[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sz3[i] = Integer.parseInt(tempVar4);
		}
	}
	for (i = 0;i <= n - 1;i++)
	{
		for (j = i + 1;j <= n - 1;j++)
		{
				q[i][j] = 1.0 * ((sz1[i] - sz1[j]) * (sz1[i] - sz1[j]) + (sz2[i] - sz2[j]) * (sz2[i] - sz2[j]) + (sz3[i] - sz3[j]) * (sz3[i] - sz3[j]));
			p[i][j] = Math.sqrt(q[i][j]);
				m[k] = p[i][j];
			a[k] = i;
			b[k] = j;
				k = k + 1;
		}
	}
	for (r = 0;r < (n * (n - 1) / 2);r++)
	{
			for (k = 0;k <= n * (n - 1) / 2 - 2;k++)
			{
					if (m[k] < m[k + 1])
					{
							temp = m[k];
							m[k] = m[k + 1];
							m[k + 1] = temp;
				temp = a[k];
				a[k] = a[k + 1];
				a[k + 1] = temp;
				temp = b[k];
				b[k] = b[k + 1];
				b[k + 1] = temp;
					}
			}
	}
	for (k = 0;k < (n * (n - 1)) / 2;k++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",sz1[a[k]],sz2[a[k]],sz3[a[k]],sz1[b[k]],sz2[b[k]],sz3[b[k]],m[k]);
	}
	return 0;
	}


}

