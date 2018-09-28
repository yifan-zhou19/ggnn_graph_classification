package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l = 0;
		int i;
		int n;
		char[][] word = new char[1500][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*(word + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n - 1;i++)
		{
			if (l + String.valueOf(*(word + i)).length() == 80)
			{
				l = 0;
				System.out.print((word + i));
				System.out.print("\n");
			}
			else if (l + String.valueOf(*(word + i)).length() < 80)
			{
				if (l + String.valueOf(*(word + i)).length() + 1 + String.valueOf(*(word + i + 1)).length() <= 80)
				{
					System.out.print((word + i));
					System.out.print(' ');
					l = l + String.valueOf(*(word + i)).length() + 1;
				}
				else
				{
					System.out.print((word + i));
					System.out.print("\n");
					l = 0;
				}
			}
		}
		System.out.print((word + i));
		return 0;
	}






}

