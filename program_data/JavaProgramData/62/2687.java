package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int r;
		int x = 0;
		int y = 0;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		if (a.charAt(0) == ' ')
		{
				  for (i = 1;i < n;i++)
				  {
								   a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i));
				  }

		for (i = 0;i < n - 1;i++)
		{
						 if (a.charAt(i) != ' ')
						 {
									y = 0;
									b = tangible.StringFunctions.changeCharacter(b, x, a.charAt(i));
									x++;
						 }
						 if (a.charAt(i) == ' ' && y == 0)
						 {
									y = 1;
									b = tangible.StringFunctions.changeCharacter(b, x, ' ');
									x++;
						 }
		}
		}
		else
		{
			 for (i = 0;i < n;i++)
			 {
						 if (a.charAt(i) != ' ')
						 {
									y = 0;
									b = tangible.StringFunctions.changeCharacter(b, x, a.charAt(i));
									x++;
						 }
						 if (a.charAt(i) == ' ' && y == 0)
						 {
									y = 1;
									b = tangible.StringFunctions.changeCharacter(b, x, ' ');
									x++;
						 }
			 }
		}
		if (b.charAt(x - 2) == 0)
		{
					  for (i = 0;i < x - 1;i++)
					  {
										 System.out.printf("%c",b.charAt(i));
					  }
		}
		else
		{
			 for (i = 0;i < x;i++)
			 {
										 System.out.printf("%c",b.charAt(i));
			 }
		}
		return 0;
	}
}

