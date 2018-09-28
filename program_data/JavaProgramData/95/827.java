package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s1 = new String(new char[80]);
	String s2 = new String(new char[80]);
	int i;
	int p = 0;
	int a;
	int b;
	s1 = new Scanner(System.in).nextLine();
	s2 = new Scanner(System.in).nextLine();
	a = s1.length();
	b = s2.length();
	for (i = 0;i < 80;i++)
	{
		if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
		}
	}
	for (i = 0;i < 80;i++)
	{
		if (s2.charAt(i) >= 65 && s2.charAt(i) <= 90)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
		}
	}

	for (i = 0;i < a;i++)
	{
	if (s1.charAt(i) > s2.charAt(i))
	{
		p = 1;
		break;
	}
	if (s1.charAt(i) < s2.charAt(i))
	{
		p = 2;
		break;
	}

	}

	if (p == 1)
	{
		System.out.print(">");
	}
	if (p == 2)
	{
		System.out.print("<");
	}
	if (p == 0)
	{
		System.out.print("=");
	}
	}
}

