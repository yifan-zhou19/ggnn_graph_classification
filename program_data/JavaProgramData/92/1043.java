package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		while (true)
		{
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
				int[] qiwang = new int[1000];
				int[] tianji = new int[1000];
				int[] win = new int[1000];
				int i;
				int k;
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						tianji[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						qiwang[i] = Integer.parseInt(tempVar3);
					}
				}
				int e;
				for (k = 1;k < n;k++)
				{
					for (i = 0;i < n - k;i++)
					{
						if (qiwang[i] < qiwang[i + 1])
						{
							e = qiwang[i];
							qiwang[i] = qiwang[i + 1];
							qiwang[i + 1] = e;
						}
					}
				}
				for (k = 1;k < n;k++)
				{
					for (i = 0;i < n - k;i++)
					{
						if (tianji[i] < tianji[i + 1])
						{
							e = tianji[i];
							tianji[i] = tianji[i + 1];
							tianji[i + 1] = e;
						}
					}
				}
				int get = 0;
				int j;
				int[] tianji1 = new int[1000];
				for (k = 0;k < n;k++)
				{
					for (i = 0;i < n;i++)
					{
						j = (i + k) % n;
						tianji1[i] = tianji[j];
					}
					for (i = 0;i < n;i++)
					{
						if (tianji1[i] > qiwang[i])
						{
							get = get + 200;
						}
						else if (tianji1[i] < qiwang[i])
						{
							get = get - 200;
						}
					}
					win[k] = get;
					get = 0;
				}
				int max = win[0];
				for (i = 0;i < n;i++)
				{
					if (win[i] > max)
					{
						max = win[i];
					}
				}
				System.out.printf("%d\n",max);
			}
		}
	}
}

