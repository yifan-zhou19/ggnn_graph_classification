package <missing>;

public class GlobalMembers
{
	// ???????
	public static int n;
	public static int[] self = new int[1000];
	public static int[] enemy = new int[1000];

	// ??
	public static int result;

	// ????
	public static int compare(Object a, Object b)
	{
		return *((int)b) - (int)a;
	}

	// ????????
	public static void play(int s, int e)
	{
		if (s > e)
		{
			result += 200;
		}
		else if (s < e)
		{
			result -= 200;
		}
	}

	// ??????
	public static int calcMax()
	{
		int i;
		int smax;
		int smin;
		int emax;
		int emin;
		result = 0;
		smax = emax = 0;
		smin = emin = n - 1;
		for (i = 0; i < n; i++)
		{
			if (self[smin] > enemy[emin])
			{
				play(self[smin], enemy[emin]);
				smin--;
				emin--;
			}
			else if (self[smin] < enemy[emin])
			{
				play(self[smin], enemy[emax]);
				smin--;
				emax++;
			}
			else if (self[smax] > enemy[emax])
			{
				play(self[smax], enemy[emax]);
				smax++;
				emax++;
			}
			else
			{
				play(self[smin], enemy[emax]);
				smin--;
				emax++;
			}
		}
		return result;
	}

	public static int Main()
	{
		int i;
		while (scanf("%d", n) != -1 && n != 0)
		{
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					self[i] = Integer.parseInt(tempVar);
				}
			}
			qsort(self, n, (Integer.SIZE / Byte.SIZE), compare);
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					enemy[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(enemy, n, (Integer.SIZE / Byte.SIZE), compare);
			System.out.printf("%d\n", calcMax());
		}
		return 0;
	}
}

