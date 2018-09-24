package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[1000];
		int i;
		int j;
		int l;
		int e;
		int a = 2;
		int b = 1;
		double[] s = new double[1000];
		double[] t = new double[1000];
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
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				a = 2;
				b = 1;
				for (l = 0;l < n[i];l++)
				{
					t[l] = 1.0 * a / b;
					e = a;
					a = a + b;
					b = e;
				}
				s[i] += t[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}
}

