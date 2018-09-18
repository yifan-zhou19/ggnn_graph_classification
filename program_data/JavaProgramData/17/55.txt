package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int p;
		String str = new String(new char[10001]);
		String a = new String(new char[2000]);
		String b = new String(new char[2000]);
		String c = new String(new char[2000]);
		while (gets(str))
		{
			n = str.length();
			a = str;
			for (i = 0;i < n;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, ' ');
			}
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == ')')
				{
					p = 0;
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, 'a');
							a = tangible.StringFunctions.changeCharacter(a, j, 'a');
							p = 1;
							break;
						}
					}
					if (p != 1)
					{
						c = tangible.StringFunctions.changeCharacter(c, i, '?');
					}
				}
			}
			for (i = n - 1;i >= 0;i--)
			{
				if (a.charAt(i) == '(')
				{
					p = 0;
					for (j = i;j < n;j++)
					{
						if (a.charAt(j) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, 'a');
							a = tangible.StringFunctions.changeCharacter(a, j, 'a');
							p = 1;
							break;
						}
					}
					if (p != 1)
					{
						c = tangible.StringFunctions.changeCharacter(c, i, '$');
					}
				}
			}
			System.out.println(str);
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
			System.out.print("\n");
		}
	}

}

