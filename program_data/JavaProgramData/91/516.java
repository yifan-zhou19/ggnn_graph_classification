package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[120]);
	String w = new String(new char[120]);
	s = new Scanner(System.in).nextLine();
	for (int j = 0;j < s.length();j++)
	{
		if (j != (s.length() - 1))
		{
			  w = tangible.StringFunctions.changeCharacter(w, j, s.charAt(j) + s.charAt(j + 1));
		}
		else
		{
			  w = tangible.StringFunctions.changeCharacter(w, j, s.charAt(j) + s.charAt(0));
		}
	}
	for (int i = 0;i < s.length();i++)
	{
		 System.out.printf("%c",w.charAt(i));
	}
	return 0;
	}
}

