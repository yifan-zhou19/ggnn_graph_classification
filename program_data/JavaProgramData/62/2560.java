package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	String s0 = new String(new char[100]);
	s = new Scanner(System.in).nextLine();
	int i;
	int k = 0;
	for (i = 0;s.charAt(i) != '\0';i++)
	{
	 if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i + 1) != ' '))
	 {
		s0 = tangible.StringFunctions.changeCharacter(s0, k, s.charAt(i));
		k++;
	 }
	}
	s0 = tangible.StringFunctions.changeCharacter(s0, k, '\0');
	System.out.printf("%s",s0);
	return 0;
	}
}

