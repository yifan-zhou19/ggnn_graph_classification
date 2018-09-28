package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012910_25.cpp
	 *
	 *  Created on: 2010-10-29
	 *      Author: 10298
	 */
	public static int Main()
	{
		int n; //????????t?????????
		int i;
		int j;
		int l;
		int t = 0;
		int b;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] a = new int[n]; //????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (j = 0;j < n - t - 1;j++) //?????
	{
		if (a[j] == k) //???a?j?????k
		{
			for (l = j;l < n - 1;l++) //??????a?j?
			{
				a[l] = a[l + 1];
			}
			j = j - 1; //?????????????
			t = t + 1; //???????

		}

	}
	if (a[n - t - 1] == k)
	{
		t = t + 1; //????????k????????????????
	}
		for (b = 0;b < n - t - 1;b++)
		{
			System.out.print(a[b]);
			System.out.print(" ");
		}
		System.out.print(a[n - t - 1]);
		System.out.print("\n");
		return 0;

	}

}

