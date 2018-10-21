package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int tmp;
		int max;

		for (i = 0;i < n - 1;i++)
		{
			max = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[j] > a[max])
				{
					max = j;
				}
			}
			tmp = a[i];
			a[i] = a[max];
			a[max] = tmp;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int tquick;
		int tslow;
		int qquick;
		int qslow;
		int[] tj = new int[1000];
		int[] qw = new int[1000];
		int win;
		int lose;

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
			win = 0;
			tquick = qquick = 0;
			tslow = qslow = n - 1;
			sort(tj, n);
			sort(qw, n);
			while (n-- != 0)
			{
				if (tj[tslow] > qw[qslow])
				{
					tslow--;
					qslow--;
					win++;
				}
				else if (tj[tslow] < qw[qslow])
				{
					qquick++;
					tslow--;
					win--;
				}
				else if (tj[tquick] > qw[qquick])
				{
					qquick++;
					tquick++;
					win++;
				}
				else if (tj[tquick] < qw[qquick])
				{
					tslow--;
					qquick++;
					win--;
				}
				else if (tj[tquick] == qw[qquick])
				{
					if (tj[tslow] < qw[qquick])
					{
						win--;
					}
					tslow--;
					qquick++;
				}
			}
			System.out.printf("%d\n",200 * win);
		}
		return 0;
	}
}

