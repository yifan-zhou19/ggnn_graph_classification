package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int number = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		char[][] a = new char[n][50];
		for (int i = 0;i <= n - 1;++i)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i <= n - 1;++i)
		{
			if (number + String.valueOf(*(a + i)).length() <= 80)
			{
				if (i == 0)
				{
					System.out.print((a + i));
				}
				if (i != 0)
				{
					System.out.print(' ');
					System.out.print((a + i));
				}
				number += 1 + String.valueOf(*(a + i)).length();
			}
			else
			{
				number = 0;
				System.out.print("\n");
				System.out.print((a + i));
				number += 1 + String.valueOf(*(a + i)).length();
			}
		}
		return 0;
	}
}

