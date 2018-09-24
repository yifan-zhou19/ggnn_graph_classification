package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		for (int i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				for (int j = i;j < str.length();j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
				i--;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}

