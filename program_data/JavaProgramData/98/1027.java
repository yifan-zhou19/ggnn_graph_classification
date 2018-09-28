package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */

	public static int Main()
	{
		char[][] a = new char[1000][41];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int s = 0;
		for (int i = 0; i < n; i++)
		{
			s += String.valueOf(*(a + i)).length() + 1;
			if (s > 81)
			{
				s = 0;
				System.out.print("\n");
				i--;
				continue;
			}
			else
			{
				System.out.print((*(a + i)));
				if (i != n - 1 && s + String.valueOf(*(a + i + 1)).length() <= 80)
				{
					System.out.print(" ");
				}
			}
		}
	}

}

