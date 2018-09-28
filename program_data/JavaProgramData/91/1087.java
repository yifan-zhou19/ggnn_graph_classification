package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[101]);
		String c = new String(new char[101]);
		int i = 0;
		int n;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != 0)
		{
			if (s.charAt(i + 1) == 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(i) + s.charAt(0));
				c = c.substring(0, i + 1);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(i) + s.charAt(i + 1));
			}
			i++;
		}
		System.out.printf("%s",c);
	}
}

