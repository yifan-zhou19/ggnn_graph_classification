package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;


		char p0;
		char[] p = {'A', 'B', 'C'};
		for (int i = 1;i <= 3;i++)
		{
			for (int j = 1;j <= 3;j++)
			{
				for (int k = 1;k <= 3;k++)
				{
					int q1 = 0;
					int q2 = 0;
					int q3 = 0;
					a = (j > i) + (k == i);
					b = (i > j) + (i > k);
					c = (k > j) + (j > i);
					if ((a - b) * (i - j) < 0 || ((a - b) == 0 && (i - j) == 0))
					{
					q1 = 1;
					}
					if ((a - c) * (i - k) < 0 || ((a - c) == 0 && (i - k) == 0))
					{
					q2 = 1;
					}
					if ((c - b) * (k - j) < 0 || ((c - b) == 0 && (k - j) == 0))
					{
					q3 = 1;
					}
					if (q1 == 1 && q2 == 1 && q3 == 1)
					{
						int[] m = {i, j, k};
						int m0;
					  for (int s = 0;s < 3;s++)
					  {
							for (int t = s + 1;t < 3;t++)
							{
								if (m[t] < m[s])
								{
									m0 = m[t];
									m[t] = m[s];
									m[s] = m0;
									p0 = p[t];
									p[t] = p[s];
									p[s] = p0;
								}
							}
					  }
						System.out.print(p[0]);
						System.out.print(p[1]);
						System.out.print(p[2]);
						System.out.print("\n");
					}

				}
			}
		}

		return 0;
	}



}
