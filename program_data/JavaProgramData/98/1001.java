package <missing>;

public class GlobalMembers
{
	// ??????.cpp : ??????????????
	//
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String word = new String(new char[40]);
		int num = 0;
		while ((word = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if ((num + word.length() + 1) < 80)
			{
				if (num != 0)
				{
					System.out.print(' ');
					num = num + 1;
				}
				System.out.print(word);
				num = num + word.length();
			}
			else if ((num + word.length() + 1) == 80)
			{
				System.out.print(' ');
				System.out.print(word);
				System.out.print("\n");
				num = 0;
			}
			else
			{
				num = 0;
				System.out.print("\n");
				System.out.print(word);
				num = num + word.length();
			}

		}

			return 0;
	}


}

