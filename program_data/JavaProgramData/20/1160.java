package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[14]);
		String s2 = new String(new char[4]);
		char t;
		int n;
		int m;
		int i;
		int j;
		int k;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			m = s1.length();
			n = s2.length();
			j = 0;
			t = s1.charAt(0);
			for (i = 1;i < m;i++)
			{
				if (s1.charAt(i) > t)
				{
					j = i;
					t = s1.charAt(i);
				}
			}
			for (i = 0;i <= m - j - 1;i++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, n + m - i, s1.charAt(m - i));
			}
			for (i = 0;i < n;i++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j + 1 + i, s2.charAt(i));
			}
			for (i = 0;i < m + n;i++)
			{
			System.out.printf("%c",s1.charAt(i));
			}
	System.out.print("\n");
		}

	}

}

