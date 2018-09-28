package <missing>;

public class GlobalMembers
{
	public static int[] tianji = new int[1000];
	public static int[] qiwang = new int[1000];

	public static int cmp(Object a, Object b)
	{
		return -((int)a - (int)b);
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
			int money = 0;
			for (int i = 0; i < n; i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(qiwang, n, (Integer.SIZE / Byte.SIZE), cmp);

			int tp = 0;
			int tq = n - 1;
			int qp = 0;
			int qq = n - 1;

			while (tp <= tq)
			{
				while (tianji[tp] > qiwang[qp] && tp <= tq)
				{
					money += 200;
					tp++;
					qp++;
				}
				while (tianji[tq] > qiwang[qq] && tp <= tq)
				{
					money += 200;
					tq--;
					qq--;
				}
				if (tianji[tp] <= qiwang[qp] != 0 && tp <= tq)
				{
					if (tianji[tq] < qiwang[qp])
					{
						money -= 200;
					}
					tq--;
					qp++;
				}
			}
			System.out.print(money);
			System.out.print("\n");

		}
	}
}

