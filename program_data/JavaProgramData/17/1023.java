package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		int[] a = new int[101];
		int j;
		int l;
		while ((scanf("%s",s)) != EOF)
		{
			j = 0;
			System.out.println(s);
			l = s.length();
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == '(')
				{
					a[++j] = i;
				}
				else if (s.charAt(i) == ')')
				{
					if (j != 0)
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
						s = tangible.StringFunctions.changeCharacter(s, a[j], ' ');
						j--;
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '?');
					}
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
			}
			for (i = 1;i <= j;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, a[i], '$');
			}
			System.out.println(s);
		}
	}

}

