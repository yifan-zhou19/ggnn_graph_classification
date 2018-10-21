package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char n;
		char i;
		s1 = new Scanner(System.in).nextLine();
		n = s1.length();
		for (i = 0;i < n - 1;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, *(s1 + i) + *(s1 + i + 1));
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, n - 1, *(s1.Substring(0)) + *(s1 + n - 1));
		s2 = tangible.StringFunctions.changeCharacter(s2, n, '\0');
		System.out.println(s2);
	}

}

