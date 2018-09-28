package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str = new String(new char[300]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
				str = ConsoleInput.readToWhiteSpace(true).charAt(0);
				int len = str.length();
				for (int i = 0; i < len; i++)
				{
						if (str.charAt(i) == 'A')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, 'T');
						}
						else if (str.charAt(i) == 'T')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, 'A');
						}
						else if (str.charAt(i) == 'C')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, 'G');
						}
						else if (str.charAt(i) == 'G')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, 'C');
						}
						System.out.print(str.charAt(i));
				}
				System.out.print("\n");
		}
		return 0;
	}


}

