package <missing>;

public class GlobalMembers
{
	public static final int SIZE = 1005;
	public static int[] tianji = new int[SIZE];
	public static int[] qiwang = new int[SIZE];
	public static int win = 0;
	public static int mycmp(Object arg1, Object arg2)
	{
		return *(int)arg2 - (int)arg1;
	}
	public static int Main()
	{
		int n = 0;
		int i;
		int b1;
		int b2;
		int e1;
		int e2;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			win = 0;
			for (i = 0;i < n;i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji,n,(Integer.SIZE / Byte.SIZE),mycmp);
			qsort(qiwang,n,(Integer.SIZE / Byte.SIZE),mycmp);
			b1 = 0,b2 = 0,e1 = n - 1,e2 = n - 1;
			while (true)
			{
				if (tianji[b1] > qiwang[b2])
				{
					b1++;
					b2++;
					win += 200;
				}
				else if (tianji[e1] > qiwang[e2])
				{
					e1--;
					e2--;
					win += 200;
				}
				else
				{
					if (tianji[e1] < qiwang[b2])
					{
						win -= 200;
					}
					e1--;
					b2++;
				}
				if (b1 > e1)
				{
					break;
				}
			}
			System.out.print(win);
			System.out.print("\n");
		}
		return 0;
	}

}

