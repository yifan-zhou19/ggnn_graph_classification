package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String c = new String(new char[200]);
		int n;
		int i;
		int j;
		int al;
		int bl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				scanf("\n");
			}
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			al = a.length();
			bl = b.length();
			for (j = 0;j <= bl - 1;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, al - 1 - j, b.charAt(bl - 1 - j));
			}
			for (j = 0;j < al - bl;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, 48);
			}
			b = b.substring(0, al);
			for (j = al - 1;j >= 0;j--)
			{
				if (a.charAt(j) >= b.charAt(j))
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) - b.charAt(j) + 48);
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) - b.charAt(j) + 58);
					if (a.charAt(j - 1) == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, j - 1, 57);
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
					}
				}
			}
			c = c.substring(0, al);
			System.out.println(c);
		}

	}

}

