package <missing>;

public class GlobalMembers
{
	/*
	 *???: brackets.cpp
	 *??: ???
	 *????: 2012-11-26
	 *??: ????
	 */



	public static int brackets_matching(String str, String result, int n, int j)
	/*???i?????str?????????result?
	 * n?????.i????????????????????
	 */
	{
		int i;
		int p;
		for (i = j;str[i] != null;i++)
		{ //???????
			switch (str[i])
			{
				case '(' : //???
				p = brackets_matching(str, result, n + 1, i + 1); //??????????
				if (str[p].equals(')')) //????
				{
					result[i] = ' '; //???????????
				}
				else
				{
					result[i] = '$'; //??????????p??\0
				}
				i = p;
				break;

				case ')' : //???
				if (n == 0) //????
				{
					result[i] = '?';
				}
				else
				{
					result[i] = ' ';
					return i;
				}
				break;

				default :
				result[i] = ' ';
			}
		}
		result[i] = null;
		return i;
	}

	public static int Main()
	{
		String a = new String(new char[MAXL]);
		String result = new String(new char[MAXL]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			brackets_matching(a, result, 0, 0);
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}


}

