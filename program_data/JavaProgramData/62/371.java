package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[201]);
		s = new Scanner(System.in).nextLine();
		int space;
		for (int i = 0;s.charAt(i) != '\0';i++)
		{
		space = 0;
		if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ' && s.charAt(i + 2) == ' ')
		{
			for (int j = i + 1;s.charAt(j) == ' ';j++)
			{
			 space++;
			}
			for (int t = 0;t < s.length();t++)
			{
			 s = tangible.StringFunctions.changeCharacter(s, i + 2 + t, s.charAt(i + 1 + t + space));
			}
		}
		}
		System.out.println(s);
	return 0;
	}
}

