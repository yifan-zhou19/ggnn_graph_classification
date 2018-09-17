package <missing>;

public class GlobalMembers
{
	/*
	 * part.cpp
	 *
	 *  Created on: 2012-11-25
	 *      Author: Lsj
	 */

	public static int disintegerate(int a, int b) //?????a????
	{
		if (a == b || b == 1) //a b????b=1??????
		{
			return 1;
		}
		if (a > b) //a??b?b???1????0???0
		{
			return 0;
		}
		int ans = 0; //ans???
		for (int i = a; i <= b; i++) //?a?b??
		{
			if (b % i == 0) //b??????
			{
				ans = ans + disintegerate(i, b / i); //??????
			}
		}
		return ans; //??ans
	}

	public static int Main() //main??
	{
		int Time;
		Time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (Time > 0)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(disintegerate(2, n));
			System.out.print("\n");
			Time--; //Time?1
		}

		return 0;
	} //??

}

