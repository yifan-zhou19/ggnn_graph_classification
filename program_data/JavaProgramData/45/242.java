package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String c = new String(new char[50]);
		int len1;
		int len2;
		int i;
		int j;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		w = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len2 = w.length();
		len1 = s.length();
		for (i = 0;i < len2;i++)
		{
			for (j = i;j < i + len1;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j - i, w.charAt(j));
			}
			c = tangible.StringFunctions.changeCharacter(c, j - i, '\0');
			if (strcmp(s,c) == 0)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}

