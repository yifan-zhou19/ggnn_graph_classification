package <missing>;

public class GlobalMembers
{
	public static int CMP(Object ele1, Object ele2)
	{
		return *((int)ele2) - (int)ele1;
	}

	public static int Main()
	{
		int n;
		int i;
		int counter;
		int qiwangleft;
		int qiwangright;
		int tianjileft;
		int tianjiright;
		int[] tianji = new int[1006];
		int[] qiwang = new int[1006];
		int ans;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tianji,n,(Integer.SIZE / Byte.SIZE),CMP);
			qsort(qiwang,n,(Integer.SIZE / Byte.SIZE),CMP);

			qiwangleft = 0;
			tianjileft = 0;
			qiwangright = n - 1;
			tianjiright = n - 1;
			counter = 0;
			ans = 0;
			while (counter != n)
			{
				counter++;
				if (qiwang[qiwangleft] < tianji[tianjileft])
				{
					qiwangleft++;
					tianjileft++;
					ans += 200;
				}
				else if (qiwang[qiwangleft] == tianji[tianjileft])
				{
					if (qiwang[qiwangright] < tianji[tianjiright])
					{
						ans += 200;
						qiwangright--;
						tianjiright--;
					}
					else
					{
						if (qiwang[qiwangleft] > tianji[tianjiright])
						{
							ans -= 200;
						}
						qiwangleft++;
						tianjiright--;
					}
				}
				else
				{
					ans -= 200;
					qiwangleft++;
					tianjiright--;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

