package <missing>;

public class GlobalMembers
{
	/*
	 * odd numbers.cpp
	 *
	 *  Created on: 2013-10-30
	 *      Author: kongwei
	 */
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] array = new int[N]; //????
		for (int i = 0;i <= N - 1;i++) //????
		{
			array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int g = 0; //????????????????
		int[] odd = new int[N]; //?????????????
		for (int i = 0;i <= N - 1;i++)
		{
			if (array[i] % 2 == 1)
			{
				g += 1; //??array[i]?2???????????????
				odd[g] = array[i]; //??????????
			}
		}
		for (int i = 1;i <= g - 1;i++) //??????????
		{
			for (int j = 1;j <= g - i;j++)
			{
				int t = 0; //??????
				if (odd[j] > odd[j + 1])
				{
					t = odd[j];
					odd[j] = odd[j + 1];
					odd[j + 1] = t;
				}
			}
		}
		for (int i = 1;i <= g;i++) //??????????
		{
			if (i == 1)
			{
				System.out.print(odd[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(odd[i]);
			}
		}

		return 0;
	}
}

