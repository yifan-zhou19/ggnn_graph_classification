package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int k;
		int j;
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		String s3 = new String(new char[15]);
		while (scanf("%s %s",s1,s2) != EOF)
		{
			l = s1.length();
			k = 0;
			for (j = 1;j < l;j++)
			{
				if (s1.charAt(k) < s1.charAt(j))
				{
					k = j;
				}
			}
			for (i = 0;i <= k;i++)
			{
			  s3 = tangible.StringFunctions.changeCharacter(s3, i, s1.charAt(i));
			}
			for (i = 1;i < 4;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, k + i, s2.charAt(i - 1));
			}
			for (i = 0;i <= l - k;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, k + 4 + i, s1.charAt(k + i + 1));
			}
			System.out.printf("%s\n",s3);
		}
	}
}

