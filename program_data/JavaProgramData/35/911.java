package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int i;
		int j;
		int m;
		int n;
		int count = 0;
		int temp;
		int m_;
		int n_;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	//	printf("ohear");
		for (i = 0; i < m; i++)
		{
			temp = a[i][0];
			m_ = i;
			n_ = 0;
			for (j = 0; j < n; j++)
			{
				if (a[i][j] > temp)
				{
					temp = a[i][j];
					m_ = i;
					n_ = j;
				}
			}

				for (w = 0; w < m; w++)

				{
					if (w == m_)
					{
						continue;
					}
					if (a[w][n_] > temp)

					{

						if (w == m - 1)

						{

							System.out.printf("%d+%d", m_, n_);
							count++;

						}

						else
						{

							continue;
						}

					}

					else
					{
						break;
					}

				}

		}
		if (count == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.print("\n");
		}
		return 0;
	}





}

