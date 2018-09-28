package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
		int i;
		int j = 0;
		int n = 0;
		a = new Scanner(System.in).nextLine();
	  for (i = 0;a.charAt(i) != '\0';i++)
	  {
		  if (a.charAt(i) == ' ' && n == 0)

		  {
		 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		 n = 1;
		 j++;
		  }
		else if (a.charAt(i) != ' ')
		{
			n = 0;
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			j++;
		}
	  }
	  b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.printf("%s",b);


	return 0;
	}
}

