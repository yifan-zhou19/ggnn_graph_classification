package <missing>;

public class GlobalMembers
{
	/*
	 * mm.cpp
	 *
	 *  Created on: 2012-11-18
	 *      Author: ada
	 */
	public static void get_array(int[] a)
	{

		int n1;
		int n2;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n1 ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0 ; i < n1 - 1 ; i++) //????
		{
			for (int j = 0 ; j < n1 - 1 - i ; j++)
			{
				if (a[j] > a[j + 1])
				{
					int tmp;
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.print(a[0]);
		for (int i = 1 ; i < n1 ; i++)
		{
				System.out.print(" ");
				System.out.print(a[i]);
		}
		for (int i = 0 ; i < n2 ; i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
			for (int i = 0 ; i < n2 - 1 ; i++) //????
			{
				for (int j = 0 ; j < n2 - 1 - i ; j++)
				{
					if (a[j] > a[j + 1])
					{
						int tmp;
						tmp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = tmp;
					}
				}
			}
			for (int i = 0 ; i < n2 ; i++)
			{
					System.out.print(" ");
					System.out.print(a[i]);
			}
		return;
	}
	public static int[] a = new int[101];
	public static int Main()
	{

		get_array(a);

	}

}

