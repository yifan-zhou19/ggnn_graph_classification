package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str1 = new String(new char[120]);
		String str = new String(new char[120]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str,'\0',(Character.SIZE / Byte.SIZE));
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str = str1;

			for (int len = 1;len < str.length();len++)
			{
				for (int j = 0;j < str.length() - len;j++)
				{
					int k = j + len;
					if (str.charAt(j) == '(' && str.charAt(k) == ')')
					{
						str = tangible.StringFunctions.changeCharacter(str, j, '0');
						str = tangible.StringFunctions.changeCharacter(str, k, '0');
					}
				}
			}

			for (int i1 = 0;str.charAt(i1) != '\0';i1++)
			{
				if (str.charAt(i1) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i1, '$');
				}
				else if (str.charAt(i1) == ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i1, '?');
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i1, ' ');
				}
			}
			System.out.print(str1);
			System.out.print("\n");
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}




}

