package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int n1;
		int n2;
		n1 = s1.length();
		n2 = s2.length();
		int i;
		for (i = 0;i < n1;i++)
		{
			if (65 <= s1.charAt(i) && s1.charAt(i) <= 90)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
			else
			{
				;
			}
		}
		for (i = 0;i < n2;i++)
		{
			if (65 <= s2.charAt(i) && s2.charAt(i) <= 90)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}
			else
			{
				;
			}
		}
		if (strcmp(s1,s2) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(s1,s2) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("=");
		}
	}
}

