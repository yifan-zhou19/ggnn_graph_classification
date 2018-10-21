package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		return ((int)elem1 - (int)elem2);
	}

	public static int Main()
	{
		int n;
		int[] TJ = new int[2001];
		int[] QW = new int[2001];

		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (int i = 0; i < n; i++)
			{
				TJ[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				QW[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(TJ, n, (Integer.SIZE / Byte.SIZE), compare);
			qsort(QW, n, (Integer.SIZE / Byte.SIZE), compare);

			int Tslow;
			int Tfast;
			int Qslow;
			int Qfast;
			Tslow = Qslow = 0;
			Tfast = Qfast = n - 1;

			int bonus = 0;

			while (Tslow <= Tfast != 0 && Qslow <= Qfast)
			{
				if (TJ[Tfast] > QW[Qfast])
				{
					Tfast--;
					Qfast--;
					bonus++;
				}
				else if (TJ[Tfast] < QW[Qfast])
				{
					Tslow++;
					Qfast--;
					if (TJ[Tslow - 1] < QW[Qfast + 1])
					{
						bonus--;
					}
				}
				else
				{
					while (Tslow <= Tfast != 0 && Qslow <= Qfast)
					{
						if (TJ[Tslow] > QW[Qslow])
						{
							Tslow++;
							Qslow++;
							bonus++;
						}
						else
						{
							Tslow++;
							Qfast--;
							if (TJ[Tslow - 1] < QW[Qfast + 1])
							{
								bonus--;
							}
							break;
						}
					}
				}
			}
			System.out.print(bonus * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

