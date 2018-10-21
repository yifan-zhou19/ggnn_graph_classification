package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct _Parenthesis
	//	{
	//		char ch;
	//		int idx;
	//	};
		_Parenthesis[] paren = tangible.Arrays.initializeWithDefault_ParenthesisInstances(100);
		String str = new String(new char[101]);
		while (gets(str))
		{
			int i;
			int top = 0;
			System.out.println(str);
			for (i = 0; str.charAt(i); i++)
			{
				if (str.charAt(i) == '(')
				{
					paren[top].ch = '(';
					paren[top].idx = i;
					top++;
				}
				else if (str.charAt(i) == ')')
				{
					if (top == 0)
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '?');
					}
					else
					{
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						str = tangible.StringFunctions.changeCharacter(str, paren[--top].idx, ' ');
					}
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			for (i = 0; i < top; i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, paren[i].idx, '$');
			}
			System.out.println(str);
		}
		return 0;
	}
}

