package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int temp;
		int win = 0;
		int tie = 0;
		int lose = 0;
		int[] tianji = new int[1000];
		int[] qiwang = new int[1000];
		while (true)
		{
			win = 0;
			tie = 0;
			lose = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tianji + i = tempVar2;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qiwang + i = tempVar3;
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - i - 1;j++)
				{
					if (tianji[j] < tianji[j + 1])
					{
						temp = tianji[j];
						tianji[j] = tianji[j + 1];
						tianji[j + 1] = temp;
					}
				}
				for (j = 0;j < n - i - 1;j++)
				{
					if (qiwang[j] < qiwang[j + 1])
					{
						temp = qiwang[j];
						qiwang[j] = qiwang[j + 1];
						qiwang[j + 1] = temp;
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				if (qiwang[j] == -1)
				{
					continue;
				}
				for (i = n - 1;i >= 0;i--)
				{
					if (tianji[i] == -1)
					{
						continue;
					}
					if (tianji[i] > qiwang[j])
					{
						tianji[i] = -1;
						qiwang[j] = -1;
						win++;
						break;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (tianji[i] == -1)
				{
					continue;
				}
				for (j = 0;j < n;j++)
				{
					if (qiwang[j] == -1)
					{
						continue;
					}
					if (tianji[i] == qiwang[j])
					{
						tianji[i] == -1;
						qiwang[j] == -1;
						tie++;
						break;
					}
				}
			}
			lose = n - win - tie;
			System.out.printf("%d\n",(win - lose) * 200);
		}
		return 0;
	}

}

