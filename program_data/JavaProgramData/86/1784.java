package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int c = 0;
			int cmc;
			int m;
			int cmc1;
			int time = 0;
			int q = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			continue;
			}
			for (int j = 0;j < m;j++)
			{
				if (q == 1)
				{
						cmc1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						continue;
				}
				cmc = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (time + cmc >= 60 && q != 1)
				{
					cmc = 60 - time;
					q = 1;
				}
				else if (time + cmc >= 57 && q != 1)
				{
					q = 1;
				}
				if (q == 1)
				{
					continue;
				}
				time = time+3;
			}
			if (q == 0)
			{
				cmc = 60 - time;
			}
			System.out.print(cmc);
			System.out.print("\n");
		}

		return 0;
	}
}

