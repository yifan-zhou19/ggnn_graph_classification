package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String sz = new String(new char[101]);
		String fri = new String(new char[101]);
		int i;
		sz = new Scanner(System.in).nextLine();
		for (i = 0;sz.charAt(i + 1) != '\0';i++)
		{
			fri = tangible.StringFunctions.changeCharacter(fri, i, sz.charAt(i) + sz.charAt(i + 1));
		}
		fri = tangible.StringFunctions.changeCharacter(fri, i, sz.charAt(i) + sz.charAt(0));
		fri = tangible.StringFunctions.changeCharacter(fri, i + 1, '\0');
		System.out.println(fri);
	}

}

