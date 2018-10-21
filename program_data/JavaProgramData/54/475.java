package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : POJ3.cpp
	// Author      : Liang ShiYu
	// Version     : 1.0
	// Copyright   : copyright reserved
	// Description : Homework
	// Date        : 2010-11-20
	//============================================================================


	public static int Main()
	{
		int n; //????
		int k;
		int i;
		int i2;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i2 = 1;;i2++)
		{ //????
			i = i2;
			for (j = 0;j < n;j++)
			{ //????
				if (i % (n - 1) != 0)
				{
					break;
				}
				i = i * n / (n - 1) + k;
			}
			if (j == n)
			{
				System.out.print(i);
				return 0;
			}
			else
			{
				continue;
			}
		}
		return 0;
	}

}

