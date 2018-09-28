package <missing>;

public class GlobalMembers
{
	/*
	 * 0.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		String a = new String(new char[101]);
		String out = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(out,100,'/');
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		int temp;
		int mod;
		temp = 10 * (a.charAt(0) - '0') + a.charAt(1) - '0';
		if (temp < 13 && len <= 2)
		{
			len = 1;
		}
		for (int i = 0; i < len - 1; i++)
		{
			out = tangible.StringFunctions.changeCharacter(out, i, temp / 13 + '0');
			mod = temp % 13;
			temp = temp % 13 * 10 + (a.charAt(i + 2) - '0');
		}
		int flag = 0;
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(a);
		}
		else
		{
			for (int i = 0; i < len - 1; i++)
			{
				if (out.charAt(i) != '0')
				{
					flag = 1;
				}
				if (flag != 0)
				{
					System.out.print(out.charAt(i));
				}
			}
			System.out.print("\n");
			System.out.print(mod);
		}
	}

}

