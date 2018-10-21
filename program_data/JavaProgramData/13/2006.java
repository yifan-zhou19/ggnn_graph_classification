package <missing>;

public class GlobalMembers
{
	/*
	 * practice.cpp
	 *
	 *  Created on: 2014-1-4
	 *      Author: 111
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] str = new int[20001];
		for (int i = 0;i < n;i++)
		{
			str[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int num = 0;
		for (int i = 1;i < n - num;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (str[j] == str[i])
				{
					for (int k = i;k < n - 1 - num;k++)
					{
						str[k] = str[k + 1];
					}
					num++;
					//cout << num << endl;
					i--;
					break;
				}
			}
		}
		System.out.print(str[0]);
		for (int i = 1;i < n - num;i++)
		{
			System.out.print(' ');
			System.out.print(str[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

