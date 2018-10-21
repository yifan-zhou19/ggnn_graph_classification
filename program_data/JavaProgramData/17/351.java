package <missing>;

public class GlobalMembers
{
	/*
	 *????match.cpp
	 *??????
	 *?????2012-11-27
	 *???????????
	 */



	public static int len; // ?????
	public static String st = new String(new char[101]); // st????ans???
	public static String ans = new String(new char[101]);

	public static int work(int pos) // ??pos????????????????????
	{
		for (int i = pos + 1;i < len;i++)
		{
			if (st.charAt(i) == '(')
			{
				i = work(i); // ??
			}
			else
			{
				if (st.charAt(i) == ')')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, pos, '('); // ????
					ans = tangible.StringFunctions.changeCharacter(ans, i, ')');
					return i;
				}
			}
		}
		return len - 1; // ???
	}

	public static int Main()
	{
		int i;
		while ((st = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) // ??
		{
			System.out.print(st);
			System.out.print("\n");
			len = st.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ans,0,(Character.SIZE / Byte.SIZE)); // ???
			for (i = 0;i < len;i++)
			{
				if (st.charAt(i) == '(')
				{
					i = work(i); // ??????
				}
			}
			for (i = 0;i < len;i++)
			{
				switch (st.charAt(i))
				{
					case '(':
						ans = tangible.StringFunctions.changeCharacter(ans, i, (ans.charAt(i) == '(') ? ' ' : '$');
						break; // ????
					case ')':
						ans = tangible.StringFunctions.changeCharacter(ans, i, (ans.charAt(i) == ')') ? ' ' : '?');
						break;
					default :
						ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

