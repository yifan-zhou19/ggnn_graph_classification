package <missing>;

public class GlobalMembers
{
	public static int f(String a)
	{
		int i;
		int l;
		int l0;
		int b = 0;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (b < a[i])
			{
				b = a[i];
				l0 = i;
			}
		}
		return (l0);
	}
	public static void Main()
	{
		String s1 = new String(new char[11]);
		String s2 = new String(new char[4]);
		String s = new String(new char[14]);
		int j;
		int i;
		int l;
		int l0;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			l = s1.length();
			l0 = f(s1);
			for (i = 0;i <= l0;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s1.charAt(i));
			}
			for (j = 0,i = l0 + 1;j < 3;j++,i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s2.charAt(j));
			}
			for (j = l0 + 1,i = l0 + 4;j <= l;j++,i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s1.charAt(j));
			}
			System.out.printf("%s\n",s);
		}
	}
}

