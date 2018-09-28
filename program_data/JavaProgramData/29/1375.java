package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[MAX];
		double[] p = new double[MAX];
		double[] q = new double[MAX];
		double[] s = new double[MAX];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
				n = a[i];
				p[0] = 2;
				q[0] = 1;
				s[0] = 2;
				for (j = 1;j < n;j++)
				{
					p[j] = p[j - 1] + q[j - 1];
					q[j] = p[j - 1];
					s[j] = s[j - 1] + p[j] / q[j];
				}
				System.out.printf("%.3lf\n",s[n - 1]);
		}
		return 0;
	}

}

