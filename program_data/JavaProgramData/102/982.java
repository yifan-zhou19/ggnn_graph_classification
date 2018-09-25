package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h = 0;
		int i1;
		int j1;
		int m;
		int h1 = 0;
		int i2;
		int j2;
		char[][] s = new char[100][100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double t1;
		double t;
		double min;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= 1;j++)
			{
				if (s[i][j] == 'm')
				{
					b[h] = a[i];
					h++;

				}
			}
		}
			for (i1 = 1;i1 <= h;i1++)
			{
				for (j1 = 0;j1 < h - i1;j1++)
				{
					if (b[j1] > b[j1 + 1])
					{
						t1 = b[j1];
						b[j1] = b[j1 + 1];
						b[j1 + 1] = t1;

					}
				}
			}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= 1;j++)
			{
				if (s[i][j] == 'f')
				{
					c[h1] = a[i];
					h1++;

				}
			}
		}
			for (i2 = 1;i2 <= h1;i2++)
			{
				for (j2 = 0;j2 < h1 - i2;j2++)
				{

					if (c[j2] < c[j2 + 1])
					{

						t = c[j2];
						c[j2] = c[j2 + 1];
						c[j2 + 1] = t;

					}
				}

			}
			for (j = 0;j < h;j++)
			{
				System.out.printf("%.2lf ",b[j]);
			}
			for (i = 0;i < h1 - 1;i++)
			{
				System.out.printf("%.2lf ",c[i]);
			}
			for (i = 0;i < h1;i++)
			{
				if (i == h1 - 1)
				{
				System.out.printf("%.2lf",c[i]);
				}
			}

		return 0;
	}
}

