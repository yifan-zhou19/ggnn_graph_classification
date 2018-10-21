package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[10][10];
		double b = -10000;
		double e = 100000;
		int m;
		int n;
		int i;
		int j;
		int k;
		int c = -1;
		int d = -1;
		int l = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > b)
				{
				  b = a[i][j];
				  c = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (e >= a[k][c])
				{
					e = a[k][c];
					l = k;
				}

			}
			if (b == e && i == l)
			{
						  d = i;
				break;
			}


		}

			if (c != -1 && d != -1)
			{
				System.out.printf("%d+%d", d, c);
			}
			else
			{
								System.out.print("No");
			}
		return 0;
	}

}

