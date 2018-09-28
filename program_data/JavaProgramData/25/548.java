package <missing>;

public class GlobalMembers
{
	/*
	 * 2mi.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[100];
		int j;
		for (i = 0;i < 100;++i)
		{
			s[i] = 0;
		}
		s[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				s[j] = 2 * s[j];
			}
			for (j = 0;j < 100;j++)
			{
			if (s[j] > 9)
			{
					s[j + 1] = s[j + 1] + 1;
					s[j] = s[j] % 10;
			}
			}

		}
		for (i = 99;i >= 0;i--)
		{
			if (s[i] != 0)
			{
				break;
			}
		}

		for (j = i;j >= 0;j--)
		{
			System.out.print(s[j]);
		}
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

