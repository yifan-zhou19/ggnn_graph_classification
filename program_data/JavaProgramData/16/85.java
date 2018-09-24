package <missing>;

public class GlobalMembers
{
	//??????
	//2010?11?26?
	//1000012753 ???
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int j;
		int l;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str1.length();
		j = 0;
		for (i = l - 1; i >= 0; --i)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j++, str1.charAt(i));
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
		System.out.print(str2);
		System.out.print("\n");
		return 0;
	}
}

