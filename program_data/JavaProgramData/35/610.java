package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int j;
		int s = 0;
		double[][] a = new double[8][8];
		double[][] b = new double[8][8];
		double[][] c = new double[8][8];
		double temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Double.parseDouble(tempVar3);
			}
			b[i][j] = a[i][j];
			c[i][j] = a[i][j];
			}
		}
		double[] hm = new double[8];
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l - 1;j++)
			{
				if (b[i][j] > b[i][j + 1])
				{
				hm[i] = b[i][j];
				temp = b[i][j];
				b[i][j] = b[i][j + 1];
				b[i][j + 1] = temp;
				}
				else
				{
				hm[i] = b[i][j + 1];
				}
			}
		}
			double[] lm = new double[8];
		for (j = 0;j < l;j++)
		{
			for (i = 0;i < h - 1;i++)
			{
				if (c[i][j] < c[i + 1][j])
				{
				lm[j] = c[i][j];
				temp = c[i][j];
				c[i][j] = c[i + 1][j];
				c[i + 1][j] = temp;
				}
				else
				{
				lm[j] = c[i + 1][j];
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (hm[i] == lm[j])
				{
					System.out.printf("%d+%d",i,j);
				s++;
				}
			}
		}
		if (s == 0)
		{
		System.out.print("No");
		}
		return 0;
	}

}

