package <missing>;

public class GlobalMembers
{
	public static int myCompare(Object int_a, Object int_b)
	{
		return *(int)int_b - (int)int_a;
	}

	public static int Main()
	{
		int n;
		int i;
		int[] QiWang;
		int[] TianJi;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * QFast;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * TFast;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * QSlow;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * TSlow;
		int countWin;

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
			if (((QiWang = new int[n]) == null) || ((TianJi = new int[n]) == null))
			{
				System.out.print("Error: memory out! (1)/n");
				System.exit(-1);
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					TianJi[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					QiWang[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(TianJi, n, (Integer.SIZE / Byte.SIZE), myCompare);
			qsort(QiWang, n, (Integer.SIZE / Byte.SIZE), myCompare);

			TFast = TianJi;
			QFast = QiWang;
			TSlow = TianJi + n - 1;
			QSlow = QiWang + n - 1;

			countWin = 0;
			while (true)
			{
				if (*TSlow < *QSlow)
				{
					countWin--;
					TSlow--;
					QFast++;
				}
				else if (*TSlow > *QSlow)
				{
					countWin++;
					TSlow--;
					QSlow--;
				}
				else
				{
					if (TFast != TSlow)
					{
						if (*TFast < *QFast)
						{
							countWin--;
							QFast++;
							TSlow--;
						}
						else if (*TFast == *QFast)
						{
							if (*QFast > *TSlow)
							{
								countWin--;
							}
							QFast++;
							TSlow--;
						}
						else
						{
							countWin++;
							QFast++;
							TFast++;
						}
					}
					else
					{
						break;
					}
				}
				if (TFast > TSlow)
				{
					break;
				}
			}
			System.out.printf("%d\n", 200 * countWin);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(TianJi);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(QiWang);
		}

		return 0;
	}
}

