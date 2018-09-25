package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int len = 0;
		  String a = new String(new char[1000]);
		  String b = new String(new char[1000]);
		  while (gets(a) != null)
		  {
			   len = a.length();
			   for (i = 0;i < len;i++)
			   {
					b = tangible.StringFunctions.changeCharacter(b, i, 'c');
			   }
			   b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			   for (i = len - 1;i >= 0;i--)
			   {
					if (a.charAt(i) != '(' && a.charAt(i) != ')')
					{
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
					}
					else if (a.charAt(i) == ')' && b.charAt(i) != ' ')
					{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
					}
					else if (a.charAt(i) == '(')
					{
						 if (i == len - 1)
						 {
						 b = tangible.StringFunctions.changeCharacter(b, i, '$');
						 }
						 else
						 {
							  for (j = i + 1;j < len;j++)
							  {
								   if (a.charAt(j) == ')' && b.charAt(j) != ' ')
								   {
									   b = tangible.StringFunctions.changeCharacter(b, j, ' ');
									   b = tangible.StringFunctions.changeCharacter(b, i, ' ');
									   break;
								   }
							  }
							  if (j == len)
							  {
							   b = tangible.StringFunctions.changeCharacter(b, i, '$');
							  }
						 }
					}
			   }
			   //puts(a);
			   //puts(b);
			   for (i = 0;a.charAt(i) != '\0';i++)
			   {
				   System.out.printf("%c",a.charAt(i));
			   }
			   System.out.print("\n");
				for (i = 0;a.charAt(i) != '\0';i++)
				{
					System.out.printf("%c",b.charAt(i));
				}
				System.out.print("\n");
		  }
		  System.in.read();
		  System.in.read();
	}

}

