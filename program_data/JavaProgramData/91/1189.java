package <missing>;

public class GlobalMembers
{
	public static void friends(String c, int l)
	{
		int i;
		String p = new String(new char[100]);
		for (i = 0;i < l - 1;i++)
		{
			p = tangible.StringFunctions.changeCharacter(p, i, c[i] + c[i + 1]);
		}
		p = tangible.StringFunctions.changeCharacter(p, l - 1, c[l - 1] + c[0]);
		p = tangible.StringFunctions.changeCharacter(p, l, '\0');
		System.out.println(p);
	}
	public static void Main()
	{
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		int l = c.length();
		friends(c, l);
	}
}

