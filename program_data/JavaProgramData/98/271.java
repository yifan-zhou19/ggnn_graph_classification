package <missing>;

public class GlobalMembers
{
	/*
	 * assignment.cpp
	 *
	 *  Created on: 2010-11-23
	 *      Author: ??
	 *      ????
	 */
	//???
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String word = new String(new char[100]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int len = 0;
		int len = 0;
		for (int i = 0; i < n; i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = len + word.length() + 1;
			if (len == word.length() + 1)
			{
				System.out.print(word);
				len--;
			}
			else if (len <= 80)
			{
				System.out.print(" ");
				System.out.print(word);
			}
			else
			{
				System.out.print("\n");
				System.out.print(word);
				len = word.length();
			}
		}
		return 0;
	}


}

