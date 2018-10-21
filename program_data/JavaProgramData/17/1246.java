package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int x = 0;
		int y;
		int z;
		String c = new String(new char[105]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			b = new Scanner(System.in).nextLine();
			m = b.length();
			for (j = 0;j < m;j++)
			{
			if (b[j] == '(')
			{
					c = tangible.StringFunctions.changeCharacter(c, j, '$');
			}
			else if (b[j] == ')')
			{
					c = tangible.StringFunctions.changeCharacter(c, j, '?');
			}
			else if (b[j] != '(' && b[j] != ')')
			{
					c = tangible.StringFunctions.changeCharacter(c, j, ' ');
			}
			}
			y = 0;
			for (j = 0;j < m;j++)
			{
				if (c.charAt(j) == '?')
				{
					z = 0;
					y++;
					for (x = j;x >= 0;x--)
					{
						if (c.charAt(x) == '$')
						{
							z++;
							if (x == j - 1 || y == z)
							{
							y--;
							c = tangible.StringFunctions.changeCharacter(c, x, ' ');
							c = tangible.StringFunctions.changeCharacter(c, j, ' ');
							break;
							}
						}
					}
					if (x == -1)
					{
						y--;
						c = tangible.StringFunctions.changeCharacter(c, j, '?');
					}
				}
			}
			for (j = 0;j < m;j++)
			{
			   System.out.printf("%c",b[j]);
			}
		   System.out.print("\n");
			for (j = 0;j < m;j++)
			{
			   System.out.printf("%c",c.charAt(j));
			}
		   System.out.print("\n");
		}
		return 0;
	}
}

