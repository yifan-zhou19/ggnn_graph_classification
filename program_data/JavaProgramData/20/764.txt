package <missing>;

public class GlobalMembers
{
	public static void insert(String s1, String s2)
	{
		int i;
		int k = 0;
		int j;
		int l;
		String s = new String(new char[13]);
		l = s1.length();
		for (i = 1;i < l;i++)
		{
			if (s1[i].compareTo(s1[k]) > 0)
			{
				k = i;
			}
		}
		for (i = 0;i <= k;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s1[i]);
		}
		for (j = 0;j < 3;j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i + j, s2[j]);
		}
		for (j = i;j < l;j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, j + 3, s1[j]);
		}
		s = tangible.StringFunctions.changeCharacter(s, j + 3, '\0');
		System.out.printf("%s\n",s);
	}
	public static void Main()
	{
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		while (scanf("%s%s",s1,s2) != EOF)
		{
			insert(s1, s2);
		}
	}
}

