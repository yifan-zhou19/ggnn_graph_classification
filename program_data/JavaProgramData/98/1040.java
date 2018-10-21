package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s = 0;
		char[][] p =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		for (int i = 0; i < n; i++)
		{
			int j = 0;
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
			while (*(*(p + i) + j) != 0)
			{ //?????????
				s++;
				j++;
			}
			s++;
			if (i < n - 1 && i != 0)
			{ //??
				if (s < 82)
				{
					System.out.print((p + i - 1));
					System.out.print(' ');
				}
				else
				{

					System.out.print((p + i - 1));
					System.out.print("\n");
					s = j + 1;
				}
			}
			else if (i == n - 1)
			{
				if (s < 82)
				{
					System.out.print((p + i - 1));
					System.out.print(' ');
					System.out.print((p + i));
				}
				else
				{
					System.out.print((p + i - 1));
					System.out.print("\n");
					System.out.print((p + i));
				}
			}

		}
		return 0;
	}

}

