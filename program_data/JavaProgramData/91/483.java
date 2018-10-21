package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (i == a.length() - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, a.length(), '\0');
			System.out.println(b);

		return 0;
	}

}

