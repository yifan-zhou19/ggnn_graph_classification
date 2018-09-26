package <missing>;

public class GlobalMembers
{
	/*
	 * PG-HorseRace.cpp
	 *
	 *  Created on: 2011-3-31
	 *      Author: lyh
	 */
	public static int Cmp(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * C1 = (int *)p1;
		int C1 = (int)p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * C2 = (int *)p2;
		int C2 = (int)p2;
		return C2 - C1;
	}
	public static int Main()
	{
		int[] TianJi = new int[1005];
		int[] QiKing = new int[1005];
		int nHorses;
		int silver;
		while ((nHorses != 0 && nHorses = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			silver = 0;
			for (int i = 0; i < nHorses; i++)
			{
				TianJi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(TianJi, nHorses, (Integer.SIZE / Byte.SIZE), Cmp);
			for (int i = 0; i < nHorses; i++)
			{
				QiKing[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(QiKing, nHorses, (Integer.SIZE / Byte.SIZE), Cmp);
			int Head = 0;
			int Tail = nHorses - 1;
			for (int i = 0; i < nHorses; i++)
			{
				if (TianJi[Head] > QiKing[i])
				{
					Head++;
					silver += 200;
					continue;
				}
				if (TianJi[Head] < QiKing[i])
				{
					Tail--;
					silver -= 200;
					continue;
				}
				if (i == nHorses - 1)
				{
					break;
				}
				int sum1 = 0;
				int sum2 = -200;
				for (int j = i + 1; j < nHorses; j++)
				{
					if (TianJi[Head + j - i] > QiKing[j])
					{
						sum1 += 200;
					}
					else
					{
					if (TianJi[Head + j - i] < QiKing[j])
					{
						sum1 -= 200;
					}
					}

					if (TianJi[Head + j - i - 1] > QiKing[j])
					{
						sum2 += 200;
					}
					else
					{
					if (TianJi[Head + j - i - 1] < QiKing[j])
					{
						sum2 -= 200;
					}
					}
				}
				if (sum1 > sum2)
				{
					Head++;
					continue;
				}
				else
				{
					Tail--;
					silver -= 200;
				}
			}
			System.out.print(silver);
			System.out.print("\n");
		}
	}

}

