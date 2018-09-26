package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "\0";
		final String sub = "\0";
		final String re = "\0";
		String t = new String(new char[300]);
		final String pre = "\0";
		final String post = "\0";
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < 299;j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, j, '\0');
				}
				for (j = 0;j < sub.length();j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, j, str.charAt(i + j));
				}
				if (strcmp(t,sub) == 0)
				{
					for (j = 0;j < i;j++)
					{
						pre = tangible.StringFunctions.changeCharacter(pre, j, str.charAt(j));
					}
					for (j = i + sub.length();j < str.length();j++)
					{
						post = tangible.StringFunctions.changeCharacter(post, j - i - sub.length(), str.charAt(j));
					}
					System.out.printf("%s%s%s\n",pre,re,post);
					return 0;
				}

			}
		}
		System.out.printf("%s\n",str);
		return 0;
	}
}

