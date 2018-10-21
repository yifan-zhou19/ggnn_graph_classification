package <missing>;

public class GlobalMembers
{
	public static int compare(Object p1, Object p2) // ?????????
	{
		return *((int)p2) - (int)p1;
	}
	public static int Main()
	{
		int n;
		int[] hq = new int[10002]; // ??????
		int[] ht = new int[10002]; // ??????
		int i;
		int j;
		int head;
		int ans;
		int m;
		int tailt;
		int tailq;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				ht[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(ht, n, (Integer.SIZE / Byte.SIZE), compare);
			for (i = 0; i < n; i++)
			{
				hq[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(hq, n, (Integer.SIZE / Byte.SIZE), compare);
			head = 0;
			tailt = tailq = n - 1;
			ans = 0;
			for (i = 0;i < n;i++)
			{
				if (ht[head] > hq[i])
				{
					head++;
					ans += 200;
				}
				else if (ht[head] < hq[i])
				{
					tailt--;
					ans -= 200;
				}
				else if (ht[head] == hq[i])
				{
					for (j = tailt,m = tailq;j >= head;j--,m--)
					{
						if (ht[j] > hq[m])
						{
							ans += 200;
							tailt--;
							tailq--;
						}
						else
						{
							if (ht[j] < hq[i])
							{
								ans -= 200;
							}
							tailt = --j;
							tailq = m;
							break;
						}
					}
				}

				if (head > tailt)
				{
					break;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}



}

