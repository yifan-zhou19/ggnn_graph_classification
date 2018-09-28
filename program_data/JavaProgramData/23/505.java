package <missing>;

public class GlobalMembers
{
	/*
	 * ttttt.cpp
	 *
	 *  Created on: 2012-11-19
	 *      Author: 1234
	 */

	public static int Main()
	{
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char temp;
		int i = 0;
		int j = 0;
		while (true)
		{
			cin.get(temp);
			if (temp == ' ')
			{
				i++;
				j = 0;
			}
			else
			{
				if (temp == '\n')
				{
					break;
				}
				else
				{
					c[i][j] = temp;
					j++;
				}
			}
		}
		for (int k = i; k > 0; k--)
		{
			System.out.print(c[k]);
			System.out.print(" ");
		}
		System.out.print(c[0]);
	}

}
