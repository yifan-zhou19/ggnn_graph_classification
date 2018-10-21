package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[200]);
		String out = new String(new char[200]);
		int len;
		int i;
		int j = 0;
		in = new Scanner(System.in).nextLine();
		len = in.length();
		for (i = 0;i < len;i++)
		{
			if (in.charAt(i) != ' ')
			{
				out = tangible.StringFunctions.changeCharacter(out, j++, in.charAt(i));
			}
			else
			{
				if (in.charAt(i + 1) != ' ')
				{
					out = tangible.StringFunctions.changeCharacter(out, j++, ' ');
				}
				else
				{
					continue;
				}
			}
		}
		out = tangible.StringFunctions.changeCharacter(out, j, '\0');
		System.out.println(out);
		return 0;
	}
}

