package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int i;
		int j;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		for (;;)
		{
				a = new Scanner(System.in).nextLine();

				if (strcmp(c,a) == 0)
				{
					break;
				}
				for (i = 0;a.charAt(i) != '\0';i++)
				{
						if (a.charAt(i) == ')')
						{
							b = tangible.StringFunctions.changeCharacter(b, i, '?');
						}
						else if (a.charAt(i) == '(')
						{
							b = tangible.StringFunctions.changeCharacter(b, i, '$');
						}
						else
						{
							b = tangible.StringFunctions.changeCharacter(b, i, ' ');
						}
				}

				for (i = 0;a.charAt(i) != '\0';i++)
				{
					if (b.charAt(i) == '?')
					{
						for (j = i;j >= 0;j--)
						{
						   if (b.charAt(j) == '$')
						   {
								  b = tangible.StringFunctions.changeCharacter(b, i, ' ');
							   b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							   break;
						   }

						}
					}
				}
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
				c = a;
		}

				return 0;







	}










}

