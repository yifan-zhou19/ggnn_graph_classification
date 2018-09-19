package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int f1 = 0;
		int f2 = 0;
		String line = new String(new char[101]);
		String copy = new String(new char[101]);
		while ((line = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			copy = line;
			for (i = 0;i < line.length();i++)
			{
				if (line.charAt(i) == ')')
				{
					line = tangible.StringFunctions.changeCharacter(line, i, '?');
				}
				if (line.charAt(i) == '(')
				{
					f1 = 1;
					for (j = i + 1;j < line.length();j++)
					{
						if (line.charAt(j) == '(')
						{
							f1++;
						}
						if (line.charAt(j) == ')')
						{
							f1--;
							if (f1 == 0)
							{
								line = tangible.StringFunctions.changeCharacter(line, i, ' ');
								line = tangible.StringFunctions.changeCharacter(line, j, ' ');
								break;
							}
						}
					}
					if (f1 != 0)
					{
						line = tangible.StringFunctions.changeCharacter(line, i, '$');
					}
				}
			}
			System.out.print(copy);
			System.out.print("\n");
			for (i = 0;i < line.length();i++)
			{
				if (line.charAt(i) == '$' || line.charAt(i) == '?')
				{
					System.out.print(line.charAt(i));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(line, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(copy, 0, (Character.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

