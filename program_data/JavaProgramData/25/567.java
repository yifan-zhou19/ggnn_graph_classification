package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		String ans = new String(new char[1000]);
		int[] tans = new int[1000];
		ans = tangible.StringFunctions.changeCharacter(ans, 0, 1 + '0');
		ans = tangible.StringFunctions.changeCharacter(ans, 1, '\0');
		for (i = 0; i < n; i++)
		{
			int len = ans.length();
			for (j = 0; j < len; j++)
			{
				tans[j] = (ans.charAt(j) - '0') * 2;
			}
			int carry = 0;
			for (j = 0; j < len; j++)
			{
				int carrytem = tans[j] / 10;
				tans[j] = (tans[j] + carry) % 10;
				carry = carrytem;
			}

			if (carry == 1)
			{
				tans[j] = 1;
				j++;
			}

			for (k = 0; k < j; k++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, k, tans[k] + '0');
			}
			ans = tangible.StringFunctions.changeCharacter(ans, j, '\0');
		}
		int lentem = ans.length();
		for (i = lentem - 1; i >= 0; i--)
		{
			System.out.print(ans.charAt(i));
		}
		return 0;
	}

}

