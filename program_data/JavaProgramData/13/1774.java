package <missing>;

public class GlobalMembers
{
	/*
	 * print different numbers.cpp
	 *
	 *  Created on: 2013-10-28
	 *      Author: kongwei
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] array = new int[n]; //????
		for (int i = 0;i <= n - 1;i++) //????
		{
			array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(array[0]);
		for (int i = 1;i <= n - 1;i++) //??????????
		{
			int g = 0; //?????g,?????0
			for (int j = 0;j <= i - 1;j++) //???????????????????????
			{
				if (array[i] == array[j])
				{
					g = g + 1;
				}
			}
			if (g == 0)
			{
				System.out.print(" ");
				System.out.print(array[i]);
			}
		}
		return 0;
	}
}

