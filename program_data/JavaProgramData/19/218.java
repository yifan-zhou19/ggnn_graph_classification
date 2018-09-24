package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b = 0;
		String s = new String(new char[80]);
		String s0 = new String(new char[20]);
		String s2 = new String(new char[20]);
		String s3 = new String(new char[20]);
		final String s1 = "";
		s = new Scanner(System.in).nextLine();
		s0 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				 s3 = tangible.StringFunctions.changeCharacter(s3, b, s.charAt(i));
				 b++;
			}
			if (s.charAt(i) == ' ')
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, b, '\0');
				if (strcmp(s3,s0) == 0)
				{
					  s1 += s2;
					  s1 += " ";
				}
				else
				{
					  s1 += s3;
					  s1 += " ";
				}
				b = 0;
			}
		}
		   s3 = tangible.StringFunctions.changeCharacter(s3, b, '\0');
		  if (strcmp(s3,s0) == 0)
		  {
					  s1 += s2;
		  }
		  else
		  {
					  s1 += s3;
		  }
		  System.out.println(s1);
		  return 0;
	}


}

