package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1001]);
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		final String ans = "";
		int i;
		int j;
		int k;
		int p;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int l;
		int la;
		int lb;
		l = s.length();
		la = a.length();
		lb = b.length();
		int index;
		index = 0;
		for (i = 0;i < l;i++)
		{
			k = 0;
			for (j = 0;j < la;j++)
			{
				if (s.charAt(i + j) != a.charAt(j))
				{
					k = 1;
				}
			}
			if (((i + la) < l) && (s.charAt(i + la) != ' '))
			{
				k = 1;
			}
			if ((i > 0) && (s.charAt(i - 1) != ' '))
			{
				k = 1;
			}
			if (k == 0)
			{
				for (p = 0;p < lb;p++)
				{
					ans = tangible.StringFunctions.changeCharacter(ans, p + index, b.charAt(p));
				}
				index = index + lb - 1;
				i = i + la - 1;
			}
			if (k > 0)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, index, s.charAt(i));
			}
			index++;
		}
		System.out.printf("%s\n",ans);
		return 0;
	}
}

