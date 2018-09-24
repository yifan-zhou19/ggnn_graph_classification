package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[101];
		double[] b = new double[101];
		double[] s = new double[101];
		double[] p = new double[101];
		double[] q = new double[101];
		double[] z = new double[101];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Double.parseDouble(tempVar3);
				}
				s[i] = s[i] + b[j];
			}
			p[i] = (double)s[i] / a[i];
			for (j = 0;j < a[i];j++)
			{
				q[i] = q[i] + (b[j] - p[i]) * (b[j] - p[i]);
			}
			z[i] = (double)Math.sqrt(q[i] / a[i]);
			System.out.printf("%.5f\n",z[i]);
		}
		return 0;
	}
}

