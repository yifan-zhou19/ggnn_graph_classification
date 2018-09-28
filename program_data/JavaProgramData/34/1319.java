package <missing>;

public class GlobalMembers
{
	/*
	 * T1.cpp
	 *
	 *  Created on: 2012-11-18
	 *      Author: weiwan
	 *      Function:????
	 */

	public static int guess(int a) //????
	{
		int ans;
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		} //????????
		if (a % 2 != 0) //????��
		{
			ans = a * 3 + 1;
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(ans);
			System.out.print("\n");
			guess(ans); //??????
		}
		if (a % 2 == 0) //????��
		{
			ans = a / 2;
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(ans);
			System.out.print("\n");
			guess(ans); //??????
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		guess(n);
		return 0;
	}
}

