package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);

		int s1;
		int i;
		int j;
		int s2;
		int p = 1;
		for (i = 0;i < 100;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b[i] = '\0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		s1 = a.length();
		s2 = b.length();
		if (s1 != s2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < s1;i++)
			{
				for (j = 0;j < s1;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '\0');
						b = tangible.StringFunctions.changeCharacter(b, j, '\0');
					}
				}
			}
			for (i = 0;i < s1;i++)
			{
				if (a.charAt(i) != '\0')
				{
					p = 0;
				}
			}
			if (p != 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}

}

