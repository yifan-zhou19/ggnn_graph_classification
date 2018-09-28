package <missing>;

public class GlobalMembers
{
	public static int[] tianji = new int[1001];
	public static int[] qiwang = new int[1001];
	public static int n;

	public static int cmp(Object e1, Object e2)
	{
		return ((int)e2 - (int)e1);
	}

	public static int solve()
	{
		int score = 0;
		int p1 = 0;
		int p2 = 0;
		int e1 = n - 1;
		int e2 = n - 1;
		while (p2 <= e2)
		{
			if (tianji[p1] > qiwang[p2])
			{
				score += 200;
				p1++;
				p2++;
				continue;
			}
			if (tianji[e1] > qiwang[e2])
			{
				score += 200;
				e1--;
				e2--;
				continue;
			}
			if (tianji[e1] < qiwang[p2])
			{
				score -= 200;
				e1--;
				p2++;
				continue;
			}
			if (tianji[e1] == qiwang[p2])
			{
				e1--;
				p2++;
			}
			else
			{
				System.out.print("err!");
				System.out.print("\n");
				break;
			}
		}
		return score;
	}

	public static int Main()
	{
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0; i < n; i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji, n, (Integer.SIZE / Byte.SIZE), cmp);
			for (int i = 0; i < n; i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(qiwang, n, (Integer.SIZE / Byte.SIZE), cmp);
			System.out.print(solve());
			System.out.print("\n");
		}
		return 0;
	}
}

