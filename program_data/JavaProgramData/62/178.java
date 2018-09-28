package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[2000]);
		s = new Scanner(System.in).nextLine();
	   String ss = new String(new char[2000]);
	   int i;
	   int j = 0;
	   for (i = 0;i < s.length();i++)
	   {
			if (!((s.charAt(i) == 32) && (s.charAt(i + 1) == 32)))
			{
				ss = tangible.StringFunctions.changeCharacter(ss, j++, s.charAt(i));
			}

	   }
	   ss = tangible.StringFunctions.changeCharacter(ss, j, '\0');
		System.out.printf("%s",ss);
		System.in.read();
		System.in.read();

	}
}

