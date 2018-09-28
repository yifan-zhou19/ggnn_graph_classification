package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int x;
		int win;
		int equal;
		int[] tj = new int[1001];
		int[] qw = new int[1001];
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			win = 0;
			equal = 0;
			if (n == 0)
			{
				return (0);
			}
			else
			{
				for (i = 1;i <= n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						tj[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 1;i <= n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						qw[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 1;i <= n;i++)
				{
					for (j = 2;j <= n;j++)
					{
						if (tj[j - 1] < tj[j])
						{
							t = tj[j];
							tj[j] = tj[j - 1];
							tj[j - 1] = t;
						}
					}
				}
				for (i = 1;i <= n;i++)
				{
					for (j = 2;j <= n;j++)
					{
						if (qw[j - 1] < qw[j])
						{
							t = qw[j];
							qw[j] = qw[j - 1];
							qw[j - 1] = t;
						}
					}
				}
				for (i = n;i >= 1;i--)
				{
					for (j = 1;j <= n;j++)
					{
						if (tj[i] > qw[j])
						{
							if (tj[i] != -1 && qw[j] != -1)
							{
								win++;
								tj[i] = -1;
								qw[j] = -1;
								break;
							}
						}
					}
				}
				for (i = 1;i <= n;i++)
				{
					for (j = 1;j <= n;j++)
					{
						if (tj[i] == qw[j])
						{
							if (tj[i] != -1 && qw[j] != -1)
							{
								equal++;
								tj[i] = -1;
								qw[j] = -1;
								break;
							}
						}
					}
				}
				x = (win - (n - win - equal)) * 200;
				System.out.printf("%d\n",x);
			}
		}
	}
}

