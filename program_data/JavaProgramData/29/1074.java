package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] q = new int[100];
		double[] s = new double[100];
		int i = 0;
		int j = 0;
		int m;
		int a = 2;
		int b = 1;
		int e;
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
				q[i] = Integer.parseInt(tempVar2);
			}
			s[i] = 0;
			a = 2;
			b = 1;
			for (j = 0;j < q[i];j++)
			{
				s[i] += (1.0 * a) / b;
				e = a;
				a = a + b;
				b = e;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}
}

