package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int a;
		int b;
		a = s1.length();
		b = s2.length();

		int i;
		for (i = 0;i < a;i++)
		{
			if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90)
			{
		s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
		}

		for (i = 0;i < b;i++)
		{
			if (s2.charAt(i) >= 65 && s2.charAt(i) <= 90)
			{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}
		}
		int d;
		d = strcmp(s1,s2);
		if (d == 0)
		{
			System.out.print("=\n");
		}
		if (d < 0)
		{
			System.out.print("<\n");
		}
		if (d > 0)
		{
			System.out.print(">\n");
		}
	}


}

