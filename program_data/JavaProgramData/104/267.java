package <missing>;

public class GlobalMembers
{
	/****************************************************
	 * dt03.cpp											*
	 *													*
	 *  Created on: 2010-11-22							*
	 *      Author: Administrator						*
	 ****************************************************/
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10]; //??????
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 1;
		int j = 1;
		while (true) //?????????????????????????
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
			if (a[i] == 1)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		while (true) //?????????????????????????
		{
			if (b[j - 1] % 2 == 0)
			{
				b[j] = b[j - 1] / 2;
			}
			else
			{
				b[j] = (b[j - 1] - 1) / 2;
			}
			if (b[j] == 1)
			{
				break;
			}
			else
			{
				j++;
			}
		}
		while (i >= 0 && j >= 0) //?????????
		{
			if (a[i] == b[j])
			{
				i--;
				j--;
			}
			else
			{
				break;
			}
		}
		System.out.print(a[i + 1]);
		return 0;
	}

}

