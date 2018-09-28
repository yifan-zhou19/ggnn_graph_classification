package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		String parlindrome = new String(new char[500]);
		int len;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (int i = 2 ; i <= len ; i++)
		{
			for (int j = 0 ; j <= len - i ; j++)
			{
				int k;
				for (k = 0 ; k < i ; k++)
				{
					if (str.charAt(j + k) == str.charAt(j + i - 1 - k))
					{
						parlindrome = tangible.StringFunctions.changeCharacter(parlindrome, k, str.charAt(j + k));
					}
					else
					{
						break;
					}
				}
				parlindrome = tangible.StringFunctions.changeCharacter(parlindrome, k, '\0');
				if (k == i)
				{
					System.out.print(parlindrome);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

