package <missing>;

public class GlobalMembers
{
	/*
	 * opkp.cpp
	 *
	 *  Created on: 2012-10-24
	 *      Author: 1234
	 */
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int[] m = new int[50];
		a = b = c = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < n;j++)
		{
			m[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = b = 1;
			for (int i = 0;i < m[j] - 2;i++)
			{
					c = b;
					b = a + b;
					a = c;
			}
			System.out.print(b);
			System.out.print("\n");
		}
	}




}

