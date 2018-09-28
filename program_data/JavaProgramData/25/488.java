package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int carry = 0;
		int lenx = 1;
		int[] y = new int[405];
		int[] x = new int[405];
		x[0] = 1;
		for (m = 1;m <= n;m++)
		{
			carry = 0;
			for (i = 0;i < lenx;i++)
			{
				y[i] = 0;
			}
			for (i = 0;i < lenx;i++)
			{
				if (x[i] * 2 >= 10)
				{
					y[i] = x[i] * 2 - 10 + carry;
					carry = 1;
				}
				else
				{
					y[i] = x[i] * 2 + carry;
					carry = 0;
				}
			}
			if (carry == 1)
			{
				y[lenx] = 1;
				lenx++;
			}
			for (i = 0;i < lenx;i++)
			{
				x[i] = y[i];
			}
		}
		if (n == 0)
		{
			System.out.print('1');
		}
		else
		{
			for (m = lenx - 1;m >= 0;m--)
			{
				System.out.print(y[m]);
			}
		}
		return 0;
	}

}

