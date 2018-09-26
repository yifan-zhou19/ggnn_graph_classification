package <missing>;

public class GlobalMembers
{
	/*
	 * first.cpp
	 *
	 *  Created on: 2012-9-17
	 *      Author: 120017625 ashley
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		int j;
		int num_odd;
		int input;
		num_odd = 0;
		for (i = 1;i <= n;i++) //??????????? ????????
		{
			input = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (input % 2 == 1)
			{
				num_odd = num_odd + 1; //num_odd????????
				a[num_odd] = input;
			}
		}
		for (i = 1;i <= num_odd;i++) //??????
		{
			for (j = 1;j < num_odd;j++)
			{
				if (a[j] > a[j + 1])
				{
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}
		for (i = 1;i <= num_odd;i++)
		{
			if (i != num_odd)
			{
				System.out.print(a[i]);
				System.out.print(',');
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

