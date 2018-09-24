package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2012-10-19
	 *      Author: ??
	 *      ?????????a?????
	 */


	public static int Main()
	{
		int[] a = new int[21]; //????a[21]
		int i = 0; //????
		int j = 0;
		int n = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[1] = 1;
		a[2] = 1; //?a[1],a[2]????

		for (i = 3; i <= 20 ;i++)
		{
			a[i] = a[i - 1] + a[i - 2]; //?a[i]????
		}

		for (j = 1; j <= n ;j++)
		{
			  i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[i]);
			System.out.print("\n");
		} //??n???

		return 0;
	}

}

