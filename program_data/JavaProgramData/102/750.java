package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float[] g = new float[40];
		float[] m = new float[40];
		float[] f = new float[40];
		float[] r = new float[40];
		float temp;
		int summ = 0;
		int sumf = 0;
		char[][] sex = new char[40][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sex[i][0] == 'm')
			{
				m[summ] = g[i];
				summ = summ + 1;
			}
			else
			{
				f[sumf] = g[i];
				sumf = sumf + 1;
			}
		}

		for (i = 0;i < summ;i++)
		{
			for (j = 0;j < summ;j++)
			{
				if (m[i] < m[j])
				{
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		for (i = 0;i < sumf;i++)
		{
			for (j = 0;j < sumf;j++)
			{
				if (f[i] > f[j])
				{
					temp = f[i];
					f[i] = f[j];
					f[j] = temp;
				}
			}
		}
		for (i = 0;i < summ;i++)
		{
		System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i < sumf;i++)
		{
			if (i != sumf - 1)
			{
		System.out.printf("%.2f ",f[i]);
			}
			else
			{
	System.out.printf("%.2f",f[i]);
			}
		}

		return 0;
	}
}

