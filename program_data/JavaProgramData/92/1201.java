package <missing>;

public class GlobalMembers
{
	public static void sort(tangible.RefObject<Integer> array, int max)
	{
		for (int i = 0;i < max - 1;i++)
		{
			for (int j = i + 1;j < max;j++)
			{
				if (*(array.argValue + i) < *(array.argValue + j))
				{
					int temp = (array.argValue + i);
					*(array.argValue + i) = *(array.argValue + j);
					*(array.argValue + j) = temp;
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			int[] tianji = new int[n];
			int[] qiwang = new int[n];
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tianji[i] = Integer.parseInt(tempVar2);
				}
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qiwang[i] = Integer.parseInt(tempVar3);
				}
			}
		tangible.RefObject<Integer> tempRef_tianji = new tangible.RefObject<Integer>(tianji);
			sort(tempRef_tianji, n);
			tianji = tempRef_tianji.argValue;
		tangible.RefObject<Integer> tempRef_qiwang = new tangible.RefObject<Integer>(qiwang);
			sort(tempRef_qiwang, n);
			qiwang = tempRef_qiwang.argValue;

			int tfirst = 0;
			int qfirst = 0;
			int tlast = n - 1;
			int qlast = n - 1;
			int j = 0;
			int win = 0;
			int lose = 0;

			while (j < n)
			{
				if (tianji[tfirst] > qiwang[qfirst])
				{
					win++;
					tfirst++;
					qfirst++;
				}
				else if (tianji[tfirst] < qiwang[qfirst])
				{
					lose++;
					tlast--;
					qfirst++;
				}
				else
				{
					if (tianji[tlast] > qiwang[qlast])
					{
						win++;
						tlast--;
						qlast--;
					}
					else
					{
						if (tianji[tlast] < qiwang[qfirst])
						{
							lose++;
						}
						tlast--;
						qfirst++;
					}
				}
				j++;
			}

			System.out.printf("%d\n",win * 200 - lose * 200);

			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}
}

