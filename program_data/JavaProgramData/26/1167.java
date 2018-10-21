package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int n;
		String f = new String(new char[101]);
		String g = new String(new char[101]);
		for (i = 0;i < 101;i++)
		{
			g = tangible.StringFunctions.changeCharacter(g, i, '\0');
		}
		f = new Scanner(System.in).nextLine();
		n = f.length();
		for (i = 0,t = 0;i < n;i++)
		{
			if (f.charAt(i) != ' ')
			{
				g = tangible.StringFunctions.changeCharacter(g, t, f.charAt(i));
				t++;
			}
			else
			{
				if (f.charAt(i + 1) != ' ')
				{
					g = tangible.StringFunctions.changeCharacter(g, t, ' ');
					t++;
				}
			}
		}
		System.out.printf("%s",g);
		return 0;
	}

}

