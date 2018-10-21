package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] a = new double[10][10];
		double temp;
		int i;
		int j;
		int m;
		int n;
		int count = 0;
		int na;
		int w;
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
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
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
			temp = a[i][0];
			na = 0;
			for (j = 0; j < n; j++)
			{
				if (a[i][j] > temp)
				{
					temp = a[i][j];
	//				m_=i;
					na = j;
				}
			}

			for (w = 0; w < m; w++)

			{
					if (w == i)
					{
						continue;
					}
					if (a[w][na] < temp)
					{
						break;
					}
					if (w == m - 1)
					{
							System.out.printf("%d+%d", i, na);
							count++;
							break;

					}
			}
			if (count == 1)
			{
			break;
			}

		}
		if (count == 0)
		{
			System.out.print("No\n");
		}

	}


}

