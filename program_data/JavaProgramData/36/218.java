package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int c;
		int i;
		int j;
		String s1 = new String(new char[200]);
		String s2 = new String(new char[200]);
		c = 0;
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
		m = s1.length();
		n = s2.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < m;j++)
				{
					if (s2.charAt(j) == s1.charAt(i))
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, j, ' ');
						c = 0;
						break;
					}
					else
					{
						c = 1;
					}
				}
			}
				if (c == 0)
				{
				System.out.print("YES");
				}
			else
			{
				System.out.print("NO");
			}
		}

	}

}

