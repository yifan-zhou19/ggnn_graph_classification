package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[200];
		int i;
		int j;
		double[] s = new double[200];
		double[] p = new double[200];
		double[] q = new double[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p[0] = 2;
		q[0] = 1;
		s[0] = p[0] / q[0];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < m[i];j++)
			{
				p[j] = p[j - 1] + q[j - 1];
				q[j] = p[j - 1];
				s[j] = p[j] / q[j];
				s[j] += s[j - 1];
			}
			 System.out.printf("%.3lf\n",s[j - 1]);
		}
		return 0;
	}

}

