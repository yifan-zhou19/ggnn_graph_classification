package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int current;
		int lost;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			lost = 0;
			for (j = 0; j < m; ++j)
			{

				current = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((lost + current) < 60)
				{
					if (60 - current - lost > 3)
					{
					lost += 3;
					}
					else
					{
					lost = 60 - current;
					}
				}
			}
			System.out.print(60 - lost);
			System.out.print("\n");
		}
		return 0;
	}

}

