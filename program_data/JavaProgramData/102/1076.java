package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int w = 0;
		int j;
		double[] h = new double[50];
		double[] manh = new double[50];
		double[] womanh = new double[50];
		double g;
		double b;
		char[][] sex = new char[50][10];
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
				h[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'm')
			{
				manh[m] = h[i];
				m++;
			}
			else if (sex[i][0] == 'f')
			{
				womanh[w] = h[i];
				w++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (manh[j] > manh[j + 1])
				{
					b = manh[j];
					manh[j] = manh[j + 1];
					manh[j + 1] = b;
				}
			}
		}
		for (i = 0;i < w - 1;i++)
		{
			for (j = w - 2;j >= 0;j--)
			{
				if (womanh[j] < womanh[j + 1])
				{
					g = womanh[j];
					womanh[j] = womanh[j + 1];
					womanh[j + 1] = g;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",manh[i]);
		}
		for (i = 0;i < w - 1;i++)
		{
			System.out.printf("%.2lf ",womanh[i]);
		}
		System.out.printf("%.2lf",womanh[w - 1]);
		return 0;
	}

}

