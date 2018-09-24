package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String s = new String(new char[1000]);
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(s);
			System.out.print("\n");
			k = s.length();
			for (i = 0;i < k;++i)
			{
				if (s.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;--j)
					{
						if (s.charAt(j) == '(')
						{
							s = tangible.StringFunctions.changeCharacter(s, i, s[j] = ' ');
							break;
						}
					}
				}
			}
			for (i = 0;i < k;++i)
			{
				if (s.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (s.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

