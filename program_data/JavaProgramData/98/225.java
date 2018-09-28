package <missing>;

public class GlobalMembers
{
	/*
	 * qm2.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[n][100];
		int i;
		for (i = 0;i < n;i++)
		{
			*(word + i) = ConsoleInput.readToWhiteSpace(true);
		}
		int k;
		int l = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			k += String.valueOf(*(word + i)).length() + 1;
			if (k + String.valueOf(*(word + i + 1)).length() > 80)
			{
				l++;
				System.out.print((word + i));
				System.out.print("\n");
				k = 0;
			}
			else if (l == n - 1)
			{
				System.out.print((word + i));
			}
			else
			{
			System.out.print((word + i));
			System.out.print(" ");
			l++;
			}
		}
		return 0;
	}

}

