package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[555]);

	public static int f(int i,int j)
	{
		int k;
		if (j == 2)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else if (j == 3)
		{
			if (s.charAt(i) == s.charAt(i + 2))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			for (k = 0;k <= j / 2 - 1;k++)
			{
				if (s.charAt(i + k) != s.charAt(i + j - 1 - k))
				{
					break;
				}
			}
			if (k == j / 2)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int len;

		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = len;i > 0;i--)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i - 1));
		}
		s = null;

		for (j = 2;j <= len;j++)
		{
			for (i = 1;i <= len + 1 - j;i++)
			{
				if (f(i, j) == 1)
				{
					for (k = i;k < i + j - 1;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
					System.out.printf("%c\n",s.charAt(i + j - 1));
				}
			}
		}

				return 0;
	}
}

