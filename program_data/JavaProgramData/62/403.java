package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
					j = j;
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
					j++;
				}
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.printf("%s",b);
		return 0;
	}
}

