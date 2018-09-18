package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   1.cpp                             *
	 *@author ??                              *
	 *@date   2013-10-27                        *
	 *@description                              *
	 *??????6???                       *
	 ********************************************
	 */
	public static int Main()
	{
		int[] num = new int[101];
		int number;
		int i;
		int j;
		int count = 0;
		while (true)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number == -1)
			{
				break;
			}
			for (i = 1; ; i++)
			{
				num[0] = number;
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 0; j < i; j++)
				{
					if (num[j] > num[i] && num[j] == (num[i] * 2))
					{
						count++;
					}
					if (num[i] > num[j] && num[i] == (num[j] * 2))
					{
						count++;
					}
				}
				if (num[i] == 0)
				{
					break;
				}
			}
			System.out.print(count);
			System.out.print("\n");
			count = 0;
		}
		return 0;
	}
}

