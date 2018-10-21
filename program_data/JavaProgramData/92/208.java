package <missing>;

public class GlobalMembers
{
	public static int cmpsmall(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: const int *i1=(const int *)e1;
		int i1 = (int)e1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: const int *i2=(const int *)e2;
		int i2 = (int)e2;
		return i1 - i2;
	}

	public static int Main()
	{
		int n;
		int[] tian = new int[1005];
		int[] king = new int[1005];
		while ((n != 0 && n > 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (int i = 0; i < n; i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				king[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(tian,n,(Integer.SIZE / Byte.SIZE),cmpsmall);
			qsort(king,n,(Integer.SIZE / Byte.SIZE),cmpsmall);

			int tianSlow = 0;
			int tianFast = n - 1;
			int kingSlow = 0;
			int kingFast = n - 1;
			int win = 0;
			int lose = 0;
			int draw = 0;
			while (tianSlow < tianFast && kingSlow < kingFast)
			{
				// ????????????????????
				if (tian[tianSlow] > king[kingSlow])
				{
					win++;
					tianSlow++;
					kingSlow++;
					continue;
				}
				// ????????????????????????????
				else if (tian[tianSlow] < king[kingSlow])
				{
					lose++;
					tianSlow++;
					kingFast--;
					continue;
				}
				// ?????????????????????
				else if (tian[tianFast] > king[kingFast])
				{
					win++;
					tianFast--;
					kingFast--;
					continue;
				}
				// ??????????????????????????????????
				else if (tian[tianFast] < king[kingFast])
				{
					lose++;
					tianSlow++;
					kingFast--;
					continue;
				}
				// ????????????????????????????????
				else
				{
					if (tian[tianSlow] < king[kingFast])
					{
						lose++;
					}
					else
					{
						draw++;
					}
					tianSlow++;
					kingFast--;
					continue;
				}
			}

			if (tian[tianSlow] < king[kingSlow])
			{
				lose++;
			}
			else if (tian[tianSlow] == king[kingSlow])
			{
				draw++;
			}
			else
			{
				win++;
			}


			System.out.print((win - lose) * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

