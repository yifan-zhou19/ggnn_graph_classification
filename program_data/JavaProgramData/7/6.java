package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int n;
		int m;
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		n = s.length();
		m = a.length();

		for (i = 0,j = 0;i < m,j < n;j++)
		{
			if (a.charAt(i) == s.charAt(j))
			{
				p = j;
				i++;
				if (i == m)
				{
					break;
				}
			}
			else
			{
				i = 0;
			}
		}

		if (i == m)
		{
			for (i = 0;i < m;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, p - m + 1 + i, b.charAt(i));
			}
		}

		System.out.printf("%s\n",s);
	}
}

