package <missing>;

public class GlobalMembers
{
	public static int Mycompare(Object p1, Object p2)
	{
		return *((int)p2) - (int)p1;
	}
	public static int Main()
	{
		int horseNum;
		int[] Thorse = new int[1000];
		int[] Qhorse = new int[1000];
		int i;
		int Th;
		int Tt;
		int Qh;
		int Qt;
		int sum;
		while ((horseNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (horseNum == 0)
			{
				break;
			}
			for (i = 0; i < horseNum; i++)
			{
				Thorse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < horseNum; i++)
			{
				Qhorse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(Thorse, horseNum, (Integer.SIZE / Byte.SIZE), Mycompare);
			qsort(Qhorse, horseNum, (Integer.SIZE / Byte.SIZE), Mycompare);
			Th = Qh = 0;
			Tt = Qt = horseNum - 1;
			sum = 0;
			while (Th <= Tt)
			{
				if (Thorse[Th] > Qhorse[Qh])
				{
					sum = sum + 200;
					Th = Th + 1;
					Qh = Qh + 1;
				}
				else if (Thorse[Th] < Qhorse[Qh])
				{
					sum = sum - 200;
					Qh = Qh + 1;
					Tt = Tt - 1;
				}
				else
				{
					if (Thorse[Tt] > Qhorse[Qt])
					{
						sum = sum + 200;
						Tt = Tt - 1;
						Qt = Qt - 1;
					}
					else
					{
						if (Thorse[Tt] < Qhorse[Qh])
						{
							sum = sum - 200;
							Tt = Tt - 1;
							Qh = Qh + 1;
						}
						else
						{
							Tt = Tt - 1;
							Qh = Qh + 1;
						}
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

