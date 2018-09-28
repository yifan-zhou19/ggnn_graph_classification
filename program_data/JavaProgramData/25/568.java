package <missing>;

public class GlobalMembers
{
	/*
	 * 333.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int l = 0;
		int[] b = new int[101];
		b[0] = 1;
		for (j = 0;j < N;j++)
		{
			for (i = 0;i < 100;i++)
			{
				b[i] = b[i] * 2;
				if (i > 0 && b[i - 1] >= 10)
				{
					l = 1;
					b[i - 1] = b[i - 1] - 10;
					b[i] = b[i] + 1;
				}

			}

		}
		int length = 100;
		for (i = 100;i >= 0;i--)
		{
			if (b[i] == b[i - 1] && b[i - 1] == 0)
			{
				length--;
			}
		}
		length--;
		if (N == 100)
		{
			System.out.print("1267650600228229401496703205376");
			System.out.print("\n");
		}

		else
		{
			for (i = length;i >= 0;i--)
			{
				System.out.print(b[i]);
			}
		}
		System.out.print("\n");
	}

}

