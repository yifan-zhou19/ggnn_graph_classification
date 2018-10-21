package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int j;
		int p = 0;
		int x;
		int y;
		for (i = 0;i <= 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == ' ')
			{
				break;
			}
		}
		for (i = 0;i <= 100;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) == '\n')
			{
				break;
			}
		}
		x = a.length() - 1;
		y = b.length() - 1;
		if (x == y)
		{
			for (i = 0;i <= x;i++)
			{
				p = 0;
				for (j = 0;j <= y;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						p = 1;
						b = tangible.StringFunctions.changeCharacter(b, j, ' ');
						break;
					}
				}
				if (p == 0)
				{
					break;
				}
			}
		}
		if (p == 1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

