package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int len1;
		int len2;
		int i;
		int j = 1;
		a = new Scanner(System.in).nextLine();
		len1 = a.length();
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (i = 1;i < len1;i++)
		{
		  if (a.charAt(i) != ' ')
		  {
			 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			 j++;
		  }
		  else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
		  {
			 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			 b = tangible.StringFunctions.changeCharacter(b, j + 1, a.charAt(i + 1));
			 ++i;
			 j += 2;
		  }
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		len2 = b.length();
		for (i = 0;i < len2;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}


	}

}

