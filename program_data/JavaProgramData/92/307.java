package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object a, Object b)
	{
		return ((int)a) - ((int)b);
	}
	public static int Main()
	{
		int[] t = new int[2000];
		int[] q = new int[2000];
		int ncase;
		int i;
		int h;
		int pbegin;
		int tmax;
		int count;
		while ((ncase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (ncase == 0)
			{
				break;
			}
			for (i = 0; i < ncase; i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(t, ncase, (Integer.SIZE / Byte.SIZE), mycompare);
			for (i = 0; i < ncase; i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(q, ncase, (Integer.SIZE / Byte.SIZE), mycompare);
			tmax = -99999999;
			pbegin = 0;
			count = 0;
			for (pbegin = 0; pbegin < ncase; pbegin++)
			{
				count = 0;
				for (i = 0; i < ncase; i++)
				{
					if (t[(pbegin + i) % ncase] > q[i])
					{
						count += 200;
					}
					if (t[(pbegin + i) % ncase] < q[i])
					{
						count -= 200;
					}
				}
				if (tmax < count)
				{
					tmax = count;
				}

			}
			System.out.print(tmax);
			System.out.print("\n");
		}

		return 0;
	}
}

