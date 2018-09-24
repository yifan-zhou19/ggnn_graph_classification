package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-10-21
	 *      Author: 1100012797
	 */
	public static int Main()
	{

		int n;
		int no;
		int cal;
		cal = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		no = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int k = 0;k < n - cal;k++)
		{
			while ((a[k] == no) && (k != n - cal - 1))
			{
				for (int j = k;j < n - cal - 1;j++)
				{
					a[j] = a[j + 1];
				}
				cal++;

			}
			if ((k == n - cal - 1) && (a[k] == no))
			{
				cal++;
			}
		}

		for (int m = 0;m < n - cal - 1;m++)
		{
			System.out.print(a[m]);
			System.out.print(" ");
		}
		System.out.print(a[n - cal - 1]);
		System.out.print("\n");

		return 0;

	}

}

