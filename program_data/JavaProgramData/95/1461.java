package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s1 = new String(new char[80]);
	String s2 = new String(new char[80]);
	int i;
	int j = 0;
	s1 = new Scanner(System.in).nextLine();

	s2 = new Scanner(System.in).nextLine();
	for (i = 0;i < 80;i++)
	{
	if (s1.charAt(i) == '\0' || s2.charAt(i) == '\0')
	{
		break;
	}
	if ((s1.charAt(i) <= 122) && (s1.charAt(i) >= 97) && (s2.charAt(i) <= 90) && (s2.charAt(i) >= 65))
	{
		s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 32);
	}
	if ((s2.charAt(i) <= 122) && (s2.charAt(i) >= 97) && (s1.charAt(i) <= 90) && (s1.charAt(i) >= 65))
	{
		s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 32);
	}
	if (s1.charAt(i) == s2.charAt(i))
	{
		continue;
	}
	else if (s1.charAt(i) > s2.charAt(i))
	{
		System.out.print(">");
		j = 1;
		break;
	}
	else
	{
		System.out.print("<");
		j = 1;
		break;
	}
	}
	if (j == 0)
	{
		System.out.print("=");
	}
	return 0;
	}
}

