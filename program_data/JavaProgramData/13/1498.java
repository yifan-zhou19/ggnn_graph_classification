package <missing>;

public class GlobalMembers
{
	/*
	 * repeatnumber.cpp
	 *
	 *  Created on: 2012-11-16
	 *      Author: ???
	 */

	public static int Main()
	{
		int n; //??int???
		int i;
		int j = 2;
		int m;
		int[] a = new int[20010]; //????????
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[1] = a[1];
		for (i = 2; i <= n; i++)
		{
			for (m = 1; m <= i - 1; m++)
			{
				if (a[m] == a[i])
				{
					break; //??a[m]??a[i]???????
				}
			}
			if (m == i)
			{
				b[j] = a[i];
				j++;
			} //?m??i??b[j]??a[i]
		}
		for (i = 1; i <= j - 1; i++)
		{
			if (i < j - 1)
			{
				System.out.print(b[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(b[i]);
			}
		} //?b[100]??????????
		return 0;
	}


}

