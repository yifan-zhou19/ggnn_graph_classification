package <missing>;

public class GlobalMembers
{
	/*
	 * ????1104.cpp
	 * ??????
	 * ?????2012-12-4
	 * ??????????
	 */


	public static String str = new String(new char[100]);
	public static String s = new String(new char[100]);


	public static void match(int x)
	{
		int i;
		for (i = x - 1; i >= 0; --i)
		{
			if (s.charAt(i) == '$')
			{
				s = tangible.StringFunctions.changeCharacter(s, x, ' ');
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				break;
			}
		}
	} //?????????'$'??????????????

	public static int Main()
	{
		int i;
		int l;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			l = str.length();
			s = tangible.StringFunctions.changeCharacter(s, l, '\0'); //??????????
			for (i = 0; i < l; ++i)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' '); //??????????
			}
			System.out.print(str);
			System.out.print("\n");
			for (i = 0; i < l; ++i)
			{
				switch (str.charAt(i))
				{
				case '(':
					s = tangible.StringFunctions.changeCharacter(s, i, '$');
					break;
				case ')':
					s = tangible.StringFunctions.changeCharacter(s, i, '?');
					match(i);
					break;
				} //???????'('???????'$'???')'???????'?'???????
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0; //????
	}
}

