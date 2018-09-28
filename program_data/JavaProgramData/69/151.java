package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		char x;
		int n1;
		int n2;
		int m;
		int i;
		int t = -1;
		int z = 0;
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
		n1 = a.length();
		n2 = b.length();
		if (n1 <= n2)
		{
			m = n2;
			for (i = 1;i <= n1;i++)
			{
				x = a.charAt(n1 - i) + b.charAt(n2 - i) - 48 + z;
				if (x > 57)
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x - 10);
					z = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x);
					z = 0;
				}
			}
			for (i = n1 + 1;i <= n2;i++)
			{
				x = b.charAt(n2 - i) + z;
				if (x > 57)
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x - 10);
					z = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x);
					z = 0;
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, m, '\0');
		}
		else
		{
			m = n1;
			for (i = 1;i <= n2;i++)
			{
				x = a.charAt(n1 - i) + b.charAt(n2 - i) - 48 + z;
				if (x > 57)
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x - 10);
					z = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x);
					z = 0;
				}
			}
			for (i = n2 + 1;i <= n1;i++)
			{
				x = a.charAt(n1 - i) + z;
				if (x > 57)
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x - 10);
					z = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, m - i, x);
					z = 0;
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, m, '\0');
		}

		if (z == 1)
		{
			System.out.print("1");
			System.out.printf("%s\n",c);
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if (c.charAt(i) != '0')
				{
					t = i;
					break;
				}
			}
			if (t != -1)
			{
				for (i = t;i < m;i++)
				{
					System.out.printf("%c",c.charAt(i));
				}
				System.out.print("\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}

		return 0;
	}



}

