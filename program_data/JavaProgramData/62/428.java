package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		String ch = new String(new char[500]);
		while (true)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, i, System.in.read());
			if (ch.charAt(i) == '\n')
			{
				break;
			}
			else if (ch.charAt(i) != ' ')
			{
				i++;
			}
			else if (ch.charAt(i - 1) != ' ')
			{
				i++;
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			System.out.print(ch.charAt(i));
		}
		return 0;
	}
}

