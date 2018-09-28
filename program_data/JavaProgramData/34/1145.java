package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogu.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: 11161
	 */

	public static int jiaogu(int n)
	{
		int result;
		if (n % 2 == 1)
		{
			result = n * 3 + 1;
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(result);
			System.out.print("\n");
		}
		else
		{
			result = n / 2;
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(result);
			System.out.print("\n");
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		else
		{
		num = n;
		}
		while (true)
		{
			num = jiaogu(num);
			if (num == 1)
			{
				break;
			}
		}
		System.out.print("End");
		System.out.print("\n");

	}

}

