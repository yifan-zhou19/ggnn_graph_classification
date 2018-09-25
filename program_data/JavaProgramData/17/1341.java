package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		/*typedef struct _Parenthesis
		{
			char ch;
			int idx;
		} Parenthesis;*/
		int[] LeftParenIndex = new int[100];
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
					LeftParenIndex[top++] = i;
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
						str = tangible.StringFunctions.changeCharacter(str, LeftParenIndex[--top], ' ');
					}
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			for (i = 0; i < top; i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, LeftParenIndex[i], '$');
			}
			System.out.println(str);
		}
		return 0;
	}
}

