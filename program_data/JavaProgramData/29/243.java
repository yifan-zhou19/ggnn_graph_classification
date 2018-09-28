package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[1000];
		int i;
		int j;
		int[] s = new int[1000];
		int[] q = new int[1000];
		double[] c = new double[1000];
		double S = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[0] = 2,s[1] = 3,q[0] = 1,q[1] = 2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m[i];j++)
			{
				s[j + 2] = s[j + 1] + s[j];
				q[j + 2] = q[j + 1] + q[j];
				c[j] = 0.00001 * 100000 * s[j] / q[j];
			}
			for (j = 0;j < m[i];j++)
			{
				S = S + c[j];
			}
			System.out.printf("%.3lf\n",S);
	S = 0;
		}
		return 0;
	}

}

