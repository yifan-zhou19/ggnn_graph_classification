package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l1;
		int t;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char max;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			l1 = s1.length();
			for (i = 0,t = 0,max = s1.charAt(0);i < l1 - 1;i++)
			{
				if (s1.charAt(i) > max)
				{
					max = s1.charAt(i);
					t = i;
				}
			} //printf("%d\n\n",t);
			s1 = tangible.StringFunctions.changeCharacter(s1, l1 + 3, '\0');
			for (i = l1 + 2;i > t + 3;i--)
			{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i - 3));
			}
			for (i = 1;i <= 3;i++)
			{
			s1 = tangible.StringFunctions.changeCharacter(s1, t + i, s2.charAt(i - 1));
			}
			System.out.printf("%s\n",s1);

		}
	}
}

