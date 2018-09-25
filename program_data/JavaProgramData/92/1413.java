package <missing>;

public class GlobalMembers
{
	public static int cmp(Object e1, Object e2)
	{
		return *(int)e2 - (int)e1;
	}

	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
		int[] tianji = new int[1001];
		int[] qiwang = new int[1001];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(tianji,n,(Integer.SIZE / Byte.SIZE),cmp);
		qsort(qiwang,n,(Integer.SIZE / Byte.SIZE),cmp);
		i = 0;
		j = i;
		int k = n - 1;
		int h = n - 1;
		int money = 0;

		for (int m = 0;m < n;m++)
		{
			if (tianji[i] > qiwang[j])
			{
				i++,j++;
				money += 200;
			}
			else
			{
				if (tianji[k] > qiwang[h])
				{
					k--,h--;
					money += 200;
				}
				else
				{
					if (tianji[k] > qiwang[j])
					{
						money += 200;
					}
					else if (tianji[k] < qiwang[j])
					{
						money -= 200;
					}
					k--;
					j++;
				}
			}
		}
		System.out.print(money);
		System.out.print("\n");
		}
	}
}

