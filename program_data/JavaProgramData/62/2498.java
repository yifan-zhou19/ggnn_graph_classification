package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 1;
		String t = new String(new char[101]);
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		t = tangible.StringFunctions.changeCharacter(t, 0, s.charAt(0));
		for (int i = 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
			   t = tangible.StringFunctions.changeCharacter(t, a, s.charAt(i));
			   a++;
			}
			else if (s.charAt(i - 1) == ' ')
			{
				continue;
			}
			else if (s.charAt(i - 1) != ' ')
			{
			   t = tangible.StringFunctions.changeCharacter(t, a, s.charAt(i));
			   a++;
			}
		}
	   t = tangible.StringFunctions.changeCharacter(t, a, '\0');
	   System.out.printf("%s",t);
	   return 0;
	}
}

