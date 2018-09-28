package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		char c = 0;
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		j = a.length();
		for (i = 1;a.charAt(i) != '\0';i++)
		{

			if ((a.charAt(i) != ' ' && a.charAt(i - 1) == ' ') || a.charAt(i - 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(i - 1));
			   c++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(j - 1));
		b = tangible.StringFunctions.changeCharacter(b, c + 1, '\0');
	   System.out.println(b);
	   return 0;
	}

}

