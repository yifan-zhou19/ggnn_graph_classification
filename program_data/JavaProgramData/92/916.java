package <missing>;

public class GlobalMembers
{
	public static int[] tj = new int[1000];
	public static int[] qw = new int[1000];

	public static int Main()
	{
		//freopen("data.txt","r",stdin);
		int n;
		int i;
		int j;
		int w;
		int win;
		int c;
		while (scanf("%d", n) && n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tj + i = tempVar;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qw + i = tempVar2;
				}
			}
			sort(tj,tj + n);
			sort(qw,qw + n);
			win = 0;
			for (j = w = 0;j < n;j++)
			{
				if (tj[j] > qw[w])
				{
					w++;
					win++;
				}
				else if (w == 0)
				{
					if (tj[j] == qw[w])
					{
						w++;
					}
					else
					{
						win--;
					}
				}
				else
				{
					c = -1;
					for (i = 1;w - i >= 0;i++)
					{
						if (qw[w - i] == tj[j - i] && qw[w - i] < tj[j - i + 1])
						{
							c++;
						}
					}
					if (tj[j] == qw[w] && c <= 0)
					{
						w++;
					}
					else
					{
						win += c;
					}
				}
			}
	//		win-=n-w;
			System.out.printf("%d\n",win * 200);
		}
		return 0;
	}

}

