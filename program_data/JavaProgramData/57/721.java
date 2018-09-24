package <missing>;

public class GlobalMembers
{
	public static String[] key = {"er", "ly", "ing"};
	public static String name = new String(new char[50]);
	public static String get = new String(new char[3]);
	public static String get3 = new String(new char[3]);
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len;
		for (int i = 0;i < n;i++)
		{
			name = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = name.length();
			for (int j = len - 3;j < len;j++)
			{
				get3 = tangible.StringFunctions.changeCharacter(get3, j - len + 3, name.charAt(j));
			}
			for (int j = len - 2;j < len;j++)
			{
				get = tangible.StringFunctions.changeCharacter(get, j - len + 2, name.charAt(j));
			}
			if (strcmp(get,key[0]) == 0 || strcmp(get,key[1]) == 0)
			{
				for (int j = 0;j < len - 2;j++)
				{
					System.out.print(name.charAt(j));
				}
				System.out.print("\n");
				continue;
			}
			if (strcmp(get3,key[2]) == 0)
			{
				for (int j = 0;j < len - 3;j++)
				{
					System.out.print(name.charAt(j));
				}
				System.out.print("\n");
				continue;
			}
		}
		return 0;
	}

}

