package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static match(String s, String r, int len) // s: ?????r: ????len: ???
	{
		String stack = new String(new char[100]); // ???
		char c;
		int top = 0; //??????????
		int pos; // ??????
		for (pos = 0; pos < len; ++pos)
		{
			r[pos] = ' '; // ???????????????????
		}
			  r[len] = '\0';
		for (pos = 0; pos < len; ++pos) //?????????????
		{
			c = s[pos];
			if (c == '(')
			{
				stack = tangible.StringFunctions.changeCharacter(stack, top++, pos); // ????????
			}
			else if (c == ')')
			{
				if (top > 0)
				{
					top--; // ????????????????????
				}
				else
				{
					r[pos] = '?'; // ?????????????????�?�?
				}
			}
		}
		while (top > 0)
		{
			pos = stack.charAt(--top);
		   r[pos] = '$'; // ??????????????????????�&�?
		}
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static outresult(String s, String r)
	{
		System.out.println(s);
		System.out.print('\n');
		System.out.println(r);
		System.out.print('\n');
	}
	public static int Main()
	{
		 String line = new String(new char[101]);
		 String result = new String(new char[101]);
		 char ch;
		 int pos = 0;
	while ((ch = System.in.read()) != EOF) //???????
	{
		if (ch != '\n')
		{
			line = tangible.StringFunctions.changeCharacter(line, pos++, ch); // ????
		}
		else // ???
		{
				line = tangible.StringFunctions.changeCharacter(line, pos, '\0');
						 match(line, result, pos);
			  outresult(line, result);
						 pos = 0;
		}
	}
	}

}

