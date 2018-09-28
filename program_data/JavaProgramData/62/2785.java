package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int l;
	int j;
	String s = new String(new char[max]);
	s = new Scanner(System.in).nextLine();
	l = s.length();
	for (i = 0;i < l - 1;i++)
	{
		if (s.charAt(i + 1) == ' ' && s.charAt(i) == ' ')
		{
		   for (;s.charAt(i + 1) == ' ';)
		   {
			for (j = i;j < l - 1;j++)
			{
				   s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
			}
				s = tangible.StringFunctions.changeCharacter(s, l - 1, '\0');
				l--;

		   }
		}
	}
			System.out.println(s);

				 return 0;

	}


}

