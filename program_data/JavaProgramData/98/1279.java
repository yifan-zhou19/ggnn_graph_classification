package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2013-1-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		char[][] word = new char[1000][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 1; i <= n; i++)
		{
			System.out.print(word[i]);
			sum += String.valueOf(word[i]).length();
			if (i < n && sum + String.valueOf(word[i + 1]).length() + 1 <= 80)
			{
				System.out.print(" ");
				sum++;
			}
			else
			{
				System.out.print("\n");
				sum = 0;
			}

		}
		return 0;
	}


}

