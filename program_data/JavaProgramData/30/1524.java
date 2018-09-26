package <missing>;

public class GlobalMembers
{
	/*
	 * 123.cpp
	 *
	 *  Created on: 2012-10-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
	int n;
	int i;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		if (i % 7 != 0 && ((i / 10) % 7 != 0 && (i / 10) != 0 || (i / 10) == 0) && ((i - (i / 10) * 10) % 7 != 0 && i % 10 != 0 || i % 10 == 0))
		{
			sum = sum + i * i;
		}
	}
	System.out.print(sum);
	System.out.print("\n");
	return 0;
	}

}

