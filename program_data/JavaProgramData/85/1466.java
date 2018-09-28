package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int j = 0;
		int l;
		int c = 0;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= 99;j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
			}
			c = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if ((s.charAt(0) >= '0') && (s.charAt(0) <= '9'))
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;j <= l - 1;j++)
				{
					if (((s.charAt(j) >= '0') && (s.charAt(j) <= '9')) || ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')) || (s.charAt(j) == '_'))
					{
						c += 1;
					}
				}
				if (c == l)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
	}
}

