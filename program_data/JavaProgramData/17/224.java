package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[1000]);
		String outline = new String(new char[1000]);
		int i;
		int j;
		int len;
		while ((line = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			outline = line;
			len = line.length();
			for (i = 0 ; i < len ; i++)
			{
				if (line.charAt(i) == ')')
				{
					for (j = i - 1 ; j >= 0 ; j--)
					{
						if (line.charAt(j) == '(')
						{
							line = tangible.StringFunctions.changeCharacter(line, j, ' ');
							line = tangible.StringFunctions.changeCharacter(line, i, ' ');
							break;
						}
					}
				}
			}
			System.out.print(outline);
			System.out.print("\n");
			for (i = 0 ; i < len ; i++)
			{
				if (line.charAt(i) == '(')
				{
					System.out.print('$');
				}
				else
				{
					if (line.charAt(i) == ')')
					{
						System.out.print('?');
					}
					else
					{
						System.out.print(' ');
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

