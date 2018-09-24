package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		int c = 0;
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < 201;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		for (int i = 0;i < a.length();i++)
		{
			if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
			{
				b = tangible.StringFunctions.changeCharacter(b, c, ' ');
			}
			else
			{
			b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(i));
			c++;
			//printf("%d\n",c);
			}
		}
		System.out.printf("%s",b);
		return 0;
	}



}

