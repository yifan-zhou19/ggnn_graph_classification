package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return ((int)b) - ((int)a);
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] tianji = new int[1000];
		int[] qiwang = new int[1000];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(qiwang,n,(Integer.SIZE / Byte.SIZE),compare);
			int head1 = 0;
			int tail1 = n - 1;
			int head2 = 0;
			int tail2 = n - 1;
			int money = 0;
			while (head1 <= tail1)
			{
				if (tianji[tail1] > qiwang[tail2])
				{
					money += 200;
					tail1--;
					tail2--;
				}
				else if (tianji[tail1] < qiwang[tail2])
				{
					money -= 200;
					tail1--;
					head2++;
				}
				else
				{
					if (tianji[head1] > qiwang[head2])
					{
						money += 200;
						head1++;
						head2++;
					}
					else if (tianji[head1] < qiwang[head2])
					{
						money -= 200;
						tail1--;
						head2++;
					}
					else
					{
						if (tianji[tail1] < qiwang[head2])
						{
							money -= 200;
						}
						tail1--;
						head2++;
					}
				}
			}
			System.out.print(money);
			System.out.print("\n");
		}
		return 0;
	}

}

