package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String t = new String(new char[1000]);
		int len;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(t,' ',len);
			t = t.substring(0, len);

			for (int i = 0; i < len; i++)
			{
				if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				{
					t = tangible.StringFunctions.changeCharacter(t, i, '$');
				}
				char match = ' ';
				if (s.charAt(i) == ')')
				{
					match = '(';
				}
				else if (s.charAt(i) == ']')
				{
					match = '[';
				}
				else if (s.charAt(i) == '}')
				{
					match = '{';
				}
				if (match != ' ')
				{
					for (int j = i - 1; j >= 0; j--)
					{
						if (t.charAt(j) == '$')
						{
							if (s.charAt(j) == match)
							{
								t = tangible.StringFunctions.changeCharacter(t, j, ' ');
								match = ' ';
							}
							break;
						}
					}
					if (match != ' ')
					{
						t = tangible.StringFunctions.changeCharacter(t, i, '?');
					}
				}
			}
			System.out.printf("%s\n%s\n",s, t);
		}
	}
}

