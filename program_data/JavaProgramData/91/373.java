package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[200]);
		String string1 = new String(new char[200]);
		String = new Scanner(System.in).nextLine();
		int n;
		int i;
		n = String.length();
		for (i = 0;i < n;i++)
		{
						if (i != n - 1)
						{
						  string1 = tangible.StringFunctions.changeCharacter(string1, i, string.charAt(i) + string.charAt(i + 1));
						}
						if (i == n - 1)
						{
								  string1 = tangible.StringFunctions.changeCharacter(string1, i, string.charAt(i) + string.charAt(0));
						}
		}
		for (i = 0;i < n;i++)
		{
						System.out.printf("%c", string1.charAt(i));
		}

		return 0;
	}


}

