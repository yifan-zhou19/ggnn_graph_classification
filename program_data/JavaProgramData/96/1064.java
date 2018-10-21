package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String c = "";
		  c = new Scanner(System.in).nextLine();
		  int i;
		  int a;
		  int b;
		  if (c.charAt(1) == '\0')
		  {
						a = c.charAt(0) - '0';
						System.out.printf("0\n%d",a);
		  }
		  else
		  {
			  for (i = 0;c.charAt(i + 1) != '\0';i++)
			  {
						  if (i == 0)
						  {
							  a = (c.charAt(i) - '0') * 10 + c.charAt(i + 1) - '0';
						  }
						  else
						  {
							  a = a * 10 + c.charAt(i + 1) - '0';
						  }
						  b = a / 13;
						  c = tangible.StringFunctions.changeCharacter(c, i, b + '0');
						  a = a % 13;
			  }
			  c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			  if (c.charAt(0) == '0' && c.charAt(1) != '\0')
			  {
						for (i = 0;c.charAt(i) != '\0';i++)
						{
											   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i + 1));
						}
			  }
			  System.out.printf("%s\n%d",c,a);
		  }
	}








}

