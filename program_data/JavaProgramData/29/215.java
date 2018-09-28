package <missing>;

public class GlobalMembers
{
	public static int FB(int n)
	{
		int a = 0;
		if (n == 0)
		{
			a = 1;
		}
		else if (n == 1)
		{
			a = 2;
		}
		else
		{
			a = FB(n - 1) + FB(n - 2);
		}
		return a;
	}
	public static void Main(String[] args)
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] n = new int[m];
		double[] h = new double[m];
		int i;
		for (i = 0;i < m;i++)
		{
			h[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			int j;
			for (j = 0;j < n[i];j++)
			{
				h[i] += (double)FB(j + 1) / FB(j);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",h[i]);
		}
	}
}

