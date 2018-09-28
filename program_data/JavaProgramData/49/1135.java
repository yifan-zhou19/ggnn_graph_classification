package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		int i;
		int j;
		int k = 0;
		int l = 0;
		int m;
		int len;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		j = 1;
		while (j <= len - 1)
		{
			for (i = k;i <= len - j - 1;i++)
			{
				for (m = 0;m <= j;m++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, m, s.charAt(i + m));
					s2 = tangible.StringFunctions.changeCharacter(s2, m, s.charAt(i + j - m));
				}
				s1 = tangible.StringFunctions.changeCharacter(s1, m, '\0');
				s2 = tangible.StringFunctions.changeCharacter(s2, m, '\0');
				if (strcmp(s1,s2) == 0)
				{
					System.out.printf("%s\n",s1);
				}
			}
			k++;
			if (k = len - j)
			{
				k = 0;
				j++;
			}
		}
		return 0;
	}
}

