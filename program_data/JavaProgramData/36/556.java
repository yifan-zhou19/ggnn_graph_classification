package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char m;
		int a;
		int l;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l = s1.length();
		if (l != s2.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i <= l - 1;i++)
			{
				for (j = i;j <= l - 1;j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						m = s2.charAt(i);
						s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(j));
						s2 = tangible.StringFunctions.changeCharacter(s2, j, m);
					}
				}
					if (s1.charAt(i) != s2.charAt(i))
					{
						System.out.print("NO");
						break;
					}
			}
			if (i == l)
			{
				System.out.print("YES");
			}
		}
	}
}

