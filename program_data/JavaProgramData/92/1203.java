package <missing>;

public class GlobalMembers
{
	public static int[] tianji = new int[1000];
	public static int[] qiwang = new int[1000];

	public static int Main()
	{
		int n;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i;
			int j;
			for (i = 0;i < n;i++)
			{

				tianji[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qiwang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tianji,tianji + n);
			sort(qiwang,qiwang + n);
			int money = 0;
			i = 0,j = n - 1;
			int k = i;
			int l = j;
			while (true)
			{
				while (tianji[i] > qiwang[k] && i <= j)
				{
					money += 200;
					i++;
					k++;
				}
				while (tianji[j] > qiwang[l] && j >= i)
				{
					money += 200;
					j--;
					l--;
				}
				if (i > j)
				{
					break;
				}
				else
				{
					if (tianji[i] != qiwang[l])
					{
						money -= 200;
					}
					i++;
					l--;
				}
			}
			System.out.print(money);
			System.out.print("\n");
		}
		return 0;
	}
}

