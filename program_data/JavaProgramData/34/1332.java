package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2012-11-28
	 *      Author: Lenovo
	 */
	public static void f(int n)
	{

		if (n == 1)
		{
			return;
		}
		if (n == 2)
		{
			System.out.print("2/2=1");
			System.out.print("\n");
			return;
		}
		else
		{
			if ((n % 2) == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(3 * n + 1);
				System.out.print("\n");
				n = 3 * n + 1;
				f(n);
			}
			else
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
				f(n);
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
		System.out.print("End");
		return 0;
	}


}

