package <missing>;

public class GlobalMembers
{
	/*
	 * kuohaopipei.cpp
	 *????
	 *  Created on: 2012-12-4
	 *      Author: ???
	 */
	public static void f(String str, int len) //??????
	{
		int i;
		int j;
		for (i = 0;i < len;i++)
		{ //????????
			System.out.print(str[i]);
		}
		System.out.print("\n");
		for (i = 0;i < len;i++)
		{ //????????????????
			if (str[i].equals(')'))
			{
				int x = 0;
				for (j = i - 1;j >= 0;j--)
				{
					if (str[j].equals('('))
					{
						x = 1;
						str[i] = 'a'; //????????????
						str[j] = 'a';
						break;
					}
				}
				if (x == 0) //?????????
				{
					str[i] = '?';
				}
			}
		}
		for (i = 0;i < len;i++)
		{ //?????????$???
			if (str[i].equals('('))
			{
				str[i] = '$';
			}
		}
		for (i = 0;i < len;i++)
		{ //?????????
			if (!str[i].equals('$') && !str[i].equals('?'))
			{
				str[i] = ' ';
			}
		}
		for (i = 0;i < len;i++)
		{ //????
			System.out.print(str[i]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{ //????
		String str = new String(new char[105]);
		int len;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{ //?????????
			len = str.length();
			f(str, len);
		}
		return 0;
	}

}

