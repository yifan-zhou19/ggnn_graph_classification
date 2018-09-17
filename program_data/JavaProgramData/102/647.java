package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l = 0;
		double[] h = new double[50];
		double t;
		char[][] x = new char[50][30];
		char[][] x1 = new char[50][30];
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
				x[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if ((x[j][0] == 'f') && (x[j + 1][0] == 'm'))
				{
					x1[j] = x[j], t = h[j];
					x[j] = x[j + 1], h[j] = h[j + 1];
					x[j + 1] = x1[j],h[j + 1] = t;
				}
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if ((x[j][0] == 'm') && (x[j + 1][0] == 'm'))
				{
					if (h[j] > h[j + 1])
					{
						t = h[j];
						h[j] = h[j + 1];
						h[j + 1] = t;
					}
				}
				if ((x[j][0] == 'f') && (x[j + 1][0] == 'f'))
				{
					if (h[j] < h[j + 1])
					{
						t = h[j];
						h[j] = h[j + 1];
						h[j + 1] = t;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (l == 0)
			{
				System.out.printf("%.2lf",h[i]);
				l++;
			}
			else
			{
				System.out.printf(" %.2lf",h[i]);
			}
		}
		return 0;
	}
}

