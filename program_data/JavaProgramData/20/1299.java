package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		String t = new String(new char[20]);
		int max;
		int i;
		int p;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			max = 0;
			for (i = 0;i < s1.length();i++)
			{
				if (s1.charAt(i) > max)
				{
					max = s1.charAt(i);
					p = i;
				}
			}
			t = s1.Substring(p) + 1;
			s1 = tangible.StringFunctions.changeCharacter(s1, p + 1, '\0');
			s1 += s2;
			s1 += t;
			System.out.println(s1);
		}
		return 0;
	}

}

