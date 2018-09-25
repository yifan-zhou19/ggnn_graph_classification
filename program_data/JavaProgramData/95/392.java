package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	String a = new String(new char[100]);
	int i;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	for (i = 0;s.charAt(i) != '\0';i++)
	{
	if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	{
	s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
	}
	if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
	}
	}
	for (i = 0;i < 100;i++)
	{
	if (s.charAt(i) < a.charAt(i))
	{
	System.out.print("<");
	break;
	}
	else if (s.charAt(i) > a.charAt(i))
	{
	System.out.print(">");
	break;
	}
	else if (s.charAt(i) == a.charAt(i) && s.charAt(i) == '\0')
	{
	System.out.print("=");
	break;
	}

	}
	return 0;
	}

}

