package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[14]);
		String s2 = new String(new char[4]);
		char s;
		String s3 = new String(new char[14]);
		int n;
		int m;
		int t;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			for (n = 1,s = s1.charAt(0),m = 0;s1.charAt(n) != '\0';n++)
			{
				if (s1.charAt(n) > s)
				{
					m = n;
					s = s1.charAt(n);
				}
			}
			for (n = m + 1,t = 0;s1.charAt(n) != '\0';n++,t++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, t, s1.charAt(n));
			}
			s3 = tangible.StringFunctions.changeCharacter(s3, t, '\0');
			for (n = 1;n <= 3;n++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, m + n, s2.charAt(n - 1));
			}
			s1 = tangible.StringFunctions.changeCharacter(s1, m + n, '\0');
			System.out.printf("%s%s\n",s1,s3);
		}
		return 0;
	}
}

