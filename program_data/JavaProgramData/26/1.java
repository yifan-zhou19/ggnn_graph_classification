package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[101]);
		String res = new String(new char[101]);
		char last;
		int len;
		int i;
		int j = 0;
		input = new Scanner(System.in).nextLine();
		last = input.charAt(0);
		len = input.length();
		for (i = 0;i < len;i++)
		{
			if (last == input.charAt(i) && last == ' ')
			{
				continue;
			}
			else
			{
				res = tangible.StringFunctions.changeCharacter(res, j++, input.charAt(i));
			}
			last = input.charAt(i);
		}
		res = tangible.StringFunctions.changeCharacter(res, j, '\0');
		System.out.printf("%s\n",res);

		return 0;
	}
}

