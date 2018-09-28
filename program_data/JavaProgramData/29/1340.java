package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] t = new double[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int p = 2;
			int q = 1;
			t[i] = 0;
			for (k = 0;k < n;k++)
			{
				t[i] += 1.0 * p / q;
				int s = p;
				p = p + q;
				q = s;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",t[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(t);
		return 0;
	}
}

