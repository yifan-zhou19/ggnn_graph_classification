package <missing>;

public class GlobalMembers
{
	/*
	 * homework2.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: Lixurong
	 */


	public static int Main()
	{
		char[][] a = new char[100][100];
		int i = 0;
		while ((a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //????
		{
			char c;
			cin.get(c);
			if (c == '\n') //????????????
			{
				break;
			}
			i++;
		}
		for (i - 1; i >= 0; i--) //????
		{
			System.out.print(a[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

