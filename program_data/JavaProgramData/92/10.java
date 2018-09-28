package <missing>;

public class GlobalMembers
{
	public static int mycmp(Object a, Object b)
	{
		return *((int) b) - (int) a;
	}

	public static int match(int[] tianji, int[] king, int n)
	{
		if (n == 0)
		{
			return 0;
		}
		if (tianji[n - 1] > king[n - 1])
		{
			return match(tianji, king, n - 1) + 200; //??
		}
		else if (tianji[n - 1] < king[n - 1])
		{
			return match(tianji, king + 1, n - 1) - 200; //??
		}
		else
		{ //tianji[n-1]==king[n-1]
			if (tianji[0] > king[0])
			{
				return match(tianji + 1, king + 1, n - 1) + 200; //??
			}
			else
			{
				if (tianji[n - 1] == king[0])
				{
					return 0;
				}
				else
				{
					return match(tianji, king + 1, n - 1) - 200; //??
				}
			}
		}
	}


	public static int Main()
	{
		int[] tianji = new int[MAX];
		int[] king = new int[MAX];
		int n;
		int i;

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
				king[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji,n,(Integer.SIZE / Byte.SIZE),mycmp);
			qsort(king,n,(Integer.SIZE / Byte.SIZE),mycmp);
			System.out.print(match(tianji, king, n));
			System.out.print("\n");
		}
		return 0;
	}

}

