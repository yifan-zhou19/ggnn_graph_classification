package <missing>;

public class GlobalMembers
{
	/*
	 * shanchushuzu.cpp
	 *
	 *  Created on: 2012-10-31
	 *      Author: ??
	 *      ????????
	 */



	public static int Main()
	{
		int[] a = new int[100010]; //????
		int i = 0;
		int n = 0;
		int k = 0;
		int j = 0;
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{ //????
			if (a[i] == k)
			{
				b++;
				if (i != (n - b + 1))
				{ //?a[i]???????
					for (j = i; j <= (n - b); j++)
					{
						a[j] = a[j + 1];
					}
					i--; //????
				}
				else
				{
					break; //????
				}
			}
		}
		System.out.print(a[1]);
		for (i = 2; i <= (n - b); i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}

		return 0;
	}

}

