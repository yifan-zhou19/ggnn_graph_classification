package <missing>;

public class GlobalMembers
{
	/*
	 * word.cpp
	 *
	 *  Created on: 2011-12-11
	 *      Author: wangshiheng
	 */

	public static int Main()
	{
		String words = new String(new char[41]);
		int s = -1;
		int l;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			words = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = words.length();
				if (s == -1)
				{
					s = l + s + 1;
					System.out.print(words);
				}
				else if (s + l + 1 <= 80)
				{
					s = l + s + 1;
					System.out.print(' ');
					System.out.print(words);
				}
				else
				{
					s = l;
					System.out.print("\n");
					System.out.print(words);
				}
		}

		return 0;
	}

}

