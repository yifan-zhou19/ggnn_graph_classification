package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int i;
		int j = 0;
		int p;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		if (a.charAt(i) != ' ')
		{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			j = j + 1;
			p = 0;
		}
		if ((a.charAt(i) == ' ') && p == 0)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			j = j + 1;
			p = 1;
		}
		}
		b = b.substring(0, j);
		System.out.printf("%s",b);
	return 0;
	}




}

