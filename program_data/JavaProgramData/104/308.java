package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2010-11-23
	 *      Author: acer
	 */

	public static int Main()
	{
		int a; //ab?????????ij??????????
		int b;
		int i = 0;
		int j = 0;
		int k;
		int[] a_line = new int[20]; //?????????ab???
		int[] b_line = new int[20];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 0) //?????
		{
			a_line[i] = a;
			a = a / 2;
			i++;
		}
		while (b != 0)
		{
			b_line[j] = b;
			b = b / 2;
			j++;
		}
		if (i > j) //??ab???????
		{
			for (k = 0;k < j;k++)
			{
				if (a_line[i - j + k] == b_line[k]) //????????????????Break
				{
					System.out.print(b_line[k]);
					break;
				}
			}
		}
		else //???????
		{
			for (k = 0;k < j;k++)
			{
				if (b_line[j - i + k] == a_line[k])
				{
					System.out.print(a_line[k]);
					break;
				}
			}
		}
		return 0;
	}

}

