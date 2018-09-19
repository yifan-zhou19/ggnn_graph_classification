package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int f = 0;
		int[] len = new int[40];
		int x = 0;
		int y = 0;
		char[][] sum = new char[40][7];
		char[][] me = new char[40][7];
		char[][] fl = new char[40][7];
		double[] sg = new double[40];
		double[] s = new double[40];
		double[] g = new double[40];
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
				sum[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sg[i]) = Double.parseDouble(tempVar3);
			}
			len[i] = String.valueOf(sum[i]).length();
			if (len[i] == 4)
			{
				me[x] = sum[i];
				s[x] = sg[i];
				m++;
				x++;
			}
			else
			{
				fl[y] = sum[i];
				g[y] = sg[i];
				f++;
				y++;
			}
		}
		int k;
		double e;
		for (k = 1;k <= x;k++)
		{
			for (i = 0;i < x - k;i++)
			{
				if (s[i] > s[i + 1])
				{
					e = s[i];
					s[i] = s[i + 1];
					s[i + 1] = e;
				}
			}
		}
		for (k = 1;k <= y;k++)
		{
			for (i = 0;i < y - k;i++)
			{
				if (g[i] < g[i + 1])
				{
					e = g[i];
					g[i] = g[i + 1];
					g[i + 1] = e;
				}
			}
		}
		System.out.printf("%.2lf",s[0]);
		for (i = 1;i < x;i++)
		{
			System.out.printf(" %.2lf",s[i]);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf(" %.2lf",g[i]);
		}
		return 0;
	}

}

