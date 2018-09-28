package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		while (true)
		{
			int n;
			int i;
			int j;
			int k;
			int p;
			int temp;
			int win;
			int tie;
			int money;
			int[] tj = new int[2000];
			int[] qw = new int[2000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			else
			{
			   /*????*/
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						tj[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						qw[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 0;i < n - 1;i++)
				{
					for (j = 0;j < n - 1 - i;j++)
					{
						if (tj[j] < tj[j + 1])
						{
							temp = tj[j];
							tj[j] = tj[j + 1];
							tj[j + 1] = temp;
						}
					}
				}
				for (i = 0;i < n - 1;i++)
				{
					for (j = 0;j < n - 1 - i;j++)
					{
						if (qw[j] < qw[j + 1])
						{
							temp = qw[j];
							qw[j] = qw[j + 1];
							qw[j + 1] = temp;
						}
					}
				}

				/*??*/		

				win = tie = 0;
				for (i = 0, j = 0, k = p = n - 1;j <= k != 0 && i <= p;)
				{
					if (tj[j] > qw[i])
					{
						win++;
						j++;
						i++;
					}
					else if (tj[k] > qw[p])
					{
						win++;
						p--;
						k--;
					}
					else
					{
						if (tj[k] == qw[i])
						{
							tie++;
						}
						k--;
						i++;
					}
				}
				money = 200 * (win - (n - win - tie));
				System.out.printf("%d\n",money);
			}
		}
	}




}

