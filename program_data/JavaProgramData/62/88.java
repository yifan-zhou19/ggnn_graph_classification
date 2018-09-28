package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[10000]);
	  int i;
	  int j;
	  int k;
	  s = new Scanner(System.in).nextLine();
	  for (i = 0;s.charAt(i) != '\0';i++)
	  {
		if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')
		{
		  for (j = i;;j++)
		  {
			s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
			if (s.charAt(j) == '\0')
			{
			break;
			}
		  }
		  if (s.charAt(i) == ' ')
		  {
		  i--;
		  }
		}
	  }
	  System.out.printf("%s",s);
	}


}

