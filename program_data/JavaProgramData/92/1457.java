package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		while (N != 0)
		{
		int win = 0;
		int lose = 0;
		int count1 = 1;
		int count2 = 1;
		int j = 0;
		int[] T = new int[1000];
		int[] Q = new int[1000];
		int temp;
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				T[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < N;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				Q[j] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < N;i++)
		{
			for (j = i + 1;j < N;j++)
			{
				if (T[i] < T[j])
				{
				   temp = T[i];
				   T[i] = T[j];
				   T[j] = temp;
				}
				if (Q[i] < Q[j])
				{
					temp = Q[i];
					Q[i] = Q[j];
					Q[j] = temp;
				}
			}
		}
		j = 0;
		for (int i = 0;i <= N - count1;i++)
		{
				if (T[i] > Q[j])
				{
					win++;
					j++;
				}
				else
				{
					if (T[i] < Q[j])
					{
						i--;
						lose++;
						count1++;
						j++;
					}
					else
					{
					   if (T[N - count1] > Q[N - count2])
					   {
						   win++;
						   count1++;
						   count2++;
						   i--;
					   }
						else
						{
							if (T[N - count1] < Q[N - count2])
							{
								lose++;
								count1++;
								i--;
								j++;
							}
							else
							{
								if (T[N - count1] == Q[j])
								{
									count1++;
									j++;
									i--;
								}
								else
								{
									lose++;
									count1++;
									j++;
									i--;
								}
							}
						}
					}
				}
		}
		System.out.printf("%d\n",200 * (win - lose));
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				N = Integer.parseInt(tempVar4);
			}
		}
	}
}

