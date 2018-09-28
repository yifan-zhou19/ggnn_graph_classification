package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char b = a.charAt(0);
		int l = a.length();
		char g = a.charAt(l - 1);
		for (int i = 0; i < l && a.charAt(i) != '*'; i++)
		{
			if (a.charAt(i) == g)
			{
				a.charAt(i) == '*';
				for (int j = i; j >= 0;j--)
				{
					if (a.charAt(j) == b && a.charAt(j) != '*')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '*');
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}

}

