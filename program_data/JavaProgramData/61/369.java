package <missing>;

public class GlobalMembers
{
	/*
	 * Fibonacci.cpp
	 *
	 *  Created on: 2012-10-17
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		int[] array = new int[20];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2;i < 20;i++)
		{
			array[i] = array[i - 1] + array[i - 2];
		} //????????
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			int p = 0;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(array[p - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

