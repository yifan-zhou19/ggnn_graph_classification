package <missing>;

public class GlobalMembers
{
	/*
	 * main.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: ??
	 *  ??????
	 */

	public static int Main()
	{
		int[] numerator = new int[110];
		int[] quotient = new int[110];
		int i;
		int j;
		int t = 0;
		String a = new String(new char[110]);

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < a.length();i++)
		{
			numerator[i + 1] = a.charAt(i) - 48; //?????
		}
		for (i = 1;i <= a.length();i++)
		{
			quotient[i] = (t * 10 + numerator[i]) / 13; //?????
			t = (t * 10 + numerator[i]) % 13; //??
		}
		i = 1;
		while ((quotient[i] == 0) && (i < a.length()))
		{
			i++; //?????0
		}
		for (;i <= a.length();i++)
		{
			System.out.print(quotient[i]);
		}
		System.out.print("\n");
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

