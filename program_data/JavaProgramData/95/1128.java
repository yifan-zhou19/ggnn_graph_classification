package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i = 0;
		int a;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		while (s1.charAt(i) != '\0')
		{
			if ((65 <= s1.charAt(i)) && (s1.charAt(i) <= 90))
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
			i++;
		}
		i = 0;
		while (s2.charAt(i) != '\0')
		{
			if ((65 <= s2.charAt(i)) && (s2.charAt(i) <= 90))
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}
			i++;
		}
		a = strcmp(s1,s2);
	if (a > 0)
	{
			System.out.print(">");
	}
		else if (a == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}

	}
}

