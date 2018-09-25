package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		int length;
		int i = 0;
		while (true)
		{
			cin.get(str,110,'\n');
			if (System.in.read() == EOF)
			{
				break;
			}
			length = str.length();
			for (i = 0;i < length;i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
			for (i = length - 1;i >= 0;i--)
			{
				if (str.charAt(i) != '(' && str.charAt(i) != ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
				else if (str.charAt(i) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
					for (int j = i;j < length;j++)
					{
						if (str.charAt(j) == '?')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, ' ');
							str = tangible.StringFunctions.changeCharacter(str, j, ' ');
							break;
						}
					}
				}
				else if (str.charAt(i) == ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '?');
				}
			}
			for (i = 0;i < length;i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}




}

