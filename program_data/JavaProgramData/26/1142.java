package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		String getline = new String(new char[MAX]);
		int i = 0;
		int ex = IN;
		int line = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ')
			{
				ex = IN;
				getline = tangible.StringFunctions.changeCharacter(getline, i, c);
				++i;
			}
			else if ((c == ' ') && (ex == IN))
			{
				getline = tangible.StringFunctions.changeCharacter(getline, i, c);
				++i;
				ex = OUT;
			}
			else if ((c == ' ') && (ex == OUT))
			{
				ex = OUT;
			}
		}
		line = i;
		i = 0;

		for (i = 0;i < line;++i)
		{
			System.out.print(getline.charAt(i));
		}

	}

}

