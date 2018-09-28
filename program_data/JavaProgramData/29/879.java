package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] t = new int[10000];
	public static double[] c = new double[10000];
	public static double[] p = new double[10000];
	public static int Main()
	{
		int m;
		int i;
		int j;
		int maxt = 0;
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
				t[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (t[i] > maxt)
			{
				maxt = t[i];
			}
		}
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		c[0] = (double)a[0] / (double)b[0];
		c[1] = (double)a[1] / (double)b[1];
		for (i = 2;i <= maxt;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
			c[i] = (double)a[i] / (double)b[i];
		}
		for (i = 0;i < m;i++)
		{
			p[i] = 0;
			for (j = 0;j < t[i];j++)
			{
				p[i] += c[j];
			}
			System.out.printf("%.3lf\n",p[i]);
		}
		return 0;
	}

}

