package <missing>;

public class GlobalMembers
{
	/*
	 * draft2.cpp
	 *
	 *  Created on: 2014-1-4
	 *      Author: Mac
	 */


	public static String a = new String(new char[600]);
	public static String b = new String(new char[100]);
	public static String b1 = new String(new char[100]);
	public static String p;



	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int len = 1; len < a.length(); len++)
		{
			for (int i = 0; i < a.length() - len; i++)
			{
				int j = 0;
				for (j = 0; j <= len / 2; j++)
				{
					if (a.charAt(i + j) != a.charAt(i + len - j))
					{
						break;
					}
				}
				if (j == len / 2 + 1)
				{
					for (int t = 0; t <= len; t++)
					{
						System.out.print(a.charAt(i + t));
					}
					System.out.print("\n");
				}

			}
		}
	}

}

