package <missing>;

public class GlobalMembers
{
	/*
	 * Name:homework.cpp
	 *  Created on: 2012-11-24
	 *  Author: Meng Li
	 *  Function: ?????
	 */



	public static void sum(String a, String b)
	{
		int length1 = 0;
		int length2 = 0;
		int i;
		int count = 0;
		int temp = 0;
		String c = new String(new char[250]);
		length1 = a.length();
		length2 = b.length();
		for (i = 0;;i++)
		{
			if (i < length1 && i < length2)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a[length1 - 1 - i] - '0' + b[length2 - 1 - i].Substring(temp));
				if (c.charAt(i) > '9')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
					temp = 1;
				}
				else
				{
					temp = 0;
				}
				count++;
			}
			else if (i >= length1 != 0 && i < length2)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, b[length2 - i - 1].Substring(temp));
				if (c.charAt(i) > '9')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
					temp = 1;
				}
				else
				{
					temp = 0;
				}
				count++;
			}
			else if (i < length1 && i >= length2)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a[length1 - i - 1].Substring(temp));
				if (c.charAt(i) > '9')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
					temp = 1;
				}
				else
				{
					temp = 0;
				}
				count++;
			}
			else if (i >= length1 != 0 && i >= length2)
			{
				if (temp == 1)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, temp + '0');
					count++;
					temp = 0;
				}
				else
				{
					break;
				}
			}
		}
		for (i = count - 1;i >= 0;i--)
		{
			if (i == count - 1)
			{
				if (c.charAt(i) == '0' && count != 1)
				{
					continue;
				}
				else
				{
					System.out.print(c.charAt(i));
				}
			}
			else
			{
				System.out.print(c.charAt(i));
			}
		}
	}

	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sum(a, b);
		return 0;
	}

}

