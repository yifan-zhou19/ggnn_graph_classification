package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[15]);
		String s2 = new String(new char[4]);
		char max;
		int i;
		int j;
		int len;
		int k;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			len = s1.length();
			k = 0;
			max = s1.charAt(0);
			for (j = 1;j < len;j++)
			{
				if (max < s1.charAt(j))
				{
					max = s1.charAt(j);
					k = j;
				}
			}
			for (j = len + 2;j > k + 3;j--)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s1.charAt(j - 3));
			}
			for (j = k + 1,i = 0;j < k + 4;j++,i++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s2.charAt(i));
			}
			s1 = tangible.StringFunctions.changeCharacter(s1, len + 3, '\0');
			System.out.println(s1);
		}
		return 0;
	}

}

