package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[10]);
		String s3 = new String(new char[10]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		String s4 = new String(new char[10]);
		int a;
		int b = 0;
		a = s1.length();
		for (int i = 0;i < a;i++)
		{
			if (s1.charAt(i) != ' ')
			{
				if (i != a - 1)
				{
					s4 = tangible.StringFunctions.changeCharacter(s4, b, s1.charAt(i));
					b++;
				}
				if (i == a - 1)
				{
					s4 = tangible.StringFunctions.changeCharacter(s4, b, s1.charAt(i));
					s4 = tangible.StringFunctions.changeCharacter(s4, b + 1, '\0');
					if (strcmp(s4,s2) == 0)
					{
						System.out.printf("%s",s3);
					}
					else
					{
						System.out.printf("%s",s4);
					}
				}
			}
			else
			{
				s4 = tangible.StringFunctions.changeCharacter(s4, b, '\0');
				b = 0;
				if (strcmp(s4,s2) == 0)
				{
					System.out.printf("%s ",s3);
				}
				else
				{
					System.out.printf("%s ",s4);
				}
			}
		}
	}

}

