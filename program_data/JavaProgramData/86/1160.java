package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			int tiaoHuai;
			tiaoHuai = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (tiaoHuai == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}

			int[] leiJi = new int[tiaoHuai];
			for (j = 0; j < tiaoHuai; j++)
			{
				leiJi[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			for (j = 0; j < tiaoHuai; j++)
			{
				if (leiJi[j] + 3 * (j + 1) > 60)
				{
					if (leiJi[j] + 3 * j <= 60)
					{
						System.out.print(leiJi[j]);
						System.out.print("\n");
						break;
					}
					else
					{
						System.out.print(60 - 3 * j);
						System.out.print("\n");
						break;
					}
				}
			}

			if (j == tiaoHuai)
			{
				System.out.print(60 - 3 * tiaoHuai);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

