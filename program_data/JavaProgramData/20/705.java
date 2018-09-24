package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int max;
		int l;
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		String s3 = new String(new char[20]);
		while (scanf("%s%s",s1,s2) != EOF)
		{
			max = s1.charAt(0);
			for (i = 1;i < s1.length();i++)
			{
				if (s1.charAt(i) > max)
				{
				max = s1.charAt(i);
				}
			}
			for (i = 0;i < s1.length();i++)
			{
				if (s1.charAt(i) == max)
				{
					l = i;
					break;
				}
			}
			for (i = 0;i <= l;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, i, s1.charAt(i));
			}
			for (i = 0;i < s2.length();i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, i + l + 1, s2.charAt(i));
			}
			for (i = 0;i < s1.length() - l - 1;i++)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, l + s2.length() + 1 + i, s1.charAt(l + i + 1));
			}
			for (i = 0;i < s1.length() + s2.length();i++)
			{
				System.out.printf("%c",s3.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

