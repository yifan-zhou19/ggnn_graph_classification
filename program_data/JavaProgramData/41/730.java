package <missing>;

public class GlobalMembers
{
	/*
	 * kongtiao.cpp
	 *
	 *  Created on: 2012-12-8
	 *      Author: Lenovo
	 */
	public static int Main()
	{
		int[] rank = new int[5];
		int[] cc = new int[5];
		int c = rank[1] + rank[2] + rank[3] + rank[4] + rank[0] == 15 && rank[1] * rank[2] * rank[3] * rank[4] * rank[0] == 120;
		int i;
		int j;
		int k;
		for (rank[0] = 1;rank[0] <= 5;rank[0]++)
		{
			for (rank[1] = 1;rank[1] <= 5;rank[1]++)
			{
				for (rank[2] = 1;rank[2] <= 5;rank[2]++)
				{
					for (rank[3] = 1;rank[3] <= 5;rank[3]++)
					{
						for (rank[4] = 1;rank[4] <= 5;rank[4]++)
						{
							if (rank[4] == 2 || rank[4] == 3)
							{
								continue;
							}
							c = rank[1] + rank[2] + rank[3] + rank[4] + rank[0] == 15 && rank[1] * rank[2] * rank[3] * rank[4] * rank[0] == 120;
							cc[0] = rank[4] == 1;
							cc[1] = rank[1] == 2;
							cc[2] = rank[0] == 5;
							cc[3] = rank[2] != 1;
							cc[4] = rank[3] == 1;
							if (c == 1 && cc[0] + cc[2] + cc[3] + cc[4] + cc[1] == 2)
							{
								for (i = 0;i < 4;i++)
								{
									for (j = i + 1;j < 5;j++)
									{
										if (rank[i] + rank[j] == 3)
										{
											cc[i] = 1;
											cc[j] = 1;
											if (cc[0] + cc[1] + cc[2] + cc[3] + cc[4] == 2)
											{
												System.out.print(rank[0]);
												for (k = 1;k < 5;k++)
												{
													System.out.print(' ');
													System.out.print(rank[k]);
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
		}
		return 0;
	}

}
