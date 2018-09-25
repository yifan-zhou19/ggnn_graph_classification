package <missing>;

public class GlobalMembers
{
	public static int[] wis = new int[MAX];
	public static int[] king = new int[MAX];

	public static int comp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}


	public static int Main()
	{
		int n;
		int count;
		int i;
		int imax;
		int imin;
		int jmax;
		int jmin;

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

			for (i = 0 ; i < n ; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					wis + i = tempVar2;
				}
			}
			for (i = 0 ; i < n ; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					king + i = tempVar3;
				}
			}

			qsort(wis, n, (Integer.SIZE / Byte.SIZE), comp);
			qsort(king, n, (Integer.SIZE / Byte.SIZE), comp);

			imin = 0;
			imax = n - 1;
			jmin = 0;
			jmax = n - 1;
			count = 0;
			while (jmin < jmax)
			{
				if (wis[imin] > king[jmin])
				{
					count++;
					imin++;
					jmin++;
				}
				else if (wis[imin] < king[jmin])
				{
					count--;
					imin++;
					jmax--;
				}
				else //wis[imin] == king[jmin]
				{
					while (jmin < jmax)
					{
						if (wis[imax] > king[jmax])
						{
							count++;
							imax--;
							jmax--;
						}
						else if (wis[imax] < king[jmax])
						{
							count--;
							imin++;
							jmax--;
						}
						else //wis[imax] == king[jmax]
						{
							if (wis[imin] < king[jmax])
							{
								count--;
							}
							imin++;
							jmax--;
							break;
						}
					}
				}
			}
			if (wis[imax] > king[jmax])
			{
				count++;
			}
			else if (wis[imax] < king[jmax])
			{
				count--;
			}
			count *= 200;

			System.out.printf("%d\n", count);
		}

		return 0;
	}


}

