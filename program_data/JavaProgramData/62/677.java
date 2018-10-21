package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int k;
	int l;
	String s = new String(new char[1000]);
	s = new Scanner(System.in).nextLine();
	for (l = 0;l < 100;l++)
	{
	for (j = 0;s.charAt(j) != '\0';j++)
	{
	if (s.charAt(j) == ' ' && s.charAt(j + 1) == ' ')
	{
	for (i = j + 1;s.charAt(i) != '\0';i++)
	{
	s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + 1));
	}
	break;
	}
	}
	}
	System.out.printf("%s",s);
	return 0;
	}
}

