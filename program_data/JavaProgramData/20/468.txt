package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[13]);
		String s2 = new String(new char[4]);
		while (scanf("%s%s",s1,s2) != EOF)
		{
			int l;
			int i;
			int j;
			int k;
			l = s1.length();
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < l;j++)
				{
					if (s1.charAt(i) < s1.charAt(j))
					{
						break;
					}
				}
				if (j == l)
				{
					for (k = l + 3;k > i + 3;k--)
					{
						s1 = tangible.StringFunctions.changeCharacter(s1, k, s1.charAt(k - 3));
					}
					s1 = tangible.StringFunctions.changeCharacter(s1, l + 3, '\0');
					s1 = tangible.StringFunctions.changeCharacter(s1, i + 1, s2.charAt(0));
					s1 = tangible.StringFunctions.changeCharacter(s1, i + 2, s2.charAt(1));
					s1 = tangible.StringFunctions.changeCharacter(s1, i + 3, s2.charAt(2));
					break;
				}
			}
			System.out.printf("%s\n",s1);
		}
	}
}

