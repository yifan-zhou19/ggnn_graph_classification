package <missing>;

public class GlobalMembers
{
	// zuoye.cpp : ??????????????

	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1;
		int len2;
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("NO");
			return 0;
		}
		for (int i = 0;i < len1 - 1;i++)
		{
			for (int j = 0;j < len1 - 1 - i;j++)
			{
				if (a.charAt(j) > a.charAt(j + 1))
				{
					char t;
					t = a.charAt(j + 1);
					a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j));
					a = tangible.StringFunctions.changeCharacter(a, j, t);
				}
			}
		}
			for (int i = 0;i < len1 - 1;i++)
			{
				for (int j = 0;j < len1 - 1 - i;j++)
				{
					if (b.charAt(j) > b.charAt(j + 1))
					{
						char t;
						t = b.charAt(j + 1);
						b = tangible.StringFunctions.changeCharacter(b, j + 1, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, t);
					}
				}
			}
		if (!strcmp(a,b))
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

		return 0;

	}
}

