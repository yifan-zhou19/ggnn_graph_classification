package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2010-11-24
	 *      Author: acer
	 */

	public static int Main()
	{
		int n;
		int k;
		int t = 1;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n];
		while (true) //????????????????????
		{
			apple[0] = t * n + k; //0????
			for (i = 1;i < n;i++)
			{
				if (apple[i - 1] % (n - 1) != 0)
				{ //???????????????break?
					t++;
					break;
				}
				apple[i] = apple[i - 1] * n / (n - 1) + k; //?????
			}
			if (i == n) //??????????????
			{
				System.out.print(apple[n - 1]);
				break; //????
			}
		}
		return 0;
	}

}

