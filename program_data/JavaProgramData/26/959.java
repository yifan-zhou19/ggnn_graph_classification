package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String g = new String(new char[100]);
		String r = new String(new char[100]);
		g = new Scanner(System.in).nextLine();
		int y = 0;
		int d = g.length();
		for (int i = 0;i < d;i++)
		{
			if (g.charAt(i) != 32)
			{
				r = tangible.StringFunctions.changeCharacter(r, y, g.charAt(i));
				y++;
			}
			else if (g.charAt(i + 1) != 32)
			{
				r = tangible.StringFunctions.changeCharacter(r, y, g.charAt(i));
				y++;
			}
		}
		for (int m = 0;m < (y);m++)
		{
			System.out.printf("%c",r.charAt(m));
		}


		return 0;
	}
}

