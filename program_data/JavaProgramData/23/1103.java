package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String Str = new String(new char[105]);
		Str = new Scanner(System.in).nextLine();
		int strl = Str.length();
		for (int i = strl - 1;i >= 0;i--)
		{
			if (Str.charAt(i) == ' ')
			{
				Str = tangible.StringFunctions.changeCharacter(Str, i, '\0');
				System.out.printf("%s ",Str.Substring(i) + 1);
			}
		}
		System.out.printf("%s",Str);
	}
}

