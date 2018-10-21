package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[101]);
		String d = new String(new char[101]);
		int i;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if ((s.charAt(i) != 32) || (s.charAt(i + 1) != 32))
			{
				d = tangible.StringFunctions.changeCharacter(d, k++, s.charAt(i));
			}
		}
			d = tangible.StringFunctions.changeCharacter(d, k, '\0');
			System.out.printf("%s",d);
	}
}

