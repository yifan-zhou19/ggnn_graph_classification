package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] factory = new int[6];
		int[] rank = new int[6];
		int[] flag = new int[6];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag,0,(Integer.SIZE / Byte.SIZE));
		for (rank[1] = 1;rank[1] <= 5;rank[1]++)
		{
			for (rank[2] = 1;rank[2] <= 5;rank[2]++)
			{
				for (rank[3] = 1;rank[3] <= 5;rank[3]++)
				{
					for (rank[4] = 1;rank[4] <= 5;rank[4]++)
					{
						for (rank[5] = 1;rank[5] <= 5;rank[5]++)
						{
							if (rank[1] * rank[2] * rank[3] * rank[4] * rank[5] == 120)
							{
								flag[1] = (rank[1] == 5);
								flag[2] = (rank[2] == 2);
								flag[3] = (rank[5] == 1);
								flag[4] = (rank[1] != 3);
								flag[5] = (rank[1] == 4);
								if (rank[1] == rank[2] || rank[2] == rank[3] || rank[3] == rank[4] || rank[4] == rank[5] || rank[5] == rank[1])
								{
									continue;
								}
								if (flag[rank[1]] == 1 && flag[rank[2]] == 1 && flag[rank[3]] == 0 && flag[rank[4]] == 0 && flag[rank[5]] == 0 && rank[2] != 5 && rank[3] != 5)
								{
									int i;
									for (i = 1;i <= 5;i++)
									{
										factory[rank[i]] = i;
									}
									for (i = 1;i <= 4;i++)
									{
										System.out.print(factory[i]);
										System.out.print(" ");
									}
	System.out.print(factory[5]);
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
