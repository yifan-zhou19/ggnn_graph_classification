package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		char[][] a = new char[1000][41];
		int n;
		int i;
		int k = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
			if (k == -1)
			{
				System.out.print((a + i));
			}
			k = k + String.valueOf(*(a + i)).length() + 1;
			if (k <= 80 && k != String.valueOf(*(a + i)).length())
			{
				System.out.print(" ");
				System.out.print((a + i));
			}
			else if (k > 80)
			{
				System.out.print("\n");
				System.out.print((a + i));
				k = String.valueOf(*(a + i)).length();
			}
		}
		return 0;
	}

}

