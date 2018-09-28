package <missing>;

public class GlobalMembers
{
	/*
	 * OddNumbers.cpp
	 *
	 *  Created on: 2012-11-5
	 *  Author: ??
	 *  ??????????N????500???????????????????????????
	 */


	public static int Main()
	{
		int n; //??????n???x
		int x;
		int[] a = new int[550]; //?????????
		int k = 0; //???????????????
		int temp;
		int judge = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 == 1) //?????
			{
				a[k] = x; //????
				k++;
			}
		}
		for (int j1 = 0 ; j1 < k - 2 ; j1++)
		{
			for (int j = 0 ; j < k - 1 - j1 ; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp; //?????????
				}
			}
		}
		for (int i1 = 0 ; i1 < k ; i1++)
		{
			if (judge == 1)
			{
				System.out.print(",");
				System.out.print(a[i1]);
			}
			if (judge == 0)
			{
				System.out.print(a[0]);
				judge = 1; //??a[0]????
			}
		}
		System.out.print("\n");
		return 0; //??
	}

}

