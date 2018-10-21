package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3 ; i < ((m / 2) + 1) ; i += 2)
		{
			for (int j = 3 ; j <= m - i ; j += 2)
			{
				if ((i % j == 0) || ((m - i) % j == 0))
				{
					if (j != i)
					{
					break;
					}
				}
				if (j >= (m - i - 2))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(m - i);
					System.out.print("\n");
					break;
				}
			}
		}

		return 0;
	}
}

