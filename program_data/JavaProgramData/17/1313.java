package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		while ((scanf("%s",a)) != -1)
		{
				  System.out.printf("%s\n",a);
				  int b;
				  int c;
				  int d;
				  for (b = 0;b < 100;b++)
				  {
					  if (a.charAt(b) == ')')
					  {
						  for (c = b - 1;c >= 0;c--)
						  {
							  if (a.charAt(c) == '(')
							  {
									 a = tangible.StringFunctions.changeCharacter(a, c, 'a');
									 a = tangible.StringFunctions.changeCharacter(a, b, 'a');
									 break;
							  }
						  }
					  }
				  }
				  for (d = 0;d < 100;d++)
				  {
					  if (a.charAt(d) == ')')
					  {
						  System.out.print("?");
					  }
					  else if (a.charAt(d) == '(')
					  {
						  System.out.print("$");
					  }
					  else if (a.charAt(d) != '\0')
					  {
						  System.out.print(" ");
					  }
					  a = tangible.StringFunctions.changeCharacter(a, d, '\0');
				  }
				  System.out.print("\n");

		}
	}
}

