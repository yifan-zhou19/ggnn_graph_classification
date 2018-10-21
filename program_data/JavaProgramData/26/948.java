package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int a = 0;
		String s = new String(new char[101]);
		String z = new String(new char[102]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			z = tangible.StringFunctions.changeCharacter(z, i, ' ');
		}
		for (i = 0;!(s.charAt(i) == 0);i++)
		{
			if (!(s.charAt(i) == ' '))
			{
			   j = j + a;
			   z = tangible.StringFunctions.changeCharacter(z, j, s.charAt(i));
			   j++;
			   a = 0;
			}
			else
			{
				a = 1;
			}
		}
		z = tangible.StringFunctions.changeCharacter(z, j, '\0');
		System.out.println(z);
		return 0;
	}
}

