package <missing>;

public class GlobalMembers
{
	/*
	 * ?7???????.cpp
	 *
	 *  Created on: 2010-11-19
	 *      Author: taoshibo
	 */
	public static int Main()
	{
		int n; //????n?????i?????sum
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
		for (i = 1;i < n + 1;i++)
		{ //???????
			if ((i % 7 == 0) || (i % 10 == 7) || i / 10 == 7) //??i?7??????0
			{
				a[i] = 0;
			}
			else
			{
				a[i] = i * i; //???????????
			}
		}
		for (i = 1;i < n + 1;i++) //???????
		{
			sum = sum + a[i];
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

