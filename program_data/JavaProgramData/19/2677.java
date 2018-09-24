package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[200]);
		String result = new String(new char[200]);
		String f = new String(new char[200]);
		String r = new String(new char[200]);

		ch = new Scanner(System.in).nextLine();
		f = ConsoleInput.readToWhiteSpace(true).charAt(0);
		r = ConsoleInput.readToWhiteSpace(true).charAt(0);


		ch = ch.substring(0, ch.length() + 1);
		ch = tangible.StringFunctions.changeCharacter(ch, ch.length(), ' ');

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,200);
		int last = 0;
		for (int i = 0;i < ch.length();i++)
		{
			if (ch.charAt(i) == ' ')
			{
				ch = ch.substring(0, i);
				String p = ch.Substring(last);
				if (strcmp(p,f) == 0)
				{
					result = String.format("%s %s", result, r);
				}
				else
				{
					result = String.format("%s %s", result, p);
				}
				last = i + 1;
				ch = tangible.StringFunctions.changeCharacter(ch, i, ' ');
			}
		}
		System.out.print(result.Substring(1));
		System.out.print("\n");
		return 0;
	}
}

