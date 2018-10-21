package <missing>;

public class GlobalMembers
{
	/*
	 * qz05.cpp
	 *
	 *  Created on: 2010-11-16
	 *      Author: ??
	 */
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if ((i % 7 == 0) || ((i % 10 != 0) && ((i % 10) % 7 == 0)) || (((i - i % 10) > 0) && ((i - i % 10) % 7 == 0)))
			{
				continue; //???7????
			}
			else
			{
				sum = sum + i * i; //???7????????
			}
		}
		System.out.print(sum);
		return 0;
	}

}

