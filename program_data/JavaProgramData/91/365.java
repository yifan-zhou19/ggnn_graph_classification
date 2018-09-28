package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ori = new String(new char[101]);
		String rel = new String(new char[101]);
		ori = new Scanner(System.in).nextLine();
		int i;
		for (i = 0; i < ori.length() - 1; i++)
		{
			rel = tangible.StringFunctions.changeCharacter(rel, i, ori.charAt(i) + ori.charAt(i + 1));
			System.out.print(rel.charAt(i));
		}
		rel = tangible.StringFunctions.changeCharacter(rel, ori.length() - 1, ori.charAt(0) + ori.charAt(ori.length() - 1));
		System.out.print(rel.charAt(ori.length() - 1));
		return 0;
	}
}

