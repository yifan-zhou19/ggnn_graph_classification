package <missing>;

public class GlobalMembers
{
	/*
	 * ditui2.cpp
	 *   ???
	 *  Created on: 2010-11-20
	 *      Author: ???
	 */

	public static int Main()
	{
		int[] x = new int[1002]; //???????
		int[] y = new int[1002];
		int i; //lengthx,lengthy??x?y??????c????????
		int j;
		int lengthx = 0;
		int lengthy = 0;
		int c = 0;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 1002;i++)
		{
				x[i] = x[i - 1] / 2;
			lengthx++;
			if (x[i] == 0)
			{
				break;
			}
		}
		for (i = 1;i <= 1002;i++)
		{
				y[i] = y[i - 1] / 2;
			lengthy++;
			if (y[i] == 0)
			{
				break;
			}
		}
		for (i = 0;i <= lengthx - 1;i++)
		{
				for (j = 0;j <= lengthy - 1;j++)
				{
				if (x[i] == y[j])
				{
						c = x[i];
						break;
				}
				}
			if (c != 0)
			{
				break;
			}
		}
		System.out.print(c);
		return 0;
	}
}

