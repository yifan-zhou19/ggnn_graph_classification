package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //???
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{ //while???????????
			int m; //?????
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				int[] count = new int[m]; //????????????????????
				for (int i = 0;i < m;i++)
				{
					count[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				while (true)
				{
				if (count[m - 1] + 3 * m <= 60)
				{
					System.out.print(60 - 3 * m);
					System.out.print("\n");
					break;
				}
				if (count[m - 1] + 3 * m >= 63)
				{ //????????????????
					m--;
					continue;
				}
				else
				{
					System.out.print(60 - 3 * m + (count[m - 1] + 3 * m - 60));
					System.out.print("\n");
					break;
				}
				}
			}
			n--;
		}
		return 0; //?????????????????
	}
}

