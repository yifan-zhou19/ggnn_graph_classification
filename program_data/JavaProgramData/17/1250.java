package <missing>;

public class GlobalMembers
{
	public static final int maxn = 110;

	public static int Main()
	{
		String str = new String(new char[maxn]);
		String str2 = new String(new char[maxn]);
		while (scanf("%s",str) != EOF)
		{
			int len = str.length();
			for (int i = 0 ;i < len; i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str.charAt(i));
			}
			for (int i = 0; i < len; i++)
			{
				if (str.charAt(i) == ')')
				{
					for (int j = i - 1; j >= 0; j--)
					{
						if (str.charAt(j) == '(')
						{
							str = tangible.StringFunctions.changeCharacter(str, j, str[i] = ' ');
							break;
						}
					}
				}
			}
			for (int i = 0 ; i < len; i++)
			{
				System.out.printf("%c",str2.charAt(i));
			}
			System.out.print("\n");
			for (int i = 0; i < len; i++)
			{
				if (str.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (str.charAt(i) == ')')
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

