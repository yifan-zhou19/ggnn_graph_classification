package <missing>;

public class GlobalMembers
{
	public static int cmp(Object x, Object y)
	{
		return ((int)y) - ((int)x);
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1010];
		int[] b = new int[1010];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0 ; i < n ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0 ; i < n ; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);

			int aStart = 0;
			int aEnd = n - 1;
			int bStart = 0;
			int bEnd = n - 1;
			int count = 0;
			while (aStart <= aEnd)
			{
				if (a[aStart] > b[bStart])
				{
					count++;
					aStart++;
					bStart++;
				}
				else if (a[aEnd] > b[bEnd])
				{
					count++;
					aEnd--;
					bEnd--;
				}
				else
				{
					if (a[aEnd] < b[bStart])
					{
						count--;
					}
					aEnd--;
					bStart++;
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

