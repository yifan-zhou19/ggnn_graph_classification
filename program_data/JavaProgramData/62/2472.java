package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[255]);
		String si = new String(new char[255]);
		int i;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) != ' ')
			{
			  si = tangible.StringFunctions.changeCharacter(si, n, s.charAt(i));
			n++;
			}
		  else if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ' && i > 0)
		  {
			  si = tangible.StringFunctions.changeCharacter(si, n, s.charAt(i));
			 n++;
		  }
		  else if (i == 0 && s.charAt(i) == ' ')
		  {
			  continue;
		  }
		}
		si = tangible.StringFunctions.changeCharacter(si, n, '\0');
		System.out.println(si);
		return 0;
	}


}

