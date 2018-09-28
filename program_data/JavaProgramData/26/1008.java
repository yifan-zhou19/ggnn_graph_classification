package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[101]);
	String t = new String(new char[101]);
	int i;
	int j = 1;
	int n;
	s = new Scanner(System.in).nextLine();
	t = tangible.StringFunctions.changeCharacter(t, 0, s.charAt(0));
	for (i = 1;s.charAt(i) != '\0';i++)
	{
	if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
	{
	continue;
	}
	else

	{
	t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
	j++;
	}
	}
	t = tangible.StringFunctions.changeCharacter(t, j, '\0');
	System.out.printf("%s",t);
	return 0;
	}
}

