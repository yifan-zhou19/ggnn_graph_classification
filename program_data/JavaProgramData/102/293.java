package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[40][7];
		String es = new String(new char[7]);
		double[] h = new double[40];
		int n;
		int i;
		int j;
		int m = 0;
		int w = 0;
		double e;
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == 'm')
			{
				m++;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (s[i][0] == 'f')
				{
					es = s[i];
					s[i] = s[i + 1];
					s[i + 1] = es;
					e = h[i];
					h[i] = h[i + 1];
					h[i + 1] = e;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (h[j] > h[j + 1])
				{
					e = h[j];
					h[j] = h[j + 1];
					h[j + 1] = e;
				}
			}
		}
		for (i = 0;i < n - m;i++)
		{
			for (j = m;j < n - i - 1;j++)
			{
				if (h[j] < h[j + 1])
				{
					e = h[j];
					h[j] = h[j + 1];
					h[j + 1] = e;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%.2lf ",h[i]);
		}
		System.out.printf("%.2lf",h[n - 1]);




		return 0;
	}
}

