package <missing>;

public class GlobalMembers
{
	/*
	 * zfuchuanchongpai.cpp
	 *
	 *  Created on: 2011-12-28
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int number = 0;
		int length1 = a.length();
		int length2 = b.length();
		if (length1 != length2)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		int i = 0;
		int j = 0;
		int temp1;
		int temp2;
		for (i = 0;i < length1 - 1;i++)
		{
			for (j = 0;j < length1 - i - 1;j++)
			{
				if (a.charAt(j) > a.charAt(j + 1))
				{
					temp1 = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, temp1);
				}
			}
		}

		for (i = 0;i < length1 - 1;i++)
		{
			for (j = 0;j < length1 - i - 1;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					temp2 = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, temp2);
				}
			}
		}
		for (i = 0;i < length1;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				number++;
			}
		}
		if (number == length1)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

