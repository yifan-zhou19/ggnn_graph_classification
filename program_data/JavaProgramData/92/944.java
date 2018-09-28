package <missing>;

public class GlobalMembers
{
	public static int[] tianji = new int[1000];
	public static int[] qiwang = new int[1000];
	public static int comp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int comp = new int(const Object * a, const Object * b);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		while (n != 0)
		{
			for (i = 0; i < n; i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji,n,(Integer.SIZE / Byte.SIZE),comp);
			qsort(qiwang,n,(Integer.SIZE / Byte.SIZE),comp);
			j = 0;
			int score = 0;
			int index1 = 0;
			int index2 = n - 1;
			int index3 = 0;
			int index4 = n - 1;

			while (index1 <= index2)
			{
				if (tianji[index1] > qiwang[index3])
				{
					score = score + 200;
					index1 = index1 + 1;
					index3 = index3 + 1;
				}
				else
				{
					if (tianji[index1] < qiwang[index3])
					{
						score = score - 200;
						index3 = index3 + 1;
						index2 = index2 - 1;
					}
					else
					{
						if (tianji[index2] > qiwang[index4])
						{
							score = score + 200;
							index2 = index2 - 1;
							index4 = index4 - 1;
						}
						else
						{
							if (tianji[index2] < qiwang[index3])
							{
								score = score - 200;
								index2 = index2 - 1;
								index3 = index3 + 1;
							}
							else
							{
								break;
							}
						}
					}
				}
			}
			System.out.print(score);
			System.out.print("\n");
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

