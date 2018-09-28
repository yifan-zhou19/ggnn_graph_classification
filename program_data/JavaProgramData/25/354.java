package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static void times2(tangible.RefObject<String> a, int length)
	{
		int i;
		int carry = 0;
		for (i = 0;i < length;i++)
		{
			a.argValue.charAt(i) = a.argValue.charAt(i) * 2 + carry - '0';
			if (a.argValue.charAt(i) > '9')
			{
				a.argValue.charAt(i) = a.argValue.charAt(i) - 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
		}
		if (carry == 1)
		{
			a.argValue.charAt(length) = '1';
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int length;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final String answer = "1";
		for (i = 1;i <= n;i++)
		{
			length = answer.length();
		tangible.RefObject<String> tempRef_answer = new tangible.RefObject<String>(answer);
			times2(tempRef_answer, length);
			answer = tempRef_answer.argValue;
		}
		length = answer.length();
		for (i = length - 1;i >= 0;i--)
		{
			System.out.print(answer.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

