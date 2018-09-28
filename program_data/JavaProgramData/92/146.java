package <missing>;

public class GlobalMembers
{
	public static int MyCmp(Object x, Object y)
	{
		return *((int)y) - (int)x;
	}

	public static int Main()
	{
		int HorseNum;
		int i;
		int WinMatch;
		int LoseMatch;
		int TianLastHorse;
		int TianFirstHorse;
		int QiFirstHorse;
		int QiLastHorse;
		int[] TianHorse = new int[1001];
		int[] QiHorse = new int[1001];
		while ((HorseNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (0 == HorseNum)
			{
				break;
			}
			for (i = 1;i <= HorseNum;i++)
			{
				TianHorse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 1;i <= HorseNum;i++)
			{
				QiHorse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(TianHorse+1,HorseNum,(Integer.SIZE / Byte.SIZE),MyCmp);
			qsort(QiHorse+1,HorseNum,(Integer.SIZE / Byte.SIZE),MyCmp);
			//TianHorse QiHorse ?????
			TianLastHorse = QiLastHorse = HorseNum;
			TianFirstHorse = QiFirstHorse = 1;
			WinMatch = LoseMatch = 0;
			while (TianFirstHorse <= TianLastHorse)
			{
				if (TianHorse[TianFirstHorse] > QiHorse[QiFirstHorse])
				{
					WinMatch++;
					TianFirstHorse++;
					QiFirstHorse++;
				}
				else if (TianHorse[TianFirstHorse] < QiHorse[QiFirstHorse])
				{
					//tian????????qi????
					LoseMatch++;
					TianLastHorse--;
					QiFirstHorse++;
				}
				else
				{
					//??????
					if (TianHorse[TianLastHorse] > QiHorse[QiLastHorse])
					{
						//??????
						WinMatch++;
						TianLastHorse--;
						QiLastHorse--;
					}
					else
					{
						//????????
						if (TianHorse[TianLastHorse] < QiHorse[QiFirstHorse])
						{
							LoseMatch++;
						}
						TianLastHorse--;
						QiFirstHorse++;
					}
				}
			}
			/*if( QiHorse[QiFirstHorse] < TianHorse[TianFirstHorse] )
				WinMatch ++;
			if( QiHorse[QiFirstHorse] > TianHorse[TianFirstHorse] )
				LoseMatch ++;*/
			System.out.print((WinMatch - LoseMatch) * 200);
			System.out.print("\n");
		}
		return 0;
	}
















}

