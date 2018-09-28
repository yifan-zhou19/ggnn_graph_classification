package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] rank = new int[6];
		int[] word = new int[6];
		int[] f = new int[6];
		int i;
		int j = 1;
		for (rank[1] = 1;rank[1] <= 5;rank[1]++)
		{
			for (rank[2] = 1;rank[2] <= 5;rank[2]++)
			{
					if (rank[2] == rank[1])
					{
						continue;
					}
					{
					for (rank[3] = 1;rank[3] <= 5;rank[3]++)
					{
					if (rank[2] == rank[3] || rank[1] == rank[3])
					{
						continue;
					}
					{
						for (rank[4] = 1;rank[4] <= 5;rank[4]++)
						{
						if (rank[4] == rank[1] || rank[4] == rank[2] || rank[4] == rank[3])
						{
							continue;
						}
						{
							for (rank[5] = 1;rank[5] <= 5;rank[5]++)
							{
							if (rank[5] == rank[1] || rank[5] == rank[2] || rank[5] == rank[3] || rank[5] == rank[4])
							{
								continue;
							}
							 word[1] = (rank[1] == 5);
							 word[2] = (rank[2] == 2);
							 word[3] = (rank[5] == 1);
							 word[4] = (rank[1] != 3);
							 word[5] = (rank[1] == 4);
							if (word[rank[1]] == 1 && word[rank[2]] == 1 && word[rank[3]] == 0 && word[rank[4]] == 0 && word[rank[5]] == 0 && rank[2] != 5 && rank[3] != 5)
							{
									for (i = 1;i <= 5;i++)
									{
										f[rank[i]] = i;
									}
							System.out.print(f[1]);
								 for (i = 2;i <= 5;i++)
								 {
									 System.out.print(' ');
									 System.out.print(f[i]);
								 }
							}

							}
					}
						}
				}
					}
			}
			}
		}
		return 0;
	}

}
